-- INICIALIZANDO BANCO DE DADOS ecommerce
use ecommerce;

-- DESCREVENDO CAMPOS E SUAS ESPECIFICACOES
desc cliente;
desc departamento;
desc endereco;
desc itempedido;
desc pedido;
desc produto;

-- EXIBINDO TABELAS E SUAS INFORMACOES CADASTRADAS
select * from cliente;
select * from departamento;
select * from endereco;
select * from itempedido;
select * from pedido;
select * from produto;

-- POPULANDO TABELA DEPARTAMENTO
INSERT INTO departamento VALUES (null, "Tecnologia", "Hardwares, Computadores, Tablets, Celulares e mais");
INSERT INTO departamento VALUES (null, "Acessórios", "Cabos, Adaptadores, Carregadores, e mais");
INSERT INTO departamento VALUES (null, "Periféricos", "Headsets, Mouses, Teclados, e mais");
INSERT INTO departamento VALUES (null, "Games", "Jogos, Consoles, Acessórios Gamer");
INSERT INTO departamento VALUES (null, "Escritório", "Cadeiras, Papelaria e Home Office");
INSERT INTO departamento VALUES (null, "Geek", "Jogos, Consoles, Acessórios Gamer");

-- POPULANDO TABELA PRODUTO
INSERT INTO produto VALUES (null, "Computador Ultima Geração","Computaodr i9 32Gb Ram 1TbHD, Placa GTX1090",4000.0,10,1);
INSERT INTO produto VALUES (null, "Notebook Ultima Geração","Notebook i7 16 Gb Ram 500Gb HD SSD",3850.00,15,1);

INSERT INTO produto VALUES (null, "Cabo USB C","Cabo USB 2M para carregar celulares",50.0,20,2);
INSERT INTO produto VALUES (null, "Conector USB","Conector USB para recarga em tomada 3A",35,15,2);

INSERT INTO produto VALUES (null, "Headset Gamer","Sem Fio, Quantum 610 Wireless, Preto",799.90,20,3);
INSERT INTO produto VALUES (null, "Mouse Gamer","Chroma REGB, 7 botoes",105.99,30,3);

INSERT INTO produto VALUES (null, "Console XBOX One","Console XBOX One com Halo e 2 controles",1999.90,5,4);
INSERT INTO produto VALUES (null, "Console Playstation 5","Nao acompanha jogo, vem com 1 controle",2999.90,5,4);

INSERT INTO produto VALUES (null, "Cadeira"," Cadeira de escritório giratória ",199.90,15,5);
INSERT INTO produto VALUES (null, "Mesa para computador","Mesa gamer estrutura em MDF e MDP",2999.90,8,5);

INSERT INTO produto VALUES (null, "LEGO Technic - Fórmula e Porsche 99X Electric","Lego com 422 peças para apaixonados por Formula E e Porsche",309.90,18,6);
INSERT INTO produto VALUES (null, "Funko Pop Dragon Ball T4","Funko Pop do Gohan Roupas de Treino",95.0,6,6);

-- POPULANDO TABELA CLIENTE

INSERT INTO cliente VALUES (null, "Jose Alberto Neves","josealberto@mail.com","123456","987.654.321-00");
INSERT INTO cliente VALUES (null, "Antonio Oliveira","antoniooli@mail.com","987654","765.432.987.10");
INSERT INTO cliente VALUES (null, "Regina Brito","reginabrito@mail.com","010203","123.456.789-00");
INSERT INTO cliente VALUES (null, "Cassia Leal","cassia_leal@mail.com","200697","116.029.324-41");
INSERT INTO cliente VALUES (null, "Gustavo Soares","gustavosb@mail.com","659817","105.565.344-92");

-- POPULANDO TABELA ENDERECO
INSERT INTO endereco VALUES (null,"Av", "Brasil",100,"","01234-567","SP","Sao Paulo","Centro",1);
INSERT INTO endereco VALUES (null,"Rua","Major Silva",12,"Ap 12A","98765-432","SP","Itapecerica da Serra","Pitangueiras",1);
INSERT INTO endereco VALUES (null,"Rua","Heitor Vila Lobos",98,"Casa 2","06543-123","SP","Osasco","Vila das Flores",2);
INSERT INTO endereco VALUES (null,"Av","Raquel Meyer",173,"Ap 42 Bl 1","32987-122","ES","Vitoria","Centro",3);
INSERT INTO endereco VALUES (null,"Rua","Maria Tereza",495,"Casa 1","54740-000","PE","Recife","Centro",4);
INSERT INTO endereco VALUES (null,"Av","Domingos Paz",165,"","54640-003","PE","Recife","Varzea",5);

