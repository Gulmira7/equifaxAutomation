package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestBase;


public class Amazon extends TestBase {

 WebDriver driver;



        @Test
        public void searchBox(){

            driver.get("https://www.amazon.com");
        }





//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https:www.amazon.com");
//
//        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//        searchBox.click();
//        searchBox.sendKeys("qa testing for beginners");




    }



