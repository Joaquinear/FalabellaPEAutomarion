package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilAlert {
    public static boolean isPresent(WebDriver driver){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
