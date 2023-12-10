package sistemaBibliotecaESoficial;

public class FazerDevolucao implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		
		biblioteca.fazerDevolucao(args.getArg1(), args.getArg2());
	}

}
