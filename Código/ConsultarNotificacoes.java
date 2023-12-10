package sistemaBibliotecaESoficial;

public class ConsultarNotificacoes implements IComando{
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		
		biblioteca.consultarNotificacoes(args.getArg1());
	}

}
