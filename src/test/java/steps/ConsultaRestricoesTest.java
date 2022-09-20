package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.ConsultaRestricoesPage;

public class ConsultaRestricoesTest {
	
	ConsultaRestricoesPage restricoes = new ConsultaRestricoesPage();
	

	@Dado("que consulte cpf de um cliente com restricao")
	public void queConsulteCpfDeUmClienteComRestricao() {
		restricoes.acessarConsulta("26276298085");
	}
	@Entao("valido o status code")
	public void validoOStatusCode() {
		restricoes.status();
	}
	@Entao("valido a mensagem de retorno")
	public void validoAMensagemDeRetorno() {
		restricoes.msg("");
	}

	@Dado("que consulte cpf de um cliente sem restricao")
	public void queConsulteCpfDeUmClienteSemRestricao() {
		restricoes.acessarConsulta("66414919004");
	}






}
