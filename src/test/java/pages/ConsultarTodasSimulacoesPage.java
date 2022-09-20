package pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import org.hamcrest.core.StringContains;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ConsultarTodasSimulacoesPage {
	
	Response response;

	public Response acessarConsulta() {
		response = RestAssured.get("http://localhost:8080/api/v1/simulacoes");
		return response;
	}

	public void statusCode() {
		int status = response.statusCode();
		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
		System.out.println("************************************");
		if (statusCode == 200) {
			System.out.println("Todas as simulacoes cadastradas  ("+statusCode+")");
		} else if (statusCode == 204) {
			System.out.println("Nao existe nenhuma simulacao cadastrada ("+statusCode+")");
		} else {
			System.out.println("ERRO - " + statusCode);
		}
		System.out.println("                                      ");

	}

	public void body(String texto) {
		String bodyResponse = response.asPrettyString();
		assertThat(bodyResponse, StringContains.containsString(texto));
		System.out.println(bodyResponse);
		System.out.println("************************************");

	}

}
