package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestBase {

    public WebDriver driver;

    @BeforeClass
            public void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp(){

       driver = new ChromeDriver();
       driver.manage().window();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.get("https:www.amazon.com");
    }

    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(3000);
        driver.close();

    }
    @Test
    public void informationTest(){

    }






    public static WebDriver getDriver(String browserType){
        WebDriver driver = null;

        if (browserType.toLowerCase().equals("chrome")){
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                driver=new FirefoxDriver();
//                break;
        }
        return driver;
    }
}
