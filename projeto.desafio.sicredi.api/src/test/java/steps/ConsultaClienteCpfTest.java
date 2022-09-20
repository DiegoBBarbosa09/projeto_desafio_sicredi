package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.ConsultaClienteCpfPage;

public class ConsultaClienteCpfTest {
	
	ConsultaClienteCpfPage cliente = new ConsultaClienteCpfPage();


	@Dado("que consulte cpf de um cliente cadastrado")
	public void queConsulteCpfDeUmClienteCadastrado() {
		cliente.acessarConsulta("17822386034");
	}
	@Entao("valido o status code do cadastro")
	public void validoOStatusCodeDoCadastro() {
		cliente.status();
	}
	@Entao("valido a mensagem de retorno cpf")
	public void validoAMensagemDeRetornoCpf() {
		cliente.msg("");
	}
	
	@Dado("que consulte cpf de um cliente sem cadastro")
	public void queConsulteCpfDeUmClienteSemCadastro() {
		cliente.acessarConsulta("66513986010");

	}






}
