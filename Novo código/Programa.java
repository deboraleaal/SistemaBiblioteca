package sistemaBibliotecaESoficial;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Programa {
	public static void main(String[] args) {
		Date dataHoraAtual = new Date();
		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
		
		System.out.println(data);
		System.out.println(dataHoraAtual);
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<String> autores = new ArrayList<String>();
		
		IVerificadorEmprestimo verificador = new VerificadorAluno();
		Livro livro = new Livro(455, "aloo", "tttt", autores, 6, 2017);
		System.out.println(livro.getExemplares().size());
		Exemplar exemplar = new Exemplar(123, livro);
		Exemplar exemplar2 = new Exemplar(999, livro);
		livro.getExemplares().add(exemplar);
		livro.getExemplares().add(exemplar2);
		
		Usuario usuario = new Usuario(222, "carlos", 3, verificador);
		Emprestimo emprestimo = new Emprestimo(exemplar, usuario);
		exemplar.setEmprestimoAtual(emprestimo);
		
		//System.out.println(exemplar.getEmprestimoAtual().getDate());
		boolean aloha = false;
		
		usuarios.add(usuario);
		
		if (!usuario.isDevedor() && aloha) {
			System.out.println("alo");
		}
		
		for (Exemplar exempl : livro.getExemplares()) {
			System.out.println("abc " + exempl.getLivro().getTitulo());
			System.out.println("abc " + exempl.getCodigo() + " dias");
		}
		
	}

}
