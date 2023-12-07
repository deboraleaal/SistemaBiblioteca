package SistemaBibliotecaES;

import java.util.ArrayList;
import java.util.Date;

public class Livro implements ISubject{
	private int codigo;
	private String titulo;
	private String editora;
	private ArrayList<String> autores;
	private int edicao;
	private int anoPublicacao;
	private ArrayList<Exemplar> exemplares;
	private ArrayList<IObserver> observadores;
	private ArrayList<Reserva> reservasLivro;
    private ArrayList<Emprestimo> emprestimosLivro;
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
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
	
	public ArrayList<String> getAutores(){
		return this.autores;
	}
	
	public void setAutores(ArrayList<String> autores) {
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
	
	public ArrayList<Exemplar> getExemplares(){
		return this.exemplares;
	}
	
	public void setExemplares(ArrayList<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

	public void registraObservador(IObserver observador) {
		observadores.add(observador);
		
	}

	public void removerObservador(IObserver observador) {
		observadores.remove(observador);
		
	}

	public void notificarObservadores() {
	       System.out.println("Tem reserva simultânea");
	       for (IObserver observador : observadores) {
				observador.update();
			} 
	    }
	
	public boolean temExemplar() {
        return encontrarExemplar() != null;
    }

    private Exemplar encontrarExemplar() {
        Exemplar exemplar = null;
        
        for (int i = 0; i < exemplares.size(); i++) {
            if (exemplares.get(i).estadoExemplar) {
            	exemplar = exemplares.get(i);
            }
        }
        
        return exemplar;
    }

    public void Emprestimo(IUsuario usuario) {
    	Exemplar exemplar = encontrarExemplar();
        boolean emprestimoValido = false;
        int numeroDeReservas = 0;
        
        for (int i = 0; i < reservasLivro.size(); i++) {
	        if(reservasLivro.get(i).dataReserva == new java.util.Date()){
	        	numeroDeReservas += 1;
	        }
	        
	        if(reservasLivro.get(i).codUsuarioReserva ==  usuario.getCodigo()){
	        	emprestimoValido = true;
	        }
       }
        
       if(numeroDeReservas < exemplares.size() || emprestimoValido ){
    	   Date currentDate = new Date();
    	   exemplar.emprestar();
    	   emprestimosLivro.add(new Emprestimo(this, currentDate, usuario.getCodigo(), exemplar.codExemplar));
    	   System.out.println("Empréstimo efetuado!");
    	   
       }else{
    	   System.out.println("Não foi possível efetuar o empréstimo!");
       }
    }

    public void devolucao(IUsuario usuario){
        int codigoExemplar = 0;
        Exemplar exemplar = null;
        
        for (int i = 0; i < emprestimosLivro.size(); i++) {
            if(emprestimosLivro.get(i).codUsuario ==  usuario.getCodigo()){
            	codigoExemplar = emprestimosLivro.get(i).codExemplar;
            }
        }
        
        for (int i = 0; i < exemplares.size(); i++) {
            if(exemplares.get(i).codExemplar ==  codigoExemplar){
            	exemplar = exemplares.get(i);
            }
        } 
        
        if(exemplar != null){
        	exemplar.devolver(); 
            System.out.println("Devolução efetuada!");
        }else{
            System.out.println("Não foi possível efetuar a devolução!");
        }
           
    }

    public Reserva reservar(int codigoUsuario){
       Reserva reserva = new Reserva(this, new Date(), codigoUsuario);
       System.out.println("Reserva efetuada!");

       return reserva;
    }

}
