package sistemaBibliotecaESoficial;

import java.text.SimpleDateFormat;

public class Impressoes {
	public static void inicioPrograma() {
		System.out.println("Bem vindo ao sistema de biblioteca!\n");
	}
	
	public static void opcoesPrograma() {
		System.out.println("Comandos disponíveis:\n");
		System.out.println("emp - Efetuar um empréstimo");
		System.out.println("dev - Efetuar uma devolução");
		System.out.println("res - Efetuar uma reserva");
		System.out.println("obs - Registrar um observador");
		System.out.println("liv - Consultar dados de um livro");
		System.out.println("usu - Consultar dados de um usuário");
		System.out.println("ntf - Consultar notificações de um usuário");
		System.out.println("sai - Sair do programa\n");
		System.out.println("Digite um dos comandos: ");
	}
	
	public static void entradaInvalida() {
		System.out.println("Entrada inválido!\n");
	}
	
	public static void comandoInexistente() {
		System.out.println("Comando inexistente!\n");
	}
	
	public static void usuarioNaoEncontrado() {
		System.out.println("Código de usuário inválido!\n");
	}
	
	public static void livroNaoEncontrado() {
		System.out.println("Código de livro inválido!\n");
	}
	
	public static void emprestimoEfetuado() {
		System.out.println("Empréstimo efetuado com sucesso!\n");
	}
	
	public static void falhaEmprestimo() {
		System.out.println("Não foi possível efetuar o empréstimo!");
	}
	
	public static void falhaDevolucao() {
		System.out.println("Não foi possível efetuar a devolução!");
	}
	
	public static void devolucaoEfetuada() {
		System.out.println("Devolução efetuada com sucesso!\n");
	}
	
	public static void falhaReserva() {
		System.out.println("Não foi possível efetuar a reserva!");
	}
	
	public static void reservaEfetuada() {
		System.out.println("Reserva efetuada com sucesso!\n");
	}
	
	public static void registroObservadorEfetuado() {
		System.out.println("Observador registrado com sucesso!\n");
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
		System.out.println("Motivo: Usuário possui devolução de um livro em atraso.\n");
	}
	
	public static void exemplaresIndisponiveis(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Não existe exemplar do livro disponível.\n");
	}
	
	public static void limiteEmprestimo(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário atingiu o seu limite de empréstimos.\n");
	}
	
	public static void emprestimoDuplicado(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário já possui o livro em seus empréstimos.\n");
	}
	
	public static void totalmenteReservado(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Todos os exemplares estão reservados.\n");
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
		System.out.println("Motivo: Usuário não possui o livro em seus empréstimos.\n");
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
		System.out.println("Motivo: Usuário atingiu o seu limite de reservas.\n");
	}
	
	public static void sucessoRegistroObservador(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.registroObservadorEfetuado();
	}
	
	public static void consultaLivro(Livro livro) {
		System.out.println("Título do livro: " + livro.getTitulo());
		System.out.println("Autor(res): " + livro.getAutores());
		System.out.println("Edição: " + livro.getEdicao() + "ª edição");
		System.out.println("Editora: " + livro.getEditora());
		System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
		
		if (livro.getReservasAtuais().size() > 0) {
			System.out.println("Quantidade de reservas: " + livro.getReservasAtuais().size());
			System.out.println("Nome dos usuários com reserva pendente para este livro:\n");
			
			for (Reserva reservaAtual : livro.getReservasAtuais()) {
				System.out.println("Nome do usuário: " + reservaAtual.getUsuario().getNome());
			}
		}
		
		if (livro.getExemplares().isEmpty()) {
			System.out.println("Este livro não possui exemplares na biblioteca.\n");
		} else {
			System.out.println("Exemplares:\n");
			
			for (Exemplar exemplarAtual : livro.getExemplares()) {
				System.out.println("Código: " + exemplarAtual.getCodigo());
				
				if (exemplarAtual.isDisponibilidade()) {
					System.out.println("Status: Disponível\n");
				} else {
					System.out.println("Status: Indisponível");
					System.out.println("Usuário em posse do exemplar: " + exemplarAtual.getEmprestimoAtual().getUsuario().getNome());
					String data = new SimpleDateFormat("dd/MM/yyyy").format(exemplarAtual.getEmprestimoAtual().getDate());
					System.out.println("Data do empréstimo: " + data);
					System.out.println("Tempo previsto para devolução: " + exemplarAtual.getEmprestimoAtual().getUsuario().getTempoEmprestimo() + " dias\n");
				}
			}
		}
	}
	
	public static void consultaUsuario(Usuario usuario) {
		System.out.println("Nome do usuário: " + usuario.getNome() + "\n");
		
		if (usuario.getEmprestimos().size() > 0) {
			System.out.println("Empréstimos em curso:\n");
			for (Emprestimo emprestimoAtual : usuario.getEmprestimos()) {
				System.out.println("Título do livro: " + emprestimoAtual.getExemplar().getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(emprestimoAtual.getDate());
				System.out.println("Data do empréstimo: " + data);
				System.out.println("Status: Em curso");
				System.out.println("Tempo previsto para devolução: " + emprestimoAtual.getUsuario().getLimiteEmprestimo() + " dias\n");
			}
		} else {
			System.out.println("Usuário não possui empréstimos em curso.\n");
		}
		
		if (usuario.getEmprestimosPassados().size() > 0) {
			System.out.println("Empréstimos finalizados:\n");
			for (Emprestimo emprestimoAtual : usuario.getEmprestimosPassados()) {
				System.out.println("Título do livro: " + emprestimoAtual.getExemplar().getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(emprestimoAtual.getDate());
				System.out.println("Data do empréstimo: " + data);
				System.out.println("Status: Finalizado");
				System.out.println("Devolução já efetuada!\n");
			}
		} else {
			System.out.println("Usuário não possui empréstimos finalizados.\n");
		}
		
		if (usuario.getReservas().size() > 0) {
			System.out.println("Reservas em curso:\n");
			for (Reserva reservaAtual : usuario.getReservas()) {
				System.out.println("Título do livro: " + reservaAtual.getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(reservaAtual.getDate());
				System.out.println("Data da reserva: " + data);
				System.out.println("Status: Em curso\n");
			}
		} else {
			System.out.println("Usuário não possui reservas em curso.\n");
		}

		if (usuario.getReservasPassados().size() > 0) {
			System.out.println("Reservas finalizadas:\n");
			for (Reserva reservaAtual : usuario.getReservasPassados()) {
				System.out.println("Título do livro: " + reservaAtual.getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(reservaAtual.getDate());
				System.out.println("Data da reserva: " + data);
				System.out.println("Status: Finalizado\n");
			}
		} else {
			System.out.println("Usuário não possui reservas finalizadas.\n");
		}
	}
	
	public static void consultaNotificacoes(Usuario usuario) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Quantidade de notifições: " + ((Professor) usuario).getNotificacoes() + "\n");
	}
	
	public static void fimPrograma() {
		System.out.println("Programa encerrado!\n");
	}

}
