package sistemaBibliotecaESoficial;

public class FazerReserva implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		
		biblioteca.fazerReserva(args.getArg1(), args.getArg2());
	}

}
