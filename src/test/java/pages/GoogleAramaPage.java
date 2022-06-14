package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleAramaPage {
    public GoogleAramaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[.='Kabul ediyorum']")
    public WebElement googleGuvenlik;
    @FindBy(name="q")
    public WebElement googleArama;
}
