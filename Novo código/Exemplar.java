package sistemaBibliotecaESoficial;

public class Exemplar {
	private int codigo;
	private boolean disponibilidade;
	private Livro livro;
	private Emprestimo emprestimoAtual;
	
	public Exemplar(int codigo, Livro livro) {
		this.codigo = codigo;
		this.disponibilidade = true;
		this.livro = livro;
		this.emprestimoAtual = null;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Emprestimo getEmprestimoAtual() {
		return emprestimoAtual;
	}

	public void setEmprestimoAtual(Emprestimo emprestimoAtual) {
		this.emprestimoAtual = emprestimoAtual;
	}
	
}
