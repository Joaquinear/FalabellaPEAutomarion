package ui;

import org.openqa.selenium.By;

public class UiFalabellaPage {


    //-------------------------------------------------------------------------------------------------------------------
    public static By searchBarFalabella = By.id("testId-SearchBar-Input");
    public static By resultSearchValidation = By.xpath("//h1[@title='Nintendo']"); // para comprar encontro resutlados
    public static By itemSelect = By.xpath("//b[text()='Consola Nintendo Switch Modelo Oled']");// para seleccionar y llevar al otro lado
    public static By nameProduct = By.xpath("//div[text()='Consola Nintendo Switch Modelo Oled']");
    public static By moreItems = By.xpath("//button[.='+']"); // para aumetar items
    public static By btnAddBucket = By.xpath("//button[text()='Agregar al Carro']");// Agregar al carrito
    public static By garanty = By.id("testId-InCart-inPDP-WarrantyOption-btn-0");//GARANTIA
    public static By btnGoToBucket = By.id("linkButton");
    //----------------------Confirmacion de compra------------------------------------------------------------------------------------------------
    public static By ItemSelectToBuy = By.xpath("//span[@data-testid='name']");
    public static By btnContinueBuy = By.xpath("//button[normalize-space()='Continuar compra']");
    public static By inputMail = By.id("testId-Input-email");
    public static By labelMail = By.xpath("//span[contains(text(),'Correo electrónico :')]");
    public static By btnContinueMail = By.xpath("//button[@data-testid='continueButton']");// para comprobar que es able o disable
    //================================================================================================================================
    public static By departamentInput = By.xpath("//input[@placeholder='Selecciona un Departamento']");
    public static By departamentSelect = By.xpath("//li[.='LIMA']");
    public static By provinceInput = By.xpath("//input[@placeholder='Selecciona una Provincia']");
    public static By provinceSelect = By.xpath("//li[.='LIMA']");
    public static By distritInput = By.xpath("//input[@placeholder='Selecciona un Distrito']");
    public static By distritSelect = By.xpath("//li[.='LIMA']");
    public static By avenueInput = By.id("testId-Input-street");
    public static By numberInput = By.id("testId-Input-number");
    public static By depaInput = By.id("testId-Input-department");
    public static By btnConfirmDirection = By.id("testId-infoModalFooter-button");
    public static By btnCofirmAndSave = By.xpath("//button[.='Confirmar y Guardar']");
    //================================================================================================================================
    public static By btnGoToPay = By.xpath("//button[@id='testId-ContinueShopping-enabled']");
    //================================================================================================================================
    public static By crmFalabella = By.xpath("//div[@data-testid='testId-PaymentsDigitalFingerprints']");
    //================================================================================================================================
    public static By tc = By.xpath("//span[text()='Tarjeta de crédito']");
    public static By frameTC = By.xpath("//iframe[@title='Agregar nueva tarjeta']");
    public static By numberTc = By.id("pan");
}