-- POPULANDO TABELA PEDIDO
INSERT INTO pedido VALUES (null,"F","2021-01-10",4000,0,4000,1);
INSERT INTO pedido VALUES (null,"F","2021-02-01",100,0,100,2);
INSERT INTO pedido VALUES (null,"F","2021-03-10",105.9,0,105.9,3);
INSERT INTO pedido VALUES (null,"F","2021-04-15",8000,1000,7000,1);
INSERT INTO pedido VALUES (null,"F","2021-05-05",1999.90,0,1999.90,2);
INSERT INTO pedido VALUES (null,"F","2021-06-08",2999.90,0,2999.90,3);
INSERT INTO pedido VALUES (null,"F","2021-07-10",250,0,250,2);
INSERT INTO pedido VALUES (null,"F","2021-08-22",350,0,350,2);
INSERT INTO pedido VALUES (null,"F","2021-09-19",190.0,0,190.0,3);
INSERT INTO pedido VALUES (null,"F","2021-10-07",3850,0,3850,4);
INSERT INTO pedido VALUES (null,"F","2021-11-01",50,0,50,1);
INSERT INTO pedido VALUES (null,"F","2021-12-05",1999.9,0,1999.9,1);
INSERT INTO pedido VALUES (null,"F","2022-12-05",2999.9,0,2999.9,5);
INSERT INTO pedido VALUES (null,"F","2022-12-12",4000,0,4000,3);

-- POPULANDO TABELA PEDIDOS
INSERT INTO itempedido VALUES (null, 1, 4000, 4000, 1, 1);
INSERT INTO itempedido VALUES (null, 2, 50, 100,3 , 2);
INSERT INTO itempedido VALUES (null, 1, 105.99, 105.99, 6, 3);
INSERT INTO itempedido VALUES (null, 2, 4000, 7000, 1, 4);
INSERT INTO itempedido VALUES (null, 1, 1999.9, 1999.9, 7, 5);
INSERT INTO itempedido VALUES (null, 1, 2999.9, 2999.9, 8, 6);
INSERT INTO itempedido VALUES (null, 5, 50, 250.0, 3, 7);
INSERT INTO itempedido VALUES (null, 1, 350.0, 350.0, 10, 8);
INSERT INTO itempedido VALUES (null, 2, 95.0, 190.0, 12, 9);
INSERT INTO itempedido VALUES (null, 1, 799.99, 799.99, 5, 10);
INSERT INTO itempedido VALUES (null, 1, 50.0, 50.0, 3, 11);
INSERT INTO itempedido VALUES (null, 1, 1999.9, 1999.9,7, 12);
INSERT INTO itempedido VALUES (null, 1, 2999.9, 2999.9, 8, 13);
INSERT INTO itempedido VALUES (null, 1, 4000, 4000, 1, 14);

select * from departamento;
select * from produto;

-- DELETANDO CAMPOS CRIADOS SEM NECESSIDADE
DELETE from departamento WHERE numero=15;
DELETE from departamento WHERE numero=16;
DELETE from departamento WHERE numero=17;
DELETE from departamento WHERE numero=18;
DELETE from departamento WHERE numero=19;
DELETE from departamento WHERE numero=20;
DELETE from produto WHERE codigo=13;
DELETE from produto WHERE codigo=14;
DELETE from produto WHERE codigo=15;
DELETE from produto WHERE codigo=16;
DELETE from produto WHERE codigo=17;
DELETE from produto WHERE codigo=18;
DELETE from produto WHERE codigo=19;
DELETE from produto WHERE codigo=20;
DELETE from produto WHERE codigo=21;
DELETE from produto WHERE codigo=22;
DELETE from produto WHERE codigo=23;
DELETE from produto WHERE codigo=24;

select * from pedido;

