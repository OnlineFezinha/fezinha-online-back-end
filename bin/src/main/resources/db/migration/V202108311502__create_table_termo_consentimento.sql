CREATE TABLE if NOT EXISTS t_termo_consentimento (
	id int8 NOT NULL,
	fezinha_id int8 NOT NULL,
	excluido bool NULL,
	ativo bool NULL,
	justificativa_inativacao text NULL,
	data_alteracao timestamp NOT NULL,
	data_insercao timestamp NOT NULL,
	descricao varchar(255) NULL,
	CONSTRAINT t_termo_consentimento_pkey PRIMARY KEY (id)
);