package task;

import actions.Click;
import actions.WaitClickableElement;
import actions.WaitUntilElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.UiFalabellaPage;

public class TFalabellaMore {
    public static void Items(WebDriver driver,int quantity){
        for(int i =0;i<quantity;i++){
            if(WaitClickableElement.isPresent(driver,UiFalabellaPage.moreItems))
                Click.on(driver, UiFalabellaPage.moreItems);
        }
    }
}
