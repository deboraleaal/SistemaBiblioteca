package sistemaBibliotecaESoficial;

public class SeparadorString {
	public static String separarStringsDeEntrada(CarregadorArgs carregador, String entradaCompleta) {
		String comando = entradaCompleta.substring(0, 3);
		
		if (entradaCompleta.length() >= 7) {
			String temp1 = entradaCompleta.substring(4, 7);
			carregador.setArg1(temp1);
		}
		
		if (entradaCompleta.length() == 11) {
			String temp2 = entradaCompleta.substring(8, 11);
			carregador.setArg2(temp2);
		}
		
		return comando;
	}

}
