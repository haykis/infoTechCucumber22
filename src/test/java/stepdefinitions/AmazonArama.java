package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonAramaPages;
import utilities.Driver;

public class AmazonArama {

    AmazonAramaPages page=new AmazonAramaPages();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Given("kullanici s22 telefon aramasi yapar")
    public void kullanici_s22_telefon_aramasi_yapar() {
       page.amazonArama.sendKeys("S22"+ Keys.ENTER);

    }

    @Then("kullanici sonucu ekrana yazdirir")
    public void kullanici_sonucu_ekrana_yazdirir() {
        System.out.println(page.amazonSonuc.getText());
    }

    @Given("kullanici camera aramasi yapar")
    public void kullanici_camera_aramasi_yapar() {
        page.amazonArama.sendKeys("Camera"+Keys.ENTER);
    }



    @Given("kullanici arama kutusuna {string} yazar ve arar")
    public void kullanici_arama_kutusuna_yazar_ve_arar(String string) {

        page.amazonArama.sendKeys(string+Keys.ENTER);
    }

    @Given("kullanici dropDownda {string} secer")
    public void kullanici_dropDownda_secer(String string) {
     Select select=new Select(page.dropDropdownBox);
     select.selectByVisibleText(string);

    }

}
