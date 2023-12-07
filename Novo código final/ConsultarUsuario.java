package sistemaBibliotecaESoficial;

public class ConsultarUsuario implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		int codigoUsuario;
		
		codigoUsuario = IntConverter.converterEmInt(args.getArg1());
		
		biblioteca.consultarUsuario(codigoUsuario);
	}

}
