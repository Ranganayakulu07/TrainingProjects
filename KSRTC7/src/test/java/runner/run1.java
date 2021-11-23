package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features",glue="stepDefinition",tags="@tag2 or @tag3")
public class run1 extends AbstractTestNGCucumberTests {

}
