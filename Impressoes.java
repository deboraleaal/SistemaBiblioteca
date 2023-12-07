package sistemaBibliotecaESoficial;

import java.text.SimpleDateFormat;

public class Impressoes {
	public static void usuarioNaoEncontrado() {
		System.out.println("Código de usuário inválido!");
		System.out.println();
	}
	
	public static void livroNaoEncontrado() {
		System.out.println("Código de livro inválido!");
		System.out.println();
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
		System.out.println();
	}
	
	public static void usuarioDevedor(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário possui devolução de um livro em atraso.");
		System.out.println();
	}
	
	public static void exemplaresIndisponiveis(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Não existe exemplar do livro disponível.");
		System.out.println();
	}
	
	public static void limiteEmprestimo(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário atingiu o seu limite de empréstimos.");
		System.out.println();
	}
	
	public static void emprestimoDuplicado(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Usuário já possui o livro em seus empréstimos.");
		System.out.println();
	}
	
	public static void totalmenteReservado(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaEmprestimo();
		System.out.println("Motivo: Todos os exemplares estão reservados.");
		System.out.println();
	}
	
	public static void sucessoDevolucao(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.devolucaoEfetuada();
		System.out.println();
	}
	
	public static void naoPossuilivroEmprestimo(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaDevolucao();
		System.out.println("Motivo: Usuário não possui o livro em seus empréstimos.");
		System.out.println();
	}
	
	public static void sucessoReserva(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.reservaEfetuada();
		System.out.println();
	}
	
	public static void limiteReserva(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.falhaReserva();
		System.out.println("Motivo: Usuário atingiu o seu limite de reservas.");
		System.out.println();
	}
	
	public static void sucessoRegistroObservador(Usuario usuario, Livro livro) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Título do livro: " + livro.getTitulo());
		Impressoes.registroObservadorEfetuado();
		System.out.println();
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
	
	public static void consultaUsuario(Usuario usuario) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println();
		
		if (usuario.getEmprestimos().size() > 0) {
			for (Emprestimo emprestimoAtual : usuario.getEmprestimos()) {
				System.out.println("Título do livro: " + emprestimoAtual.getExemplar().getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(emprestimoAtual.getDate());
				System.out.println("Data do empréstimo: " + data);
				System.out.println("Status: Em curso");
				System.out.println("Tempo previsto para devolução: " + emprestimoAtual.getUsuario().getLimiteEmprestimo() + " dias");
				System.out.println();
			}
		} else {
			System.out.println("Usuário não possui empréstimos em curso");
			System.out.println();
		}
		
		if (usuario.getEmprestimosPassados().size() > 0) {
			for (Emprestimo emprestimoAtual : usuario.getEmprestimosPassados()) {
				System.out.println("Título do livro: " + emprestimoAtual.getExemplar().getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(emprestimoAtual.getDate());
				System.out.println("Data do empréstimo: " + data);
				System.out.println("Status: Finalizado");
				System.out.println("Devolução já efetuada!");
				System.out.println();
			}
		} else {
			System.out.println("Usuário não possui empréstimos finalizados");
			System.out.println();
		}
		
		if (usuario.getReservas().size() > 0) {
			for (Reserva reservaAtual : usuario.getReservas()) {
				System.out.println("Título do livro: " + reservaAtual.getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(reservaAtual.getDate());
				System.out.println("Data da reserva: " + data);
				System.out.println("Status: Em curso");
				System.out.println();
			}
		} else {
			System.out.println("Usuário não possui reservas em curso");
			System.out.println();
		}
		
		if (usuario.getReservas().size() > 0) {
			for (Reserva reservaAtual : usuario.getReservasPassados()) {
				System.out.println("Título do livro: " + reservaAtual.getLivro().getTitulo());
				String data = new SimpleDateFormat("dd/MM/yyyy").format(reservaAtual.getDate());
				System.out.println("Data da reserva: " + data);
				System.out.println("Status: Finalizado");
				System.out.println();
			}
		} else {
			System.out.println("Usuário não possui reservas finalizadas");
			System.out.println();
		}
	}
	
	public static void consultaNotificacoes(Usuario usuario) {
		System.out.println("Nome do usuário: " + usuario.getNome());
		System.out.println("Quantidade de notifições: " + ((Professor) usuario).getNotificacoes());
		System.out.println();
	}
	
	public static void fimPrograma() {
		System.out.println("Programa encerrado!");
	}
}
