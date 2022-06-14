package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("setUp Çalıştı.");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("tearDown çalıştı.");

        //ekran goruntusu almak icin bu sabit kodu yazdik
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        //eger seneryonun sonucu failed olursa ekran goruntusunu rapora eklemesi icin yazdik
        if(scenario.isFailed()){
            scenario.embed(screenshot , "image/png");
        }

    }
}



