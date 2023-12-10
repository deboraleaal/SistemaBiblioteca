package sistemaBibliotecaESoficial;

import java.util.ArrayList;

public class Biblioteca {
	private static Biblioteca instancia;
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	
	private Biblioteca () {
		
	}
	
	public static Biblioteca getInstancia() {
		if (instancia == null) {
			instancia = new Biblioteca();
		}
		
		return instancia;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	public Usuario encontrarUsuarioPorCodigo(String codigoUsuario) {
		for (Usuario usuarioAtual : this.usuarios) {
			if (usuarioAtual.getCodigo().equals(codigoUsuario)) {
				return usuarioAtual;
			}
		}
		
		return null;
	}
	
	public Livro encontrarLivroPorCodigo(String codigoLivro) {
		for (Livro livroAtual : this.livros) {
			if (livroAtual.getCodigo().equals(codigoLivro)) {
				return livroAtual;
			}
		}
		
		return null;
	}
	
	public void fazerEmprestimo(String codigoUsuario, String codigoLivro) {
		Usuario usuario = this.encontrarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Livro livro = this.encontrarLivroPorCodigo(codigoLivro);
		
		if (livro == null) {
			Impressoes.livroNaoEncontrado();
			return;
		}
		
		IVerificadorEmprestimo verificador = usuario.getVerificador();
		
		if (verificador.verificarPossibilidadeEmprestimo(livro, usuario)) {
			for (Exemplar exemplarAtual : livro.getExemplares()) {
				if (exemplarAtual.isDisponibilidade()) {
					exemplarAtual.setDisponibilidade(false);
					Emprestimo emprestimo = Fabrica.criarEmprestimo(exemplarAtual, usuario);
					exemplarAtual.setEmprestimoAtual(emprestimo);
					usuario.getEmprestimos().add(emprestimo);
					
					for (Reserva reservaAtual : livro.getReservasAtuais()) {
						if (reservaAtual.getUsuario().getCodigo().equals(usuario.getCodigo())) {
							livro.getReservasAtuais().remove(reservaAtual);
							break;
						}
					}
					
					for (Reserva reservaAtual : usuario.getReservas()) {
						if (reservaAtual.getLivro().getCodigo().equals(codigoLivro)) {
							usuario.getReservasPassados().add(reservaAtual);
							usuario.getReservas().remove(reservaAtual);
							break;
						}
					}
					
					Impressoes.sucessoEmprestimo(usuario, livro);
					break;
				}
			}
		}
	}
	
	public void fazerDevolucao(String codigoUsuario, String codigoLivro) {
		Usuario usuario = this.encontrarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Livro livro = this.encontrarLivroPorCodigo(codigoLivro);
		
		if (livro == null) {
			Impressoes.livroNaoEncontrado();
			return;
		}
		
		for (Emprestimo emprestimoAtual : usuario.getEmprestimos()) {
			if (emprestimoAtual.getExemplar().getLivro().getCodigo().equals(codigoLivro)) {
				for (Exemplar exemplarAtual : livro.getExemplares()) {
					if (exemplarAtual.getCodigo().equals(emprestimoAtual.getExemplar().getCodigo())) {
						exemplarAtual.setDisponibilidade(true);
						exemplarAtual.setEmprestimoAtual(null);
						break;
					}
				}
				
				usuario.getEmprestimosPassados().add(emprestimoAtual);
				usuario.getEmprestimos().remove(emprestimoAtual);
				Impressoes.sucessoDevolucao(usuario, livro);
				return;
			}
		}
		
		Impressoes.naoPossuilivroEmprestimo(usuario, livro);
	}
	
	public void fazerReserva(String codigoUsuario, String codigoLivro) {
		Usuario usuario = this.encontrarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Livro livro = this.encontrarLivroPorCodigo(codigoLivro);
		
		if (livro == null) {
			Impressoes.livroNaoEncontrado();
			return;
		}
		
		if (usuario.getReservas().size() <= 2) {
			Reserva reserva = Fabrica.criarReserva(livro, usuario);
			livro.getReservasAtuais().add(reserva);
			usuario.getReservas().add(reserva);
			
			if (livro.getReservasAtuais().size() >= 2) {
				livro.notificarObservadores();
			}
			
			Impressoes.sucessoReserva(usuario, livro);
		} else {
			Impressoes.limiteReserva(usuario, livro);
		}
	}
	
	public void registrarObservador(String codigoUsuario, String codigoLivro) {
		Usuario usuario = this.encontrarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Livro livro = this.encontrarLivroPorCodigo(codigoLivro);
		
		if (livro == null) {
			Impressoes.livroNaoEncontrado();
			return;
		}
		
		livro.registraObservador((IObservador) usuario);
		Impressoes.sucessoRegistroObservador(usuario, livro);
	}
	
	public void consultarLivro(String codigoLivro) {
		Livro livro = this.encontrarLivroPorCodigo(codigoLivro);
		
		if (livro == null) {
			Impressoes.livroNaoEncontrado();
			return;
		}
		
		Impressoes.consultaLivro(livro);
	}
	
	public void consultarUsuario(String codigoUsuario) {
		Usuario usuario = this.encontrarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Impressoes.consultaUsuario(usuario);
	}
	
	public void consultarNotificacoes(String codigoUsuario) {
		Usuario usuario = this.encontrarUsuarioPorCodigo(codigoUsuario);
		
		if (usuario == null) {
			Impressoes.usuarioNaoEncontrado();
			return;
		}
		
		Impressoes.consultaNotificacoes(usuario);
	}
}
