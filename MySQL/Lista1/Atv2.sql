CREATE DATABASE db_labrabaatelier;

USE db_labrabaatelier;
CREATE TABLE tb_produtos(
id BIGINT(5) AUTO_INCREMENT,

cliente VARCHAR(10),
produto VARCHAR(10),
cor VARCHAR (15),
valor DECIMAL(5,2),
quantidade INT,

PRIMARY KEY (id)
);
SELECT*FROM tb_produtos;

INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Bárbara","Touca", "Azul", 14.00, 1);
INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Ruth","Kit", "Amarelo", 30.00, 2);
INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Karol","6 pompons", "Colorido", 15.00, 1);
INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Fabiana","Touca", "Preta", 14.00, 1);
INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Lala","Touca", "Rosa", 14.00, 1);
INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Ranny","Kit", "Verde", 30.00, 1);
INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Hirla","Touca", "Lilas", 14.00, 1);
INSERT INTO tb_produtos(cliente, produto, cor, valor, quantidade)VALUES ("Lila","1 pompom", "Pink", 3.00, 1);

SELECT*FROM tb_produtos;
SELECT*FROM tb_produtos WHERE valor >15.00;
SELECT*FROM tb_produtos WHERE valor <15.00;
UPDATE tb_produtos SET valor = 16.00 WHERE id= 3;

DELETE FROM tb_produtos WHERE id=8;
UPDATE tb_produtos SET id=8 WHERE id=9;

