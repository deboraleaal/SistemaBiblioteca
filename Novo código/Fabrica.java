package sistemaBibliotecaESoficial;

public class Fabrica {
	public static Emprestimo criarEmprestimo(Exemplar exemplar, Usuario usuario) {
		return new Emprestimo(exemplar, usuario);
	}
	
	public static Reserva criarReserva(Livro livro, Usuario usuario) {
		return new Reserva(livro, usuario);
	}
}
