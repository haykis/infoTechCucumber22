package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleAramaPage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class GoogleArama {

    GoogleAramaPage page = new GoogleAramaPage();


    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));
    }

    @Given("kullanici guvenlik duvarini gecer")
    public void kullanici_guvenlik_duvarini_gecer() throws InterruptedException {
        Thread.sleep(6000);
       page.googleGuvenlik.click();
    }

    @Given("kullanici infotech aramasini yapar")
    public void kullanici_infotech_aramasini_yapar() {
       page.googleArama.sendKeys(ConfigurationReader.getProperty("google_Arama")+ Keys.ENTER);
    }

    @Then("kullanici sayfa basligini kontrol eder")
    public void kullanici_sayfa_basligini_kontrol_eder() throws InterruptedException {
        Thread.sleep(3000);
        String baslik=Driver.getDriver().getTitle();
        Assert.assertTrue(baslik.contains(ConfigurationReader.getProperty("info")));
    }
}

