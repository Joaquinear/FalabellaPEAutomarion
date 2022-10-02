package ui;

import org.openqa.selenium.By;

public class UiGoogle {
    public static By googleSearchBar = By.xpath("//input[@name='q']");
    public static By googleFirstResultText = By.xpath("//h3[contains(text(),'falabella.com |')]");
}
