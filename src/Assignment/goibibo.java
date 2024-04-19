package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class goibibo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//this waits the execution of code till webelements load for max given sec i.e here 20s.
      //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.get("https://www.goibibo.com/");

        driver.findElement(By.xpath("//div[@data-id=\"auth-flow-section\"]//span/span")).click();  //click cross to close advertisement

        //from
        driver.findElement(By.xpath("//div[@class=\"sc-gGCDDS eaLCwN fswFld \"]//p[1]")).click();  //click on From
        driver.findElement(By.xpath("//div[@class=\"sc-GEbAx hOdrcL\"]/input")).sendKeys("Mum");
        driver.findElement(By.xpath("//ul[@id=\"autoSuggest-list\"]/li[1]")).click();  //select mumbai airport

        //from

        driver.findElement(By.xpath("//div[@class=\"sc-fbyfCU hGhHkx\"]//input")).sendKeys("Hea");
        driver.findElement(By.xpath("//ul[@id=\"autoSuggest-list\"]//li[1]")).click();  //select heathrow airport

        //date
        driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][@aria-label=\"Thu Apr 20 2023\"]")).click(); //select date
        driver.findElement(By.xpath("//div[@class=\"sc-hAcGzb lQuPk\"]//span[2]")).click(); //select done

        //select Travellers
        driver.findElement(By.xpath("//span[@class=\"sc-eFegNN csJIKZ\"][2]")).click();   //select 2 adults
        driver.findElement(By.xpath("//div[@class=\"sc-bQtKYq bfQCXn\"][2]//span[3]")).click();  // select 1 child
        driver.findElement(By.xpath("//div[@class=\"sc-kYHfwS fxKxux\"]//ul/li[4]")).click(); //select first class
        driver.findElement(By.xpath("//div[@class=\"sc-gyElHZ PqRdW\"]/a[2]")).click();  //select done

        //Search click
        driver.findElement(By.xpath("//div[@class=\"sc-kmQMED fgpXuF\"]/span")).click();  //click on search.


    }
}
