package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resorces/features",
	    glue={"stepdefinations","hooks"},
		tags="@smoke",
	    plugin= {"pretty","html:target/Cucumberreport.html"}
		)
public class TestRunner {

}
