package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cleartrip {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(18));
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class=\"px-1   flex flex-middle nmx-1 pb-1\"]")).click();

        //select no.of passengers.
        driver.findElement(By.xpath("//span[text()=\"1 Adult, Economy\"]")).click(); //click to add passengers
        driver.findElement(By.xpath("//div[@value=\"travellerAndClass\"]/div/div/ul/li[3]")).click(); //select adults 2
        driver.findElement(By.xpath("//div[@value=\"travellerAndClass\"]/div/div[2]/ul/li[3]")).click();//select 1 child
        driver.findElement(By.xpath("//div[@value=\"travellerAndClass\"]/div/div[4]//div[3]")).click();// select first class.


        //from
        driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]")).sendKeys("Mum");
        driver.findElement(By.xpath("//p[text()=\"Mumbai, IN - Chatrapati Shivaji Airport (BOM)\"]")).click();
        //to
        driver.findElement(By.xpath("//input[@placeholder=\"Where to?\"]")).sendKeys("Hea");
        driver.findElement(By.xpath("//p[text()=\"London, GB - Heathrow\"]")).click();

// Below not working........
        //Date
     //   Actions click = new Actions(driver);
        driver.findElement(By.xpath("//div[@class=\"flex flex-middle p-relative homeCalender\"]/button[1]")).click();
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label=\"Thu Apr 20 2023\"]/div/div[text()=\"20\"]")));
                date.click();

    //  click.click(driver.findElement(By.xpath("//div[@aria-label=\"Thu Apr 20 2023\"]/div/div[text()=\"20\"]"))).perform();




    }
}
