package sistemaBibliotecaESoficial;

import java.util.Date;

public class Emprestimo {
	private Exemplar exemplar;
	private Usuario usuario;
	private Date dataEmprestimo;
	
	public Emprestimo(Exemplar exemplar, Usuario usuario) {
		this.exemplar = exemplar;
		this.usuario = usuario;
		this.dataEmprestimo = new Date();
	}
	
	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDate() {
		return dataEmprestimo;
	}

	public void setDate(Date date) {
		this.dataEmprestimo = date;
	}

}
