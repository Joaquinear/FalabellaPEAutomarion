package task;

import actions.*;
import org.openqa.selenium.WebDriver;
import ui.UiFalabellaPage;

import java.awt.event.ActionListener;

public class TFalabellaBuy {
    public static void Continue(WebDriver driver) throws InterruptedException {
        Click.on(driver, UiFalabellaPage.btnContinueBuy);
        if(IsDisplayed.element(driver,UiFalabellaPage.labelMail)){
            Thread.sleep(2000);
            EnterText.text(driver,UiFalabellaPage.inputMail,"joaquinear94@gmail.com");
            Click.on(driver,UiFalabellaPage.btnContinueMail);

            Click.on(driver,UiFalabellaPage.departamentInput);
            EnterText.text(driver,UiFalabellaPage.departamentInput,"LIMA");
            Click.on(driver,UiFalabellaPage.departamentSelect);

            Click.on(driver,UiFalabellaPage.provinceInput);
            EnterText.text(driver,UiFalabellaPage.provinceInput,"LIMA");
            Click.on(driver,UiFalabellaPage.provinceSelect);

            Click.on(driver,UiFalabellaPage.distritInput);
            EnterText.text(driver,UiFalabellaPage.distritInput,"LIMA");
            Click.on(driver,UiFalabellaPage.distritSelect);

            EnterText.text(driver,UiFalabellaPage.avenueInput,"3 Pasos");
            EnterText.text(driver,UiFalabellaPage.numberInput,"17");
            EnterText.text(driver,UiFalabellaPage.depaInput,"depa 2");

            Click.on(driver,UiFalabellaPage.btnConfirmDirection);
            Click.on(driver,UiFalabellaPage.btnCofirmAndSave);
            Thread.sleep(5000);
            Click.on(driver,UiFalabellaPage.btnGoToPay);
            Thread.sleep(5000);
            Click.on(driver,UiFalabellaPage.tc);
            Thread.sleep(2000);
        }
    }
}
