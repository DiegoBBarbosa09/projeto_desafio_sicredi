package pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import org.hamcrest.core.StringContains;
import org.json.simple.JSONObject;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AlterarDadosClientesPage {

	Response response;
	RequestSpecification request;

	public void alterarCadastro(String nome, String cpf, String email, String valor, String parcelas, boolean seguro) {
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("nome", nome);
		json.put("cpf", cpf);
		json.put("email", email);
		json.put("valor", valor);
		json.put("parcelas", parcelas);
		json.put("seguro", seguro);
		request.body(json.toJSONString());

		response = request.put("http://localhost:8080/api/v1/simulacoes/"+cpf);

	}

	public void statusCode() {
		int code = response.statusCode();
		int codeRetornado = response.getStatusCode();
		if (code == 200) {
			System.out.println("Alteracao realizada com sucesso (" + code + ")");
			assertEquals(code, codeRetornado);
		} else if (code == 404) {
			System.out.println("CPF nao possui Simulacao (" + code + ")");
			assertEquals(code, codeRetornado);
		} else {

		}
	}

	public void body(String texto) {
		String bodyResponse = response.asPrettyString();
		assertThat(bodyResponse, StringContains.containsString(texto));
		System.out.println(bodyResponse);
		System.out.println("************************************");

	}
	
	
}
