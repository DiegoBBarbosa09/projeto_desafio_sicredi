package pages;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.core.StringContains;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ConsultaRestricoesPage {
	
	Response response;

	public Response acessarConsulta(String cpf) {
		response = RestAssured.get("http://localhost:8080/api/v1/restricoes/"+cpf);
		return response;
	}

	public void status() {
		int status = response.statusCode();
		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
		System.out.println("************************************");
		if (statusCode == 200) {
			System.out.println("CPF possui restricao ("+statusCode+")");
		} else if (statusCode == 204) {
			System.out.println("CPF n�o possui restricao ("+statusCode+")");
		} else {
			System.out.println("ERRO  ("+statusCode+")");
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
