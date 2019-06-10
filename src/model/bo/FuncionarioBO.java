package model.bo;

import model.dao.FuncionarioDAO;
import model.vo.Funcionario;

public class FuncionarioBO {

	private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

	public boolean atualizar(Funcionario funcionario) {
		boolean sucesso = funcionarioDAO.atualizar(funcionario);
		return sucesso;
	}

	public boolean salvar(Funcionario funcionario) {
		int idGerado = funcionarioDAO.salvar(funcionario);
		return idGerado > 0;
	}

	public String excluir(Funcionario funcionario, Funcionario funcionarioNovo) {
		String mensagem = "";
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

		if (funcionarioDAO.existeFuncionarioNovo(funcionarioNovo) == false) {
			mensagem = "Funcion�rio inexistente";
		} else {
			int statusPersistencia = funcionarioDAO.excluir(funcionario);

			if (statusPersistencia == 1) {
				mensagem = "Funcion�rio excluido com sucesso";
			} else if (statusPersistencia == 0) {
				mensagem = "Erro ao excluir Funcion�rio";
			}
		}
		return mensagem;
	}
}