#language: pt
#Author: diegobrito.b09@gmail.com

@deletar
Funcionalidade: Deletar simulacoes
  Eu como usuario quero deletar simulacoes

   
 Cenario: Deletar simulacao de cliente no banco de dados
 Dado que delete um cliente por id
 Entao valido o status code retornado
 E valido a mensagem de confirmacao
 
  Cenario: Deletar simulacao de cliente no banco de dados
 Dado que delete um cliente por id inexistente
 Entao valido o status code retornado
 E valido a mensagem de confirmacao
 
