#language: pt
#Author: diegobrito.b09@gmail.com

@alterar
Funcionalidade: Alterar dados de simulacoes
  Eu como usuario quero alterar infomacoes de clientes

   
 Cenario: Alterar dados de cadastro existente
 Dado que altere alguma informacao em cadastro existente
 Entao valido o status code da solicitacao
 E valido a mensagem de retorno da alteracao
 
 Cenario: Alterar dados de cadastro nao tenha no banco de dados
 Dado que busque informacoes de um cpf para alterar dados
 Entao valido o status code da solicitacao
 E valido a mensagem de retorno da alteracao
 