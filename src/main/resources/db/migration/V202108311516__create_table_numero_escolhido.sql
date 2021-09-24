CREATE TABLE if NOT EXISTS t_numero_escolhido (
	id int8 NOT NULL,
	aposta_id int8 NOT NULL,
	excluido bool NULL,
	ativo bool NULL,
	justificativa_inativacao text NULL,
	data_alteracao timestamp NOT NULL,
	data_insercao timestamp NOT NULL,
	numero_escolhido int8 NOT NULL,
	acertou bool NOT NULL default false,
	CONSTRAINT t_numero_escolhido_pkey PRIMARY KEY (id)
);