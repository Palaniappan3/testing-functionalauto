import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"classpath:features/web.feature"},
plugin = {"json:target/cucumber-reports/1.json", "pretty"},
monochrome = false,
tags = {"@wip"},
glue = { "io.magentys.cinnamon", "com.practice" })
public class WebIT {
}
