package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static utility.WebDriverUtility.driver;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = {
                "src/test/resources/feature"
        }, monochrome = true,
        tags = "Test",
        glue = {"utility","stepdef"},
        plugin ={"pretty"}
)
public class Runner {

    @AfterClass
    public static void teardown() {
        driver.quit();
    }

}
