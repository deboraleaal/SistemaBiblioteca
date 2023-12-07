package SistemaBibliotecaES;

public class AlunoGraduacao extends Usuario {
    public AlunoGraduacao(int codigo, String nome) {
        super(nome, codigo);
    }

    @Override
    public void fazerEmprestimoLivro(Livro livroEmpresta) {
    	boolean emprestimoValido = true;
        int numeroDeEmprestimos = 0;
        
        for (int i = 0; i < EmprestimosUsuario.size(); i ++) {
           if(EmprestimosUsuario.get(i).dataEmprestimo == new Date()) {
        	   numeroDeEmprestimos += 1;
           }
           
           if(EmprestimosUsuario.get(i).livroEmp.getCodigo() == livroEmpresta.getCodigo()) {
        	   emprestimoValido = false;
           }			
		}
        
        if(!isDevedor && numeroDeEmprestimos < 4 && emprestimoValido) {
            livroEmpresta.Emprestimo(this);
        }
    }

    @Override
    public void devolucaoLivro(Livro livro) {
		livro.devolucao(this);        
    }
}

