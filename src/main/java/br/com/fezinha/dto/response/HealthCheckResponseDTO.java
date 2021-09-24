package br.com.fezinha.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class HealthCheckResponseDTO {

	private String application;
	private int status;
	private String message;
}