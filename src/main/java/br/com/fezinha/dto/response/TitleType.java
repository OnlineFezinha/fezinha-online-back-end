package br.com.fezinha.dto.response;

import lombok.Getter;

@Getter
public enum TitleType {
	

		SUCESSO_AO_CADASTRAR("sucesso-ao-cadastrar"),
		SUCESSO_AO_BUSCAR_DADOS("sucesso-ao-buscar-dados"),
		APLICACAO_ONLINE("aplicacao-online"),
		DADOS_INVALIDOS("dados-invalidos"),
		ACESSO_NEGADO("acesso-negado"),
		ERRO_DE_SISTEMA("erro-de-sistema"),
		PARAMETRO_INVALIDO("parametro-invalido"),
		MENSAGEM_INCOMPREENSIVEL("mensagem-incompreensivel"),
		RECURSO_NAO_ENCONTRADO("recurso-nao-encontrado"),
		ERRO_NEGOCIO("erro-regra-de-negocio");
		
		private String title;
		
		TitleType(String title) {
			this.title = title;
		}

}