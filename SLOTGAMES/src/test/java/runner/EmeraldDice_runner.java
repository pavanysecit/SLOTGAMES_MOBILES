package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/EmeraldDice_AllUsecases.feature", glue={"stepDefinition_EmeraldDice"})
public class EmeraldDice_runner {
	
}
