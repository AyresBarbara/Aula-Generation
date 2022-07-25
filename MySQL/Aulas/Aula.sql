-- comando para criar banco de dados

CREATE DATABASE db_lojinha;
USE db_lojinha;

CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT,
nome_produto VARCHAR(255),
valor DECIMAL (8,2), -- numeros aceitos no total, numeros depois da virgula
quantidade INT,
pagamento_cartao BOOLEAN,

PRIMARY KEY (id)
);
SELECT* FROM tb_produtos;
-- inserir - tabela - variaveis na ordem que foi criado - VALUES - dados
INSERT INTO tb_produtos(nome_produto, valor, quantidade, pagamento_cartao)VALUES("Camiseta", 25.59, 5, true);