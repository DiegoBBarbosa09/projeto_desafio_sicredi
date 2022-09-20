package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@restricoes",
		plugin = {"pretty", "json:target/remover-cliente-id.json"},
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa {
	
}
