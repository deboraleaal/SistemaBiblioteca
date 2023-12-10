package sistemaBibliotecaESoficial;

public class Exemplar {
	private String codigo;
	private boolean disponibilidade;
	private Livro livro;
	private Emprestimo emprestimoAtual;
	
	public Exemplar(String codigo, Livro livro) {
		this.codigo = codigo;
		this.disponibilidade = true;
		this.livro = livro;
		this.emprestimoAtual = null;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
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
