package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/SkinfiriJungle_AllUsecases.feature", glue={"stepDefinition_SkinfiriJungle"})

public class SkinfiriJungle_runner {

}