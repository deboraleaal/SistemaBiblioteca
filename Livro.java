import java.util.Date;

public class Livro extends Biblioteca {

	private int cod;
	private String titulo;
	private String editora;
	private String autor;
	private Date data;
	
	
	public Livro(int cod, String titulo, String editora, String autor, Date data) {
		super();
		this.cod = cod;
		this.titulo = titulo;
		this.editora = editora;
		this.autor = autor;
		this.data = data;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	
}
