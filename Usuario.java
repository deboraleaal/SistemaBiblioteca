
public class Usuario {

	private int idUsuario;
	private String nome;
	
	
	public Usuario(String nome, int idUsuario) {
		
		this.idUsuario = idUsuario;
		this.nome = nome;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
