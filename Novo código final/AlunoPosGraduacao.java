package sistemaBibliotecaESoficial;

public class AlunoPosGraduacao extends Usuario {
	public AlunoPosGraduacao(int codigo, String nome, int tempoEmprestimo, IVerificadorEmprestimo verificador) {
		super(codigo, nome, tempoEmprestimo, verificador);
		this.setLimiteEmprestimo(4);
	}
}
