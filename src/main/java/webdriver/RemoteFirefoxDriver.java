package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteFirefoxDriver extends WebDriverCreator{

    public String url;
    public RemoteFirefoxDriver (String url){
        this.url = url;
    }
    @Override
    public WebDriver createWebdrive() throws MalformedURLException {
        return new RemoteWebDriver(new URL(url),new FirefoxOptions());
    }
}
