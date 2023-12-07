package sistemaBibliotecaESoficial;

import java.text.SimpleDateFormat;

public class Impressoes {
	public static void usuarioNaoEncontrado() {
		System.out.println("Código de usuário inválido!");
	}
	
	public static void livroNaoEncontrado() {
		System.out.println("Código de livro inválido!");
	}
	
	public static void emprestimoEfetuado() {
		System.out.println("Empréstimo efetuado com sucesso!");
	}
	
	public static void falhaEmprestimo() {
		System.out.println("Não foi possível efetuar o empréstimo!");
	}
	
	public static void falhaDevolucao() {
		System.out.println("Não foi possível efetuar a devolução!");
	}
	
	public static void devolucaoEfetuada() {
		System.out.println("Devolução efetuada com sucesso!");
	}
	
	public static void falhaReserva() {
		System.out.println("Não foi possível efetuar a reserva!");
	}
	
	public static void reservaEfetuada() {
		System.out.println("Reserva efetuada com sucesso!");
	}
	
	public static void registroObservadorEfetuado() {
		System.out.println("Observador registrado com sucesso!");
	}
	
	public static void sucessoEmprestimo(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.emprestimoEfetuado();
	}
	
	public static void usuarioDevedor(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário possui devolução de um livro em atraso.");
	}
	
	public static void exemplaresIndisponiveis(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Não existe exemplar do livro disponível.");
	}
	
	public static void limiteEmprestimo(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário atingiu o seu limite de empréstimos.");
	}
	
	public static void emprestimoDuplicado(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário já possui o livro em seus empréstimos.");
	}
	
	public static void totalmenteReservado(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Todos os exemplares estão reservados.");
	}
	
	public static void sucessoDevolucao(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.devolucaoEfetuada();
	}
	
	public static void naoPossuilivroEmprestimo(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaDevolucao();
		System.out.println("Motivo: Usuário não possui o livro em seus empréstimos.");
	}
	
	public static void sucessoReserva(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.reservaEfetuada();
	}
	
	public static void limiteReserva(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaReserva();
		System.out.println("Motivo: Usuário atingiu o seu limite de reservas.");
	}
	
	public static void sucessoRegistroObservador(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.registroObservadorEfetuado();
	}
	
	public static void consultaLivro(Livro livro) {
		System.out.println("Título do livro: " + livro.getTitulo());
		System.out.println("Quantidade de reservas: " + livro.getReservasAtuais().size());
		
		if (livro.getReservasAtuais().size() > 0) {
			System.out.println("Nome dos usuários com reserva pendente para este livro: ");
			System.out.println();
			
			for (Reserva reservaAtual : livro.getReservasAtuais()) {
				System.out.println("Nome do usuário: " + reservaAtual.getUsuario().getNome());
			}
		}
		
		System.out.println("Exemplares: ");
		System.out.println();
		
		for (Exemplar exemplarAtual : livro.getExemplares()) {
			System.out.println("Código: " + exemplarAtual.getCodigo());
			
			if (exemplarAtual.isDisponibilidade()) {
				System.out.println("Status: Disponível");
			} else {
				System.out.println("Status: Indisponível");
				System.out.println("Usuário em posse do exemplar: " + exemplarAtual.getEmprestimoAtual().getUsuario().getNome());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(exemplarAtual.getEmprestimoAtual().getDate());
				System.out.println("Data do empréstimo: " + data);
				System.out.println("Tempo previsto para devolução: " + exemplarAtual.getEmprestimoAtual().getUsuario().getLimiteEmprestimo() + " dias");
			}
			System.out.println();
		}
	}
}
