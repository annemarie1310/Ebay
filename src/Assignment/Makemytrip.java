package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Makemytrip {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.makemytrip.com/");

        //below Javascript code will help block the login pop-up .
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[@href=\"https://www.makemytrip.com/flights/\"]")));

        //select flights
      //  driver.findElement(By.xpath("//a[@href=\"https://www.makemytrip.com/flights/\"]")).click();  //click on flights



        //from
        driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click(); //click on From to enter
        driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Mum");  //enter mumbai airport
        driver.findElement(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"][1]")).click(); //select mumbai airport

        //to
        driver.findElement(By.xpath("//div[@class=\"fsw_inputBox searchToCity inactiveWidget \"][1]")).click();  //click on From to enter
        driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Hea"); //enter heathrow airport
        driver.findElement(By.xpath("//p[@class=\"font14 appendBottom5 blackText\"][contains(text(),'London - Heathrow Apt, United Kingdom')]")).click(); //select heathrow airport

        //select date
        driver.findElement(By.xpath("//div[@aria-label=\"Wed Apr 12 2023\"]")).click(); //select date.

        //select travellers
        driver.findElement(By.xpath("//div[@data-cy=\"flightTraveller\"]")).click();    //click on Travellers
        driver.findElement(By.xpath("//div[@class=\"travellers gbTravellers\"]//ul/li[2]")).click();  // select 2 adults
        driver.findElement(By.xpath("//div[@class=\"makeFlex column childCounter\"]//ul/li[2]")).click();  //select 1 child
        driver.findElement(By.xpath("//ul[@class=\"guestCounter classSelect font12 darkText\"]/li[4]")).click(); //select first class
        driver.findElement(By.xpath("//div[@class=\"right makeFlex hrtlCenter\"]/button")).click();  // click on Apply button

        //Search click
        driver.findElement(By.xpath("//p[@data-cy=\"submit\"]/a")).click();

        //click cross on advertisement
        driver.findElement(By.xpath("//div[@class=\"commonOverlay \"]/span")).click();

        //Get search results of flights
        System.out.println(driver.findElement(By.xpath("//div[@class=\"clusterTabsHead appendBottom20\"]")).getText());

    }

}
