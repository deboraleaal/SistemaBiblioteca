package sistemaBibliotecaESoficial;

import java.util.ArrayList;

public class Usuario {
	private String codigo;
	private String nome;
	private int tempoEmprestimo;
	private IVerificadorEmprestimo verificador;
	private boolean devedor;
	private int limiteEmprestimo;
	private ArrayList<Emprestimo> emprestimosAtuais;
	private ArrayList<Emprestimo> emprestimosPassados;
	private ArrayList<Reserva> reservasAtuais;
	private ArrayList<Reserva> reservasPassados;
	
	public Usuario (String codigo, String nome, int tempoEmprestimo, IVerificadorEmprestimo verificador) {
		this.codigo = codigo;
		this.nome = nome;
		this.tempoEmprestimo = tempoEmprestimo;
		this.verificador = verificador;
		this.setDevedor(false);
		this.limiteEmprestimo = 0;
		this.emprestimosAtuais = new ArrayList<Emprestimo>();
		this.emprestimosPassados = new ArrayList<Emprestimo>();
		this.reservasAtuais = new ArrayList<Reserva>();
		this.reservasPassados = new ArrayList<Reserva>();
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public IVerificadorEmprestimo getVerificador() {
		return verificador;
	}

	public void setVerificador(IVerificadorEmprestimo verificador) {
		this.verificador = verificador;
	}

	public int getTempoEmprestimo() {
		return tempoEmprestimo;
	}

	public void setTempoEmprestimo(int tempoEmprestimo) {
		this.tempoEmprestimo = tempoEmprestimo;
	}

	public boolean isDevedor() {
		return devedor;
	}

	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}

	public int getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(int limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimosAtuais;
	}

	public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		this.emprestimosAtuais = emprestimos;
	}
	
	public ArrayList<Emprestimo> getEmprestimosPassados() {
		return emprestimosPassados;
	}

	public void setEmprestimosPassados(ArrayList<Emprestimo> emprestimosPassados) {
		this.emprestimosPassados = emprestimosPassados;
	}

	public ArrayList<Reserva> getReservas() {
		return reservasAtuais;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservasAtuais = reservas;
	}

	public ArrayList<Reserva> getReservasPassados() {
		return reservasPassados;
	}

	public void setReservasPassados(ArrayList<Reserva> reservasPassados) {
		this.reservasPassados = reservasPassados;
	}

}
