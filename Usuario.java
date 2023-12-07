import java.util.ArrayList;
public class Usuario {

	protected int codigo;
	private String nome;
	
	//Todo usuario começa sem dever nada, logo inicia o devedor como falso
	public boolean isDevedor = false;
	
	//Precisamos guardar as informações de reserva e emprestimo
	public ArrayList<Reserva> ReservasUsuario;
	public ArrayList<Emprestimo> EmprestimosUsuario;
	
	public Usuario(String nome, int codigo) {
		
		this.codigo = codigo;
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
