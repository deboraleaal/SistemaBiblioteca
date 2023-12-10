package sistemaBibliotecaESoficial;

public class ConsultarUsuario implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		
		biblioteca.consultarUsuario(args.getArg1());
	}

}
