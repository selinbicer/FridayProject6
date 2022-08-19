package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    //GeneralWebDriver->GWD

    private static WebDriver driver;

    public static WebDriver getDriver(){
        /*
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        Bunun karşılığını yapıyoruz:
         */
        if (driver==null) {

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            //firefox için:
            //WebDriverManager.firefoxdriver().setup();
            //driver = new FirefoxDriver();

        }
        //eğer if koşulu koymasaydık bu durumda driver'ın her çağırılışında yeni driver oluşur
        // ve aynı site üzerinden işlem yapılamazdı
        return driver;
    }

    public static void quitDriver(){
      // try{
      //     Thread.sleep(5000);
      // }catch (InterruptedException e){
      //     throw new RuntimeException();
      // }

        if (driver != null) { //driver var ise
            driver.quit();
            driver=null;
        }
    }


}
