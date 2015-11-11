import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Rocky on 11/10/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        features = "src/test/resources"
)
public class CucumberRunnerTest {
}
