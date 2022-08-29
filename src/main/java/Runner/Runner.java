package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features", glue = {"StepDefinitions"},
        monochrome=true,
        strict=true,
        plugin={"pretty",
                "html:target/cucumber-reports/cucumber-html-reports",
                "json:target/cucumber-reports/cucumber-html-reports/common.json"},
        tags="@somkeTest")

public class Runner {

}
