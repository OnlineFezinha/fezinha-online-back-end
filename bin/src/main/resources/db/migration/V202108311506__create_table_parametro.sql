CREATE TABLE if NOT EXISTS t_parametro (
	id int8 NOT NULL,
	fezinha_id int8 NOT NULL,
	excluido bool NULL,
	ativo bool NULL,
	justificativa_inativacao text NULL,
	data_alteracao timestamp NOT NULL,
	data_insercao timestamp NOT NULL,
	descricao varchar(255) NOT NULL,
	chave varchar(255) NOT NULL,
	valor varchar(255) NOT NULL,
	CONSTRAINT t_parametro_pkey PRIMARY KEY (id)
);