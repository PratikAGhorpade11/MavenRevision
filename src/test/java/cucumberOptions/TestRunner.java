package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/featureLayer/BuyProduct.feature"
		,glue = "stepDefinitions"
		,monochrome = true
//		,dryRun = true
//		,plugin = {"html:Folder_Name/cucumber.html","json:Folder_Name/cucumber.json"}
//		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
