package webdriver;

import org.openqa.selenium.WebDriver;

public class WebdriverFactory {
    public static WebDriver getdriver(String browser) throws Exception {
        switch (browser){
            case "chrome":
                ChromeDriverCreator chromeDriverCreator = new ChromeDriverCreator();
                return chromeDriverCreator.createWebdrive();
            case "firefox":
                FirefoxDriverCreator firefoxDriverCreator = new FirefoxDriverCreator();
                return firefoxDriverCreator.createWebdrive();
            default:
                throw new Exception(browser + "NO soportado");
        }
    }
}
