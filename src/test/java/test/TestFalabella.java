package test;

import actions.GetText;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.*;
import ui.UiFalabellaPage;

public class TestFalabella extends BaseTest {
    @Test
    public void BuyItem() throws InterruptedException {
        TSearchGoogle.searchFallabelaPeru(driver,"fallabela peru");
        TFalabella.SearchAndSelect(driver,"Nintendo");
        String itemInTime = TFalabellaStartToBuy.addBucket(driver);
        Assert.assertEquals(itemInTime, GetText.text(driver,UiFalabellaPage.ItemSelectToBuy),"NO ITEM ELEGIDO NO COINDIDE");
        TFalabellaMore.Items(driver,1);
        TFalabellaBuy.Continue(driver);
    }
}
