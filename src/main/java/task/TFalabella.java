package task;

import actions.*;
import com.aventstack.extentreports.util.Assert;
import org.openqa.selenium.WebDriver;
import ui.UiFalabellaPage;

public class TFalabella {
    public static void SearchAndSelect(WebDriver driver, String item){
        EnterText.text(driver, UiFalabellaPage.searchBarFalabella,item);
        Enter.enter(driver,UiFalabellaPage.searchBarFalabella);
        GetText.text(driver,UiFalabellaPage.itemSelect);
        if(IsDisplayed.element(driver,UiFalabellaPage.resultSearchValidation))
            Click.on(driver,UiFalabellaPage.itemSelect);
    }
}
