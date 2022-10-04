package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChromeDriverCreator extends WebDriverCreator{

    public String url;

    public RemoteChromeDriverCreator(String url){
        this.url = url;
    }
    @Override
    public WebDriver createWebdrive() throws MalformedURLException {
        return new RemoteWebDriver(new URL(url),new ChromeOptions());
    }
}
