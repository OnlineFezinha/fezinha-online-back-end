package br.com.fezinha.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -7462839784622702497L;
	
	@Column(name = "excluido")
	private boolean excluido = Boolean.FALSE;
	
	@Column(name = "ativo")
	private boolean ativo = Boolean.TRUE;
	
	@SuppressWarnings("deprecation")
	@Column(columnDefinition = "TEXT", name = "justificativa_inativacao")
	@Type(type = "text")
	private String justificativaInativacao;

	@CreationTimestamp
	@Column(nullable = false, columnDefinition = "timestamp", name = "data_insercao")
	private LocalDateTime dataInsercao;
	
	@UpdateTimestamp
	@Column(nullable = false, columnDefinition = "timestamp", name = "data_alteracao")
	private LocalDateTime dataAlteracao;

}
