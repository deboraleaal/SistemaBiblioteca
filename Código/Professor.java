package sistemaBibliotecaESoficial;

public class Professor extends Usuario implements IObservador{
	private int notificacoes;
	
	public Professor(String codigo, String nome, int tempoEmprestimo, IVerificadorEmprestimo verificador) {
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
