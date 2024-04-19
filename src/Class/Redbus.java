package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Redbus {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//this waits the execution of code till webelements load for max given sec i.e here 20s.
        driver.get("https://www.redbus.in/online-booking/tsrtc?gclid=EAIaIQobChMIuPPg8fKH_gIVGjErCh2LHAsKEAAYASAAEgKGEvD_BwE");

        //from
        driver.findElement(By.xpath("//input[@id=\"txtSource\"]")).sendKeys("Mum");
        driver.findElement(By.xpath("//li[@class=\"C120_suggestions_list\"]")).click();
        //to
        driver.findElement(By.cssSelector("#txtDestination")).sendKeys("Pun");
        driver.findElement(By.xpath("//li[@class=\"C120_suggestions_list\"][1]/div/div")).click();
        //select date
        driver.findElement(By.cssSelector("#txtOnwardCalendar")).click();
        driver.findElement(By.xpath("//div[@id=\"rb-calmiddle\"]/ul[2]/li[8]")).click();
        //search button
        driver.findElement(By.xpath("//button[@class=\"D120_search_btn searchBuses\"]")).click();

        //print all the info about the buses available..
        List<WebElement>infoaboutBuses=driver.findElements(By.xpath("//div[@class=\"clearfix\"]//div/div/div"));
        for (WebElement info:infoaboutBuses) {
            System.out.println(info.getText());
        }



    }
}
