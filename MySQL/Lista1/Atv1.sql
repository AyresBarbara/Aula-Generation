CREATE DATABASE db_rh;

USE db_rh;
CREATE TABLE tb_colaboradores(
id BIGINT(5)AUTO_INCREMENT,
nome VARCHAR (20),
funcao VARCHAR (15),
salario DECIMAL (8,2),
vale_transp BOOLEAN,
faltas int,

PRIMARY KEY (id)
);
SELECT* FROM tb_colaboradores;

INSERT INTO tb_colaboradores (nome, funcao, salario, vale_transp, faltas)VALUES ("Barbara", "Engenheira", 3500, false, 1);
INSERT INTO tb_colaboradores (nome, funcao, salario, vale_transp, faltas)VALUES ("Julio", "Desenvolvedor", 4500, true, 0);
INSERT INTO tb_colaboradores (nome, funcao, salario, vale_transp, faltas)VALUES ("Addonis", "Jovem-Aprendiz", 800, true, 1);
INSERT INTO tb_colaboradores (nome, funcao, salario, vale_transp, faltas)VALUES ("Robson", "Estagiario", 1200, false, 2);
INSERT INTO tb_colaboradores (nome, funcao, salario, vale_transp, faltas)VALUES ("Kamilla", "Fisioterapeuta", 2100, true, 1);

SELECT*FROM tb_colaboradores;

SELECT*FROM tb_colaboradores WHERE salario>2000;
SELECT*FROM tb_colaboradores WHERE salario<2000;
UPDATE tb_colaboradores SET faltas=3 WHERE  id=4;
