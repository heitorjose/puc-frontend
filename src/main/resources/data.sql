INSERT INTO tb_setor(id,nome) values(1,'caixa');
INSERT INTO tb_setor(id,nome) values(2,'repositor');
INSERT INTO tb_setor(id,nome) values(3,'cliente');
INSERT INTO tb_setor(id,nome) values(4,'gerente');

INSERT INTO tb_usuario (id,email,nome,senha,setor_id) values(1,'hugo@gmail.com','hugo','123',2);
INSERT INTO tb_fornecedor(id,nome,cnpj,endereco) values(1,'NESTLE LTDA',123456789,'Rua LISBOA');
INSERT INTO tb_fornecedor(id,nome,cnpj,endereco) values(2,'DANONE LTDA',111222333,'Rua Santos Dumont');

INSERT INTO tb_local(id,nome) values(1,'LOJA');
INSERT INTO tb_local(id,nome) values(2,'ESTOQUE');

INSERT INTO tb_tipo_local_produto(id,local_id,quantidade) values(1,1,200);
INSERT INTO tb_tipo_local_produto(id,local_id,quantidade) values(2,2,100);
INSERT INTO tb_tipo_local_produto(id,local_id,quantidade) values(3,1,500);
INSERT INTO tb_tipo_local_produto(id,local_id,quantidade) values(4,2,600);

INSERT INTO tb_produto(id,nome,validade,fornecedor_id) VALUES(1,'Yorgut Natural','2024-05-05',1);
INSERT INTO tb_produto(id,nome,validade,fornecedor_id) VALUES(2,'Leite Fermentado','2025-05-05',2);

INSERT INTO TB_PRODUTO_LOCAL_PRODUTOS(produto_final_id,local_produtos_id) values(1,1);
INSERT INTO TB_PRODUTO_LOCAL_PRODUTOS(produto_final_id,local_produtos_id) values(1,2);
INSERT INTO TB_PRODUTO_LOCAL_PRODUTOS(produto_final_id,local_produtos_id) values(2,3);
INSERT INTO TB_PRODUTO_LOCAL_PRODUTOS(produto_final_id,local_produtos_id) values(2,4);