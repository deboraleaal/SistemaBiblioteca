package sistemaBibliotecaESoficial;

public class RegistrarObservador implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		
		biblioteca.registrarObservador(args.getArg1(), args.getArg2());
	}

}
