package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features= {"src/test/java/features/login.feature"},
		dryRun=!true,
		snippets=SnippetType.CAMELCASE,
		monochrome=true,
		glue="steps"
		)
		


public class Runner extends AbstractTestNGCucumberTests {

}
