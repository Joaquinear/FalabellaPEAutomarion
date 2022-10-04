package task;

import actions.*;
import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.WebDriver;
import ui.UiFalabellaPage;

public class TFalabella {
    public static void SearchAndSelect(WebDriver driver, String item) throws InterruptedException {
        EnterText.text(driver, UiFalabellaPage.searchBarFalabella,item);
        Enter.enter(driver,UiFalabellaPage.searchBarFalabella);
        GetText.text(driver,UiFalabellaPage.itemSelect);
        Thread.sleep(1000);
        if(IsDisplayed.element(driver,UiFalabellaPage.resultSearchValidation))
            ClickNonClickable.Click(driver,UiFalabellaPage.itemSelect);
    }
}
