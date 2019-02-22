package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\USER 1\\git\\alfatest\\—ucumberTestNG\\src\\test\\resources\\Features\\goods.feature"
		,glue= {"helpers","stepDefinitions"},
		format= {"pretty", "html:test-outout"}
		)

public class TestRunner {
	

}
