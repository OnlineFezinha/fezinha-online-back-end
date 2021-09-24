package br.com.fezinha.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fezinha.dto.response.HealthCheckResponseDTO;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HealthCheckController extends BaseController {
	
	@GetMapping
	public ResponseEntity<Object> check() {

		log.info("Health Check: " + LocalDateTime.now());
		
		HealthCheckResponseDTO checkDTO = HealthCheckResponseDTO.builder()
				.application("API - Fezinha Online")
				.status(HttpStatus.OK.value())
				.message("Health")
				.build();
		
		return okHealthCheck(checkDTO);
	}

}