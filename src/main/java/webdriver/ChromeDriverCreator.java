package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverCreator extends WebDriverCreator{

    @Override
    public WebDriver createWebdrive() {
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        DesiredCapabilities obj = new DesiredCapabilities();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        obj.setCapability(ChromeOptions.CAPABILITY,option);

        //driver = new ChromeDriver(obj);
        return new ChromeDriver(obj);
    }
}
