package sistemaBibliotecaESoficial;

public class ConsultarLivro implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		
		biblioteca.consultarLivro(args.getArg1());
	}

}
