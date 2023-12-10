package sistemaBibliotecaESoficial;

public class Sair implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Impressoes.fimPrograma();
	}
}
