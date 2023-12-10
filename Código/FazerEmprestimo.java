package sistemaBibliotecaESoficial;

public class FazerEmprestimo implements IComando {
	@Override
	public void executar(CarregadorArgs args) {
		Biblioteca biblioteca = Fabrica.criarBiblioteca();
		
		biblioteca.fazerEmprestimo(args.getArg1(), args.getArg2());

	}

}
