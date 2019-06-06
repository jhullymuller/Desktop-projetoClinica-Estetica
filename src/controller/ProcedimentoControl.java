package controller;

import bo.CadastroProcedimentoBO;
import model.vo.Procedimento;

public class ProcedimentoControl {
	// Verificar se os campos s�o nulos ou vazios senao chamar BO
	private static final CadastroProcedimentoBO cadastroProcedimentoBO = new CadastroProcedimentoBO();

	public static String salvar(String nome, String sala) {
		String mensagem = "";
		if (nome == null || nome.trim().isEmpty()) {
			mensagem += "Erro por favor digite um nome, e sem espa�o \n";
		}
		if (sala == null || sala.trim().isEmpty()) {
			mensagem += "Erro por favor digite uma sala, e sem espa�o \n";
		}
		// validar o preenchimento dos campos - nao nulos e nao vazios
		if (mensagem.isEmpty()) {
			Procedimento procedimento = new Procedimento();
			procedimento.setNome(nome);
			procedimento.setSala(sala);
			cadastroProcedimentoBO.salvar(procedimento);
			return null;
		}
		return mensagem;
	}

	public static boolean close() {
		return false;
	}

}