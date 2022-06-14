package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;

public class EbayStepDefinition {

    EbayPage ebayPage=new EbayPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }



    @Given("kullanici ebay guvenlik duvarini gecer")
    public void kullanici_ebay_guvenlik_duvarini_gecer() throws InterruptedException {
        Thread.sleep(2000);
        if (ebayPage.understandBtn2.size()>0) {
            System.out.println(ebayPage.understandBtn2.size());
            ebayPage.understandBtn.click();
        }
    }


    @Given("kullanici ebay arama kutusuna {string} yazar ve arar")
    public void kullanici_ebay_arama_kutusuna_yazar_ve_arar(String string) throws InterruptedException {
        Thread.sleep(3000);
        ebayPage.ebayArama.sendKeys(string+ Keys.ENTER);
    }

    @Then("kullanici ebaydaki sonucu ekrana yazdirir")
    public void kullanici_ebaydaki_sonucu_ekrana_yazdirir() {
        System.out.println(ebayPage.ebaySonuc.getText());
    }

}