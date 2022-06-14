package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonAramaPages {

    public AmazonAramaPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonArama;
    @FindBy(className="sg-col-inner")
    public WebElement amazonSonuc;
    @FindBy(id="searchDropdownBox")
    public WebElement dropDropdownBox;


}
