package sistemaBibliotecaESoficial;

public interface ISubject {
	public void registraObservador(IObservador observador);
	public void removerObservador(IObservador observador);
	public void notificarObservadores();
}
