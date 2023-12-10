package sistemaBibliotecaESoficial;

public class AlunoPosGraduacao extends Usuario {
	public AlunoPosGraduacao(String codigo, String nome, int tempoEmprestimo, IVerificadorEmprestimo verificador) {
		super(codigo, nome, tempoEmprestimo, verificador);
		this.setLimiteEmprestimo(4);
	}
}
