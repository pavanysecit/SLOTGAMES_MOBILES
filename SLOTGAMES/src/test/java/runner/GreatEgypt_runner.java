package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/GreatEgypt_AllUsecases.feature", glue={"stepDefinition_GreatEgypt"})
public class GreatEgypt_runner {
	
}