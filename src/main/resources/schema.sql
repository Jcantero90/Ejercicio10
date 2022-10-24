CREATE TABLE persona (
  id_persona INT AUTO_INCREMENT NOT NULL,
   usuario VARCHAR(255) NOT NULL,
   password VARCHAR(255) NULL,
   name VARCHAR(255) NULL,
   supername VARCHAR(255) NULL,
   company_email VARCHAR(255) NULL,
   city VARCHAR(255) NULL,
   active BIT(1) NOT NULL,
   created_date date NULL,
   imagen_url VARCHAR(255) NULL,
   termination_date date NULL,
   CONSTRAINT pk_persona PRIMARY KEY (id_persona)
);