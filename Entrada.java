import java.util.HashMap;

public class Entrada {

	private HashMap<String, Comando> comandos;
	private void iniciaComandos() {
		comandos put ("emp", new FazerEmprestimo());
		comandos put ("res", new FazerReserva());
	}
	
