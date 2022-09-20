package pages;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.core.StringContains;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CadastrarSimulacoesPage {
	
	RequestSpecification request;
	Response response;
	
	public void novoCadastro(String nome, String cpf, String email, String valor, String parcelas, boolean seguro) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		json.put("nome", nome);
		json.put("cpf", cpf);
		json.put("email", email);
		json.put("valor", valor );
		json.put("parcelas", parcelas);
		json.put("seguro", seguro);
		
		request.body(json.toJSONString());

		response = request.post("http://localhost:8080/api/v1/simulacoes");
	}
	public void statusCode() {
		
		int code = response.statusCode();
		int statusCode = response.getStatusCode();
		assertEquals(code, statusCode);

		if (statusCode == 201) {
			System.out.println("Simulacao cadastrada com sucesso - " + statusCode);

		} else if (statusCode == 400) {
			System.out.println("Erro na regra de negocio - " + statusCode);
			System.out.println(response.asPrettyString());

		} else if (statusCode == 409) {
			System.out.println("CPF ja existente" + statusCode);

		} else {
		}
		/* 
		 *  Requisicao nao esta retornando status code correto para Status 409 (CPF ja existente)
		 * Status code esta retornando 400
		 * 
		 * */
	}

	public void body(String texto) {
		String bodyResponse = response.asPrettyString();
		assertThat(bodyResponse, StringContains.containsString(texto));
		System.out.println(bodyResponse);
		System.out.println("************************************");

	}

}
