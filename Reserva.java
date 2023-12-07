package sistemaBibliotecaESoficial;

import java.util.Date;

public class Reserva {
	private Livro livro;
	private Usuario usuario;
	private Date data;
	private boolean finalizado;
	
	public Reserva(Livro livro, Usuario usuario) {
		this.livro = livro;
		this.usuario = usuario;
		this.data = new Date();
		this.finalizado = false;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Date getDate() {
		return data;
	}

	public void setDate(Date date) {
		this.data = date;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	
}
