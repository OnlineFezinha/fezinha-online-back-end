package br.com.fezinha.dto.response;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDTO<T> {

	private T data;

	private int status;
	
	private OffsetDateTime timestamp;
	
	private String title;
	
	private String detail;
	
	private String userMessage;
	
	@Getter
	@Builder
	public static class Object {
		
		private String name;
		
		private String userMessage;
		
	}
	
}