-- COMANDO PARA ALTERACAO DE NOME DAS TABELAS (EXEMPLO)
update departamento set nome="Informatica e Tecnologia" where numero=1;

-- COMANDO PARA ALTERACAO DE NOME DAS COLUNAS DA TABELA (EXEMPLO)
select id as 'codigo', nome as 'nomeCliente', cpf as 'cpfCliente' from cliente;

-- COMANDO PARA ORDENAÇÃO ALFABETICA DOS NOMES
select * from cliente order by nome asc;

-- COMANDO DE BUSCA POR CRITERIO (NESTE CASO PELO NOME)
select * from cliente where nome = 'Cassia Leal';

-- CONTAGEM DA QUANTIDADE DE CLIENTES
select count(id) from cliente;
select count(id) as totalClientes from cliente;

-- RECUPERANDO O TOTAL FATURADO (GERAL)
select sum(valorTotal) from pedido;

-- BUSCAR PRODUTOS POR PALAVRA CHAVE
select * from produto where nome like "%USB%";

-- PARA SABER QUANTOS PRODUTOS TEMOS EM CADA DEPARTAMENTO
select * from produto;
select num_depto, count(codigo) from produto
	group by num_depto;
    
-- SOMANDO O VALOR DE PRODUTOS QUE ESTAO NO ESTOQUE (PRODUTO A PRODUTO)
select num_depto, sum(preco) from produto
	group by num_depto;
    
select num_depto, sum(preco*estoque) from produto
	group by num_depto;
    
-- JUNÇÃO SIMPLES COMO PRODUTO CARTESIANO
select * from produto inner join departamento 
	on produto.num_depto = departamento.numero ;

-- RECUPERANDO CLIENTES E SEUS ENDEREÇOS
select * from cliente inner join endereco 
	on endereco.id_cliente = cliente.id ;
    
-- JUNÇÃO DE MAIS DE UMA TABELA
select * from pedido;
select * from itempedido;
select * from pedido 
	inner join itempedido on pedido.numPedido = itempedido.numero_pedido
    inner join produto on produto.codigo = itempedido.codigo_produto
	inner join cliente on pedido.id_cliente = cliente.id;
    
-- BUSCANDO DADOS DO PEDIDO + NOME CLIENTE + PRODUTO COMPRADO
select pedido.numPedido, pedido.data, pedido.valorTotal,
	pedido.desconto, pedido.valorLiquido, cliente.nome,
    produto.nome from pedido 
	inner join itempedido on pedido.numPedido = itempedido.numero_pedido
    inner join produto on produto.codigo = itempedido.codigo_produto
	inner join cliente on pedido.id_cliente = cliente.id
    order by pedido.numPedido;
    
-- VALOR TOTAL DE PEDIDOS POR CLIENTE
select cliente.nome , pedido.id_cliente, sum(pedido.valorLiquido)
	from pedido inner join cliente on pedido.id_cliente = cliente.id
    group by pedido.id_cliente;

-- JUNÇÃO DE TABELAS SEM RELAÇÃO ENTRE SI
select * from departamento inner join produto on
	departamento.numero = produto.num_depto;
    
-- INSERINDO NOVO DEPARTAMENTO
insert into departamento values (null, "Moveis", "Moveis para escritorios e gamers");
select * from departamento;

-- JUNÇÃO EXTERNA (outer join)
select * from departamento left outer join produto
	on departamento.numero = produto.num_depto;
    
-- USANDO right join
select * from produto right outer join departamento
	on departamento.numero = produto.num_depto;
    
-- SELECIONANDO PRODUTOS MAIS CAROS
select * from produto order by preco desc;
select * from produto order by preco desc limit 1;

select * from produto having max(preco);
select* from produto where preco = (select max(preco) from produto);

-- PEDIDOS QUE CONTEM O PRODUTO MAIS CARO
select * from pedido inner join itempedido
	on itempedido.numero_pedido = pedido.numPedido
    where itempedido.codigo_produto = 
    (select codigo from produto having max(preco));
    
-- CLIENTES QUE COMPRARAM PRODUTO MAIS CARO
select * from cliente 
	inner join pedido on cliente.id = pedido.id_cliente
    inner join itempedido on itempedido.numero_pedido = pedido.numPedido
    where itempedido.codigo_produto = 
    (select codigo from produto having max(preco));