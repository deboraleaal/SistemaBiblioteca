package sistemaBibliotecaESoficial;

public class IntConverter {
	public static int converterEmInt(String codigo) {
        int number;

        try {
            number = Integer.parseInt(codigo);
            return number;
        } catch (NumberFormatException e) {
            System.out.println("Inteiro inválido!");
        }
        
        return -1;
	}

}
