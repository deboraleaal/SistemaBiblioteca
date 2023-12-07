package sistemaBibliotecaESoficial;

import java.util.HashMap;

public class Entrada {
	private HashMap<String, IComando> comandos = new HashMap<String, IComando>();
	
	public Entrada() {
		initComandos();
	}
	
	private void initComandos() {
		comandos.put("emp", new FazerEmprestimo());
		comandos.put("dev", new FazerDevolucao());
		comandos.put("res", new FazerReserva());
		comandos.put("obs", new RegistrarObservador());
		comandos.put("liv", new ConsultarLivro());
		comandos.put("usu", new ConsultarUsuario());
		comandos.put("ntf", new ConsultarNotificacoes());
		comandos.put("sai", new Sair());
	}
	
	public void executarComandos(String cmd, CarregadorArgs args) {
		comandos.get(cmd).executar(args);
	}
}
