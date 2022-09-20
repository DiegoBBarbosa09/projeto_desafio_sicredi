#language: pt
#Author: diegobrito.b09@gmail.com

@cliente
Funcionalidade: Consulta para simulacoes por cpf
  Eu como usuario quero acessar sistema para fazer consulta
   
 Cenario: Consulta de cpf cadastro
 Dado que consulte cpf de um cliente cadastrado
 Entao valido o status code do cadastro
 E valido a mensagem de retorno cpf
 
 Cenario: Consulta de cpf sem cadastro
  Dado que consulte cpf de um cliente sem cadastro
  Entao valido o status code do cadastro
  E valido a mensagem de retorno cpf
 

