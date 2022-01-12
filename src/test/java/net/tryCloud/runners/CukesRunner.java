package net.tryCloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", // store failed scenarios
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/mgl/step_definitions",
        dryRun = true,
        tags = "@pmTrucksChecker" //"@mileTruckTest"
)
public class CukesRunner {
}
