package sistemaBibliotecaESoficial;

public class AlunoGraduacao extends Usuario {
	public AlunoGraduacao(int codigo, String nome, int tempoEmprestimo, IVerificadorEmprestimo verificador) {
		super(codigo, nome, tempoEmprestimo, verificador);
		this.setLimiteEmprestimo(3);
	}

}
