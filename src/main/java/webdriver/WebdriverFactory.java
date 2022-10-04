package webdriver;

import org.openqa.selenium.WebDriver;

public class WebdriverFactory {
    public static WebDriver getdriver(String browser, String url) throws Exception {
        switch (browser){
            case "chrome":
                ChromeDriverCreator chromeDriverCreator = new ChromeDriverCreator();
                return chromeDriverCreator.createWebdrive();
            case "firefox":
                FirefoxDriverCreator firefoxDriverCreator = new FirefoxDriverCreator();
                return firefoxDriverCreator.createWebdrive();
            case "chrome-remote":
                RemoteChromeDriverCreator remoteChromeDriverCreator = new RemoteChromeDriverCreator(url);
                return remoteChromeDriverCreator.createWebdrive();
            case "firefox-remote":
                RemoteFirefoxDriver remoteFirefoxDriver = new RemoteFirefoxDriver(url);
                return remoteFirefoxDriver.createWebdrive();
            default:
                throw new Exception(browser + "NO soportado");
        }
    }
}
