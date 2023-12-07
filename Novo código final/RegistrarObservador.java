package sistemaBibliotecaESoficial;

public class RegistrarObservador implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		int codigoUsuario;
		int codigoLivro;
		
		codigoUsuario = IntConverter.converterEmInt(args.getArg1());
		codigoLivro = IntConverter.converterEmInt(args.getArg2());
		
		biblioteca.registrarObservador(codigoUsuario, codigoLivro);
	}

}
