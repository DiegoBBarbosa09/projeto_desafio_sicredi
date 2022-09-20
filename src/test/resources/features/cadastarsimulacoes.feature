#language: pt
#Author: diegobrito.b09@gmail.com

@cadastrar
 Funcionalidade: Cadastrar novas simulcoes
  Eu como usuario quero acessar sistema para fazer consulta

   
 Cenario: Cadastrar nova simulacao
 Dado que cadastre uma simulacao
 Entao validar Status Code
 E validar mensagem de retorno
 
 Cenario: Cadastrar nova simulacao em branco
 Dado que tente cadastrar uma simulacao dados em branco
 Entao validar Status Code
 E validar mensagem de retorno
 
 Cenario: Cadastrar nova simulacao fora da regra de negocio
 Dado que tente cadastrar uma simulacao com valor menor que "1000"
 E parcelas maior que "48"
 Entao validar Status Code
 E validar mensagem de retorno
 
Cenario: Cadastrar nova simulacao fora da regra de negocio
 Dado que tente cadastrar uma simulacao com valor maior que "40000"
 E parcelas maior que "2"
 Entao validar Status Code
 E validar mensagem de retorno
 
 Cenario: Cadastrar nova simulacao com cpf existente
 Dado que teste cadastrar uma simulacao com cpf existente
 Entao validar Status Code
 E validar mensagem de retorno

 

