package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.ConsultarTodasSimulacoesPage;

public class ConsultarTodasSimulacoesTest {
	
	ConsultarTodasSimulacoesPage consultar = new ConsultarTodasSimulacoesPage();

	@Dado("que consulte todas as simulacoes")
	public void queConsulteTodasAsSimulacoes() {
		consultar.acessarConsulta();
	}
	@Entao("valido o status code da simulacao")
	public void validoOStatusCodeDaSimulacao() {
		consultar.statusCode();

	}
	@Entao("valido a mensagem de retorno da simulacao")
	public void validoAMensagemDeRetornoDaSimulacao() {
		consultar.body("");
	}




}
