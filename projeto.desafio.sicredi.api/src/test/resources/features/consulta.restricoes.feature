#language: pt
#Author: diegobrito.b09@gmail.com

@restricoes
Funcionalidade: Consulta para simulacoes
  Eu como usuario quero acessar sistema para fazer consulta

   
 Cenario: Consulta de cpf com restricao
 Dado que consulte cpf de um cliente com restricao
 Entao valido o status code
 E valido a mensagem de retorno
 
 Cenario: Consulta de cpf sem restricao
  Dado que consulte cpf de um cliente sem restricao
  Entao valido o status code
  E valido a mensagem de retorno
 