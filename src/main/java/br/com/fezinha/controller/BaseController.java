package br.com.fezinha.controller;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fezinha.dto.response.ResponseDTO;
import br.com.fezinha.dto.response.TitleType;

@SuppressWarnings("rawtypes")
public class BaseController {

	private static final String SUA_REQUISICAO_FOI_PROCESSADA_COM_SUCESSO = "Sua requisição foi processada com sucesso!";

	protected ResponseEntity<Object> ok(Object data) {
		
		ResponseDTO response = buildResponse(
				data, 
				HttpStatus.OK.value(), 
				TitleType.SUCESSO_AO_BUSCAR_DADOS);
		
		return ResponseEntity.ok().body(response);
	}
	
	protected ResponseEntity<Object> okHealthCheck(Object data) {
		
		ResponseDTO response = buildResponse(
				data, 
				HttpStatus.OK.value(), 
				TitleType.APLICACAO_ONLINE);
		
		return ResponseEntity.ok().body(response);
	}

	protected ResponseEntity<Object> created(Long id, Object data) {
		
		ResponseDTO response = buildResponse(
				data, 
				HttpStatus.CREATED.value(), 
				TitleType.SUCESSO_AO_CADASTRAR);
		
		return ResponseEntity.created(ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(id)
				.toUri())
			.body(response);
	}
	
	protected ResponseEntity<Void> noContent() {
		return ResponseEntity.noContent().build();
	}
	
	private ResponseDTO buildResponse(Object data, int statusCode, TitleType titleType) {
		return ResponseDTO.builder()
				.status(statusCode)
				.data(data)
				.title(titleType.getTitle())
				.detail(SUA_REQUISICAO_FOI_PROCESSADA_COM_SUCESSO)
				.userMessage(SUA_REQUISICAO_FOI_PROCESSADA_COM_SUCESSO)
				.timestamp(OffsetDateTime.now())
				.build();
	}
}