
public class Exemplar  {

	private Livro livro;
	private int numeroExemplar;
	private boolean disponivel;
	
	
	public Exemplar(Livro livro, int numeroExemplar, boolean disponivel) {
		super();
		this.livro = livro;
		this.numeroExemplar = numeroExemplar;
		this.disponivel = disponivel;
	}


	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public int getNumeroExemplar() {
		return numeroExemplar;
	}


	public void setNumeroExemplar(int numeroExemplar) {
		this.numeroExemplar = numeroExemplar;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
}
