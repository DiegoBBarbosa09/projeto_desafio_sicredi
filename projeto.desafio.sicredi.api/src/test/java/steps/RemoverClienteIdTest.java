package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.RemoverClienteIdPage;

public class RemoverClienteIdTest {
	
	RemoverClienteIdPage deletar = new RemoverClienteIdPage(); 
	
	@Dado("que delete um cliente por id")
	public void queDeleteUmClientePorId() {
		deletar.acessarConsulta("11");
	   
	}
	@Entao("valido o status code retornado")
	public void validoOStatusCodeRetornado() {
		deletar.statusCode();
	}
	@Entao("valido a mensagem de confirmacao")
	public void validoAMensagemDeConfirmacao() {
	    deletar.body("");
	}
	

	@Dado("que delete um cliente por id inexistente")
	public void queDeleteUmClientePorIdInexistente() {
	    deletar.acessarConsulta("8");
	}







}
