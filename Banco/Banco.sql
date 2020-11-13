create table banco 
(
	cpf varchar(11) primary key,
	nome varchar(30),
	saldo int
)

select * from banco

--querys usadas no projeto java 

insert into banco (cpf, nome, saldo) values (?,?,'0')

select saldo, cpf from banco where cpf = ?

select cpf from banco where cpf = ?

select saldo,cpf from banco where cpf = ?

select * from banco where cpf = ?

select * from banco where cpf = ? and nome = ?

select cpf from banco where cpf = ?