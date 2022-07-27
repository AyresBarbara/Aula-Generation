CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT,
categoria VARCHAR (20),

PRIMARY KEY(id)
);

CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(20),
preco DECIMAL(5,2),
quantidade INT,
codigo_barras BIGINT,
receita BOOLEAN,
categoria_id BIGINT,

FOREIGN KEY (categoria_id)REFERENCES tb_categorias(id)

);

SELECT*FROM tb_categorias;

INSERT INTO tb_categorias(categoria) VALUES ("Remédio");
INSERT INTO tb_categorias(categoria) VALUES ("Higiene");
INSERT INTO tb_categorias(categoria) VALUES ("Bebê");
INSERT INTO tb_categorias(categoria) VALUES ("Tarja Preta");
INSERT INTO tb_categorias(categoria) VALUES ("Beleza");

SELECT*FROM tb_produtos;

INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Dipirona", 5.00, 1, 12345, false, 1);
INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Fralda", 15.00, 1, 54321, false, 3);
INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Esmalte", 8.00, 1, 39847, false, 5);
INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Rivotril", 12.00, 1, 13475, true, 4);
INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Sabonete", 5.00, 1, 12324, false, 2);
INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Cotonete", 5.00, 1, 19865, false, 2);
INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Captopril", 4.50, 1, 08545, false, 1);
INSERT INTO tb_produtos(nome, preco, quantidade, codigo_barras, receita, categoria_id) VALUES ("Pomada", 10.00, 1, 14855, false, 3);

SELECT*FROM tb_produtos WHERE preco> 9.00; -- meus produtos são baratos para o parametro 50.00
SELECT*FROM tb_produtos WHERE preco BETWEEN 5.00 AND 20.00; -- produtos com parametro menor que 60.00

SELECT*FROM tb_produtos INNER JOIN tb_categorias
ON tb_categorias.id = tb_produtos.categoria_id;

SELECT*FROM tb_produtos WHERE nome LIKE "c%";
 
 SELECT*FROM tb_produtos INNER JOIN tb_categorias
 ON tb_produtos.categoria_id = tb_categorias.id WHERE tb_categorias.id = 5;