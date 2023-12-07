package sistemaBibliotecaESoficial;

public class Professor extends Usuario implements IObservador{
	int notificacoes;
	
	public Professor(int codigo, String nome, int tempoEmprestimo, IVerificadorEmprestimo verificador) {
		super(codigo, nome, tempoEmprestimo, verificador);
		this.notificacoes = 0;
	}

	@Override
	public void atualizar() {
		notificacoes += 1;
	}

}
