package sistemaBibliotecaESoficial;

public class VerificadorProfessor implements IVerificadorEmprestimo {
	@Override
	public boolean verificarPossibilidadeEmprestimo(Livro livro, Usuario usuario) {
		if (usuario.isDevedor()) {
			Impressoes.usuarioDevedor(usuario, livro);
			return false;
		}
		
		boolean exemplarDisponivel = false;
		
		for (Exemplar exemplarAtual : livro.getExemplares()) {
			if (exemplarAtual.isDisponibilidade()) {
				exemplarDisponivel = true;
				return exemplarDisponivel;
			} else {
				exemplarDisponivel = false;
			}
		}
		
		Impressoes.exemplaresIndisponiveis(usuario, livro);
		return exemplarDisponivel;

	}

}
