package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@cliente",
		plugin = {"pretty", "html:target/consulta-cliente-cpf.html"},
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa {
	
}
