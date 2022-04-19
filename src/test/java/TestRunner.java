import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "org.gavura.step"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}