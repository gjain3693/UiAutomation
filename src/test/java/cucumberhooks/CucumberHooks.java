package cucumberhooks;


import io.cucumber.java.Before;

import static utility.WebDriverUtility.driver;

public class CucumberHooks {

    @Before
    public void browserSetUp() {

        driver = BrowserSetUp.chromeSetUp();

    }

}
