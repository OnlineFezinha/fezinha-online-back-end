CREATE TABLE if NOT EXISTS t_aposta (
	id int8 NOT NULL,
	fezinha_id int8 NOT NULL,
	excluido bool NULL,
	ativo bool NULL,
	justificativa_inativacao text NULL,
	data_alteracao timestamp NOT NULL,
	data_insercao timestamp NOT NULL,
	valor numeric(5,2) NOT NULL,
	CONSTRAINT t_aposta_pkey PRIMARY KEY (id)
);