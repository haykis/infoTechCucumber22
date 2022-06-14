package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EbayPage {
    public EbayPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//*[.='Accept All']")
    public WebElement ebayGuvenlik;
    @FindBy(name="_nkw")
    public WebElement ebayArama;
    @FindBy(xpath = "//h1")
    public WebElement ebaySonuc;

    @FindBy(id = "gdpr-banner-accept")
    public WebElement understandBtn;
    //    @FindBy(id = "rcc-confirm-button")
//    public List<WebElement> understandBtn2;
    @FindBy(id = "gdpr-banner-accept")
    public List<WebElement> understandBtn2;
}
/*
Bir proje olusturulurken
 1-senaryo olusturulur
 2-dryRun=true yapilir,methodlar olusturulur,ve stepdefinitions class'ina kopyalanir
 3-pages paketinin icerisinde page olusturulur ve webelement bulunur
 4-stepdefinitions paketinin icerisinde adimlarin (methodlari) kodlari yazilir.
 */