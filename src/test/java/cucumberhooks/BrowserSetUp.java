package cucumberhooks;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSetUp {

    public static WebDriver chromeSetUp() {

        ChromeDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--private");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        DesiredCapabilities chromeProfile =DesiredCapabilities.chrome();
        chromeProfile.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        chromeProfile.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        chromeOptions.merge(chromeProfile);

        return (new ChromeDriver(chromeOptions));

    }
}
