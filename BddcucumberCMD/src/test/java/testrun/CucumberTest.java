package testrun;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/Feature/NewLogindemo.feature",
		glue={"bddsteps"},
		dryRun=false,
		monochrome =true,
		plugin={"pretty","summary","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"}
				
		)
public class CucumberTest
{
	
	
}
