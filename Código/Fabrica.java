package sistemaBibliotecaESoficial;

public class Fabrica {
	public static Emprestimo criarEmprestimo(Exemplar exemplar, Usuario usuario) {
		return new Emprestimo(exemplar, usuario);
	}
	
	public static Reserva criarReserva(Livro livro, Usuario usuario) {
		return new Reserva(livro, usuario);
	}
	
	public static Biblioteca criarBiblioteca() {
		return Biblioteca.getInstancia();
	}
	
	public static Entrada criarEntrada() {
		return new Entrada();
	}
	
	public static CarregadorArgs criarCarregadorArgs() {
		return new CarregadorArgs();
	}
	
	public static VerificadorAluno criarVerificadorAluno() {
		return new VerificadorAluno();
	}
	
	public static VerificadorProfessor criarVerificadorProfessor() {
		return new VerificadorProfessor();
	}
	
	public static Livro criarLivro(String codigo, String titulo, String editora, String autores, int edicao, int anoPublicacao) {
		return new Livro(codigo, titulo, editora, autores, edicao, anoPublicacao);
	}
	
	public static Exemplar criarExemplar(String codigo, Livro livro) {
		return new Exemplar(codigo, livro);
	}
	
	public static AlunoGraduacao criarAlunoGraduacao(String codigo, String nome){
		return new AlunoGraduacao(codigo, nome, 3, Fabrica.criarVerificadorAluno());
	}
	
	public static AlunoPosGraduacao criarAlunoPosGraduacao(String codigo, String nome){
		return new AlunoPosGraduacao(codigo, nome, 4, Fabrica.criarVerificadorAluno());
	}
	
	public static Professor criarProfessor(String codigo, String nome){
		return new Professor(codigo, nome, 7, Fabrica.criarVerificadorProfessor());
	}

}
