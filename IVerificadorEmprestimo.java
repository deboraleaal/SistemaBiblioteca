package sistemaBibliotecaESoficial;

public interface IVerificadorEmprestimo {
	public boolean verificarPossibilidadeEmprestimo(Livro livro, Usuario usuario);

}
