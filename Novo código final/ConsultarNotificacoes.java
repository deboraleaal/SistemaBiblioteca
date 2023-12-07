package sistemaBibliotecaESoficial;

public class ConsultarNotificacoes implements IComando{
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		int codigoUsuario;
		
		codigoUsuario = IntConverter.converterEmInt(args.getArg1());
		
		biblioteca.consultarNotificacoes(codigoUsuario);
	}

}
