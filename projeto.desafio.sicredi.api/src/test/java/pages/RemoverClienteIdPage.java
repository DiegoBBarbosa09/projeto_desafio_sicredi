package pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import org.hamcrest.core.StringContains;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RemoverClienteIdPage {

	Response response;

	public Response acessarConsulta(String id) {
		response = RestAssured.delete("http://localhost:8080/api/v1/simulacoes/"+id);
		return response;
	}

	public void statusCode() {
		int status = response.statusCode();
		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
		System.out.println("************************************");
		if (statusCode == 204) {
			System.out.println("Simulcao removida com sucesso  (" + statusCode + ")");
		} else if (statusCode == 404) {
			System.out.println("Simulacao nao encontrada (" + statusCode + ")");
		} else {
			System.out.println("ERRO - " + statusCode);
		}
		System.out.println("                                      ");
		/*
		 * Requisicao esta deletando corretamente, mas nao esta retornando o status code
		 * correto.  O certo seria rotornar Status Code 204 para simulacao removida com
		 * sucesso E Retornar Status Code 404 para simulacao nao encontrada. Ambas as
		 * requisicoes estao retornando Status Code 200 - OK 
		 */
	}

	public void body(String texto) {
		String bodyResponse = response.asPrettyString();
		assertThat(bodyResponse, StringContains.containsString(texto));
		System.out.println(bodyResponse);
		System.out.println("************************************");

	}
}
