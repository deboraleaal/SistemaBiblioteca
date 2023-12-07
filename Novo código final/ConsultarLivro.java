package sistemaBibliotecaESoficial;

public class ConsultarLivro implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		int codigoLivro;
		
		codigoLivro = IntConverter.converterEmInt(args.getArg1());
		
		biblioteca.consultarLivro(codigoLivro);
	}

}
