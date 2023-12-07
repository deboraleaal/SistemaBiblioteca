package sistemaBibliotecaESoficial;

public class Professor extends Usuario implements IObservador{
	int notificacoes;
	
	public Professor(int codigo, String nome, int tempoEmprestimo, IVerificadorEmprestimo verificador) {
		super(codigo, nome, tempoEmprestimo, verificador);
		this.notificacoes = 0;
	}
	
	public int getNotificacoes() {
		return notificacoes;
	}

	@Override
	public void atualizar() {
		notificacoes += 1;
	}

}
