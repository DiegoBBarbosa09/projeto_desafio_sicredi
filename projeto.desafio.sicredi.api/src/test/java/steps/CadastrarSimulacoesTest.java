package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.CadastrarSimulacoesPage;

public class CadastrarSimulacoesTest {
	
	CadastrarSimulacoesPage cadastrar = new CadastrarSimulacoesPage();

	@Dado("que cadastre uma simulacao")
	public void queCadastreUmaSimulacao() {
		cadastrar.novoCadastro("Miranda", "00328145009", "miranda@hotmail.com", "25000", "25", true);
	   
	}
	@Entao("validar Status Code")
	public void validarStatusCode() {
		cadastrar.statusCode();
	}
	@Entao("validar mensagem de retorno")
	public void validarMensagemDeRetorno() {
		cadastrar.body("");
	}

	@Dado("que tente cadastrar uma simulacao dados em branco")
	public void queTenteCadastrarUmaSimulacaoDadosEmBranco() {
		cadastrar.novoCadastro("  ", "  ", "   ", "", " ", true);
		/* requisicao esta aceitando campos nome, cpf e email em branco
		 * */	
	}

	@Dado("que tente cadastrar uma simulacao com valor menor que {string}")
	public void queTenteCadastrarUmaSimulacaoComValorMenorQue(String string) {
		cadastrar.novoCadastro("Gustavo", "17310466004", "gustavo@hotmail.com", "900", "52", true);
	    /* A requisicao cadastrar nao esta obedecendo a regra de negocio onde valor nao poderia ser menor que 1000,
	     * Mas esta aceitando abaixo e as parcelas esta aceitando acima de 48
	     * */
	}
	@Dado("parcelas maior que {string}")
	public void parcelasMaiorQue(String string) {
	   
	}

	@Dado("que tente cadastrar uma simulacao com valor maior que {string}")
	public void queTenteCadastrarUmaSimulacaoComValorMaiorQue(String string) {
		cadastrar.novoCadastro("Hamilton", "32918578010", "hamilton@hotmail.com", "40001", "1", true);
	}

	@Dado("que teste cadastrar uma simulacao com cpf existente")
	public void queTesteCadastrarUmaSimulacaoComCpfExistente() {
		cadastrar.novoCadastro("Robson", "61775340074", "robson@hotmail.com", "30000", "48", true);
		/*Status Code esta retornando 400 ao inves de 409 para cpf ja existente
		 * */
	}














}
