package task;

import actions.Click;
import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.UiFalabellaPage;

public class TFalabellaStartToBuy {
    public static String addBucket(WebDriver driver) throws InterruptedException {
        //Thread.sleep(1000);
        String ItemInTime = GetText.text(driver,UiFalabellaPage.nameProduct);
        Click.on(driver,UiFalabellaPage.btnAddBucket);
        Click.on(driver,UiFalabellaPage.garanty);
        Click.on(driver,UiFalabellaPage.btnGoToBucket);
        return ItemInTime;
    }
}
