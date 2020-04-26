package testmeappclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:testmeappfeatures" }, glue = { "classpath:testmeappclass" }, tags = {
		"@TestMeApp" }, plugin = { "pretty", "json:target/cucumber.json" })
public class RunnerFunctions {

}
