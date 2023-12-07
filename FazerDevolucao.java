package sistemaBibliotecaESoficial;

public class FazerDevolucao implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		int codigoUsuario;
		int codigoLivro;
		
		codigoUsuario = IntConverter.converterEmInt(args.getArg1());
		codigoLivro = IntConverter.converterEmInt(args.getArg2());
		
		biblioteca.fazerDevolucao(codigoUsuario, codigoLivro);
	}

}
