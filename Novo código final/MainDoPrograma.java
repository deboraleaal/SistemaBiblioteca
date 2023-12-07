package sistemaBibliotecaESoficial;

import java.util.ArrayList;

public class MainDoPrograma {
	public static void main(String[] args) {
		Entrada entrada = Fabrica.criarEntrada();
		
		AlunoGraduacao aluno1 = Fabrica.criarAlunoGraduacao(123, "João da Silva");
		AlunoPosGraduacao aluno2 = Fabrica.criarAlunoPosGraduacao(456, "Luiz Fernando Rodrigues");
		AlunoGraduacao aluno3 = Fabrica.criarAlunoGraduacao(789, "Pedro Paulo");
		Professor professor = Fabrica.criarProfessor(100, "Carlos Lucena");
		
		String autor1 = "Ian Sommervile";
		String autor2 = "Grady Booch";
		String autor3 = "James Rumbaugh";
		String autor4 = "Ivar Jacobson";
		String autor5 = "Steve McConnell";
		String autor6 = "Robert Martin";
		String autor7 = "Martin Fowler";
		String autor8 = "Norman Fenton";
		String autor9 = "James Bieman";
		String autor10 = "Erich Gamma";
		String autor11 = "Richard Helm";
		String autor12 = "Ralph Johnson";
		String autor13 = "John Vlissides";
		ArrayList<String> autores1 = new ArrayList<String>();
		autores1.add(autor1);
		ArrayList<String> autores2 = new ArrayList<String>();
		autores2.add(autor2);
		autores2.add(autor3);
		autores2.add(autor4);
		ArrayList<String> autores3 = new ArrayList<String>();
		autores3.add(autor5);
		ArrayList<String> autores4 = new ArrayList<String>();
		autores4.add(autor6);
		ArrayList<String> autores5 = new ArrayList<String>();
		autores5.add(autor7);
		ArrayList<String> autores6 = new ArrayList<String>();
		autores6.add(autor8);
		autores6.add(autor9);
		ArrayList<String> autores7 = new ArrayList<String>();
		autores7.add(autor10);
		autores7.add(autor11);
		autores7.add(autor12);
		autores7.add(autor13);
		ArrayList<String> autores8 = new ArrayList<String>();
		autores8.add(autor7);
		
		Livro livro1 = Fabrica.criarLivro(100, "Engenharia de Software", "Addison Wesley", autores1, 6, 2000);
		Livro livro2 = Fabrica.criarLivro(101, "UML – Guia do Usuário", "Campus", autores2, 7, 2000);
		Livro livro3 = Fabrica.criarLivro(200, "Code Complete", "Microsoft Press", autores3, 2, 2014);
		Livro livro4 = Fabrica.criarLivro(201, "Agile Software Development, Principles, Patterns, and Practices", "Prentice Hall", autores4, 1, 2002);
		Livro livro5 = Fabrica.criarLivro(300, "Refactoring: Improving the Design of Existing Code", "Addison Wesley Professional", autores5, 1, 1999);
		Livro livro6 = Fabrica.criarLivro(301, "Software Metrics: A Rigorous and Practical Approach", "CRC Press", autores6, 3, 2014);
		Livro livro7 = Fabrica.criarLivro(400, "Design Patterns: Elements of Reusable Object-Oriented Software", "Addison Wesley Professional", autores7, 1, 1994);
		Livro livro8 = Fabrica.criarLivro(401, "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison Wesley Professional", autores8, 3, 2003);
		
		Exemplar exemplar1 = Fabrica.criarExemplar(1, livro1);
		Exemplar exemplar2 = Fabrica.criarExemplar(2, livro1);
		livro1.getExemplares().add(exemplar1);
		livro1.getExemplares().add(exemplar2);
		Exemplar exemplar3 = Fabrica.criarExemplar(3, livro2);
		livro2.getExemplares().add(exemplar3);
		Exemplar exemplar4 = Fabrica.criarExemplar(4, livro3);
		livro3.getExemplares().add(exemplar4);
		Exemplar exemplar5 = Fabrica.criarExemplar(5, livro4);
		livro4.getExemplares().add(exemplar5);
		Exemplar exemplar6 = Fabrica.criarExemplar(6, livro5);
		Exemplar exemplar7 = Fabrica.criarExemplar(7, livro5);
		livro5.getExemplares().add(exemplar6);
		livro5.getExemplares().add(exemplar7);
		Exemplar exemplar8 = Fabrica.criarExemplar(8, livro7);
		Exemplar exemplar9 = Fabrica.criarExemplar(9, livro7);
		livro7.getExemplares().add(exemplar8);
		livro7.getExemplares().add(exemplar9);
		
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		biblioteca.getUsuarios().add(aluno1);
		biblioteca.getUsuarios().add(aluno2);
		biblioteca.getUsuarios().add(aluno3);
		biblioteca.getUsuarios().add(professor);
		biblioteca.getLivros().add(livro1);
		biblioteca.getLivros().add(livro2);
		biblioteca.getLivros().add(livro3);
		biblioteca.getLivros().add(livro4);
		biblioteca.getLivros().add(livro5);
		biblioteca.getLivros().add(livro6);
		biblioteca.getLivros().add(livro7);
		biblioteca.getLivros().add(livro8);
		
		CarregadorArgs carregadorArgs = new CarregadorArgs();
		carregadorArgs.setArg1("123");
		carregadorArgs.setArg2("100");
		
		entrada.executarComandos("emp", carregadorArgs);
	}

}
