package sistemaBibliotecaESoficial;

import java.util.ArrayList;

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
	
	public static VerificadorAluno criarVerificadorAluno() {
		return new VerificadorAluno();
	}
	
	public static VerificadorProfessor criarVerificadorProfessor() {
		return new VerificadorProfessor();
	}
	
	public static Livro criarLivro(int codigo, String titulo, String editora, ArrayList<String> autores, int edicao, int anoPublicacao) {
		return new Livro(codigo, titulo, editora, autores, edicao, anoPublicacao);
	}
	
	public static Exemplar criarExemplar(int codigo, Livro livro) {
		return new Exemplar(codigo, livro);
	}
	
	public static AlunoGraduacao criarAlunoGraduacao(int codigo, String nome){
		return new AlunoGraduacao(codigo, nome, 3, Fabrica.criarVerificadorAluno());
	}
	
	public static AlunoPosGraduacao criarAlunoPosGraduacao(int codigo, String nome){
		return new AlunoPosGraduacao(codigo, nome, 4, Fabrica.criarVerificadorAluno());
	}
	
	public static Professor criarProfessor(int codigo, String nome){
		return new Professor(codigo, nome, 7, Fabrica.criarVerificadorProfessor());
	}
}
