package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "mobile.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber"},
        tags = "@Test01",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner extends AbstractTestNGCucumberTests {
}
