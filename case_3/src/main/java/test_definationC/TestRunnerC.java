package test_definationC;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
		features = "Feature"
		,glue= {"test_definitionC"}
		)
public class TestRunnerC {

}
