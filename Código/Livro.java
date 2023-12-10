package sistemaBibliotecaESoficial;

import java.util.ArrayList;

public class Livro implements ISubject {
	private String codigo;
	private String titulo;
	private String editora;
	private String autores;
	private int edicao;
	private int anoPublicacao;
	private ArrayList<Exemplar> exemplares;
	private ArrayList<IObservador> observadores;
	private ArrayList<Reserva> reservasAtuais;
	
	public Livro(String codigo, String titulo, String editora, String autores, int edicao, int anoPublicacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
		this.exemplares = new ArrayList<Exemplar>();
		this.observadores = new ArrayList<IObservador>();
		this.reservasAtuais = new ArrayList<Reserva>();
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getEditora() {
		return this.editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getAutores(){
		return this.autores;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	
	public void setedicao(int edicao) {
		this.edicao = edicao;
	}
	
	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public ArrayList<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(ArrayList<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	
	public ArrayList<Reserva> getReservasAtuais() {
		return reservasAtuais;
	}

	public void setReservasAtuais(ArrayList<Reserva> reservasAtuais) {
		this.reservasAtuais = reservasAtuais;
	}

	@Override
	public void registraObservador(IObservador observador) {
		observadores.add(observador);
		
	}
	
	@Override
	public void removerObservador(IObservador observador) {
		observadores.remove(observador);
		
	}
	
	@Override
	public void notificarObservadores() {
	    for (IObservador observador : observadores) {
	    	observador.atualizar();
	    } 
	}

}
