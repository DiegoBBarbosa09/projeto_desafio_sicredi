package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.AlterarDadosClientesPage;

public class AlterarDadosClientesTest {
	
	AlterarDadosClientesPage alterar = new AlterarDadosClientesPage();

	@Dado("que altere alguma informacao em cadastro existente")
	public void queAltereAlgumaInformacaoEmCadastroExistente() {
		alterar.alterarCadastro("fulano de Tal", "66414919004", "fulanotal@hotmail.com", "15000", "20", true);
	}
	@Entao("valido o status code da solicitacao")
	public void validoOStatusCodeDaSolicitacao() {
		alterar.statusCode();
	}
	@Entao("valido a mensagem de retorno da alteracao")
	public void validoAMensagemDeRetornoDaAlteracao() {
		alterar.body("");
	}
	
	@Dado("que busque informacoes de um cpf para alterar dados")
	public void queBusqueInformacoesDeUmCpfParaAlterarDados() {
		alterar.alterarCadastro("Amaral", "48147968035", "amaral@hotmail.com", "15000", "20", true);

	}






	
}
