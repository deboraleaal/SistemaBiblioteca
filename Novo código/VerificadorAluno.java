package sistemaBibliotecaESoficial;

public class VerificadorAluno implements IVerificadorEmprestimo{
	@Override
	public boolean verificarPossibilidadeEmprestimo(Livro livro, Usuario usuario) {
		if (usuario.isDevedor()) {
			Impressoes.usuarioDevedor(usuario, livro);
			return false;
		}
		
		if (usuario.getEmprestimos().size() == usuario.getLimiteEmprestimo()) {
			Impressoes.limiteEmprestimo(usuario, livro);
			return false;
		}
		
		for (Emprestimo emprestimoAtual : usuario.getEmprestimos()) {
			if (emprestimoAtual.getExemplar().getLivro().getCodigo() == livro.getCodigo()) {
				Impressoes.emprestimoDuplicado(usuario, livro);
				return false;
			} 
		}
		
		boolean exemplarDisponivel = false;
		
		for (Exemplar exemplarAtual : livro.getExemplares()) {
			if (exemplarAtual.isDisponibilidade()) {
				exemplarDisponivel = true;
				break;
			} else {
				exemplarDisponivel = false;
			}
		}
		
		if (!exemplarDisponivel) {
			Impressoes.exemplaresIndisponiveis(usuario, livro);
			return exemplarDisponivel;
		}
		
		for (Reserva reservaAtual : livro.getReservasAtuais()) {
			if (reservaAtual.getUsuario().getCodigo() == usuario.getCodigo()) {
				return true;
			}
		}
		
		
		if (livro.getReservasAtuais().size() >= livro.getExemplares().size()) {
			Impressoes.totalmenteReservado(usuario, livro);
			return false;
		}
		
		return true;
		
	}

}
