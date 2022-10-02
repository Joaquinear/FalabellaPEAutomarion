package task;

import actions.Click;
import actions.Enter;
import actions.EnterText;
import org.openqa.selenium.WebDriver;
import ui.UiGoogle;

public class TSearchGoogle {
    public static  void searchFallabelaPeru(WebDriver driver, String searching){
        EnterText.text(driver, UiGoogle.googleSearchBar,searching);
        Enter.enter(driver,UiGoogle.googleSearchBar);
        Click.on(driver,UiGoogle.googleFirstResultText);
    }
}
