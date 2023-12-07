import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private static Biblioteca instance;
    private Map<Integer, Livro> livros;
    private Map<Integer, Exemplar> exemplares;
    private Map<Integer, Usuario> usuarios;

    protected Biblioteca() {
        this.livros = new HashMap<>();
        this.exemplares = new HashMap<>();
        this.usuarios = new HashMap<>();
    }

    public static Biblioteca getInstance() {
        if (instance == null) {
            instance = new Biblioteca();
        }
        return instance;
    }

    // Métodos de inicialização de dados e outros podem ser adicionados conforme necessário
}