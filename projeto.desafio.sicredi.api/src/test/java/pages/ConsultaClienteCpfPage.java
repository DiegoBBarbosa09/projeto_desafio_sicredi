package pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import org.hamcrest.core.StringContains;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ConsultaClienteCpfPage {

	Response response;

	public Response acessarConsulta(String cpf) {
		response = RestAssured.get("http://localhost:8080/api/v1/simulacoes/"+cpf);
		return response;
	}

	public void status() {
		int status = response.statusCode();
		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
		System.out.println("************************************");
		if (statusCode == 200) {
			System.out.println("O CPF pussui uma simulacao  (" + statusCode + ")");
		} else if (statusCode == 404) {
			System.out.println("O CPF nao possui simulacao  (" + statusCode + ")");
		}
		System.out.println("                                      ");

	}

	public void msg(String texto) {
		String bodyResponse = response.asPrettyString();
		assertThat(bodyResponse, StringContains.containsString(texto));
		System.out.println(bodyResponse);
		System.out.println("************************************");
	}
}
