package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClickableElement {
    public static boolean isPresent(WebDriver driver, By locator){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
