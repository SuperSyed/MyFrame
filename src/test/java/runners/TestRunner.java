package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber",
        "json:target/cucumber.json"},
        features="src/test/resources/features",
        glue="step_definitions",
        tags="@Search",
        dryRun = false,
        monochrome = true
)



public class TestRunner {


}