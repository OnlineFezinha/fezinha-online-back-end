CREATE TABLE if NOT EXISTS t_fezinha (
	id int8 NOT NULL,
	excluido bool NULL,
	ativo bool NULL,
	justificativa_inativacao text NULL,
	data_alteracao timestamp NOT NULL,
	data_insercao timestamp NOT NULL,
	nome varchar(255) NULL,
	CONSTRAINT t_fezinha_pkey PRIMARY KEY (id)
);