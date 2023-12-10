package sistemaBibliotecaESoficial;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Entrada entrada = Fabrica.criarEntrada();
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		String entradaCompleta = null;
		String cmd = null;
		CarregadorArgs carregadorArgs = Fabrica.criarCarregadorArgs();
		
		AlunoGraduacao aluno1 = Fabrica.criarAlunoGraduacao("123", "João da Silva");
		AlunoPosGraduacao aluno2 = Fabrica.criarAlunoPosGraduacao("456", "Luiz Fernando Rodrigues");
		AlunoGraduacao aluno3 = Fabrica.criarAlunoGraduacao("789", "Pedro Paulo");
		Professor professor = Fabrica.criarProfessor("100", "Carlos Lucena");
		
		Livro livro1 = Fabrica.criarLivro("100", "Engenharia de Software", "Addison Wesley", "Ian Sommervile", 6, 2000);
		Livro livro2 = Fabrica.criarLivro("101", "UML – Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh e Ivar Jacobson", 7, 2000);
		Livro livro3 = Fabrica.criarLivro("200", "Code Complete", "Microsoft Press", "Steve McConnell", 2, 2014);
		Livro livro4 = Fabrica.criarLivro("201", "Agile Software Development, Principles, Patterns, and Practices", "Prentice Hall", "Robert Martin", 1, 2002);
		Livro livro5 = Fabrica.criarLivro("300", "Refactoring: Improving the Design of Existing Code", "Addison Wesley Professional", "Martin Fowler", 1, 1999);
		Livro livro6 = Fabrica.criarLivro("301", "Software Metrics: A Rigorous and Practical Approach", "CRC Press", "Norman Fenton e James Bieman", 3, 2014);
		Livro livro7 = Fabrica.criarLivro("400", "Design Patterns: Elements of Reusable Object-Oriented Software", "Addison Wesley Professional", "Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides", 1, 1994);
		Livro livro8 = Fabrica.criarLivro("401", "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison Wesley Professional", "Martin Fowler", 3, 2003);
		
		Exemplar exemplar1 = Fabrica.criarExemplar("01", livro1);
		Exemplar exemplar2 = Fabrica.criarExemplar("02", livro1);
		livro1.getExemplares().add(exemplar1);
		livro1.getExemplares().add(exemplar2);
		Exemplar exemplar3 = Fabrica.criarExemplar("03", livro2);
		livro2.getExemplares().add(exemplar3);
		Exemplar exemplar4 = Fabrica.criarExemplar("04", livro3);
		livro3.getExemplares().add(exemplar4);
		Exemplar exemplar5 = Fabrica.criarExemplar("05", livro4);
		livro4.getExemplares().add(exemplar5);
		Exemplar exemplar6 = Fabrica.criarExemplar("06", livro5);
		Exemplar exemplar7 = Fabrica.criarExemplar("07", livro5);
		livro5.getExemplares().add(exemplar6);
		livro5.getExemplares().add(exemplar7);
		Exemplar exemplar8 = Fabrica.criarExemplar("08", livro7);
		Exemplar exemplar9 = Fabrica.criarExemplar("09", livro7);
		livro7.getExemplares().add(exemplar8);
		livro7.getExemplares().add(exemplar9);
		
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
		
		int rodar = 0;
		Impressoes.inicioPrograma();
		
		while (rodar == 0) {
			Impressoes.opcoesPrograma();
			entradaCompleta = sc.nextLine();
			System.out.println();
			cmd = SeparadorString.separarStringsDeEntrada(carregadorArgs, entradaCompleta);
			entrada.executarComandos(cmd, carregadorArgs);
			
			if (cmd.equals("sai")) {
				rodar = 1;
			}
		}
		
		sc.close();
	}

}
