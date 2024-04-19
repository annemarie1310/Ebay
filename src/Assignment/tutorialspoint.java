package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class tutorialspoint {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("fsdf");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("ggg");

        WebElement selctgener = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=\"Male\"]")));
        selctgener.click();
 /* //not working... below ..
       WebElement selectexp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"exp\"][@value=\"1\"]")));
               selectexp.click();
*/
    js.executeScript("window.scrollBy(0,370)");
        driver.findElement(By.xpath("//tr[@height=\"40\"][5]//input")).sendKeys("10/3/2023");
        driver.findElement(By.xpath("//tr[@height=\"40\"][6]//input[@value=\"Manual Tester\"]")).click();
        driver.findElement(By.xpath("//tr[@height=\"40\"][8]//input[@value=\"Selenium Webdriver\"]")).click();

        WebElement countrylist =driver.findElement(By.xpath("//tr[@height=\"40\"][9]//select"));
        Select select =new Select(countrylist);
        select.selectByVisibleText("South America");

        WebElement Selcommands = driver.findElement(By.xpath("//tr[@height=\"40\"][10]//select"));
        Select select1 = new Select(Selcommands);
        select1.selectByVisibleText("WebElement Commands");

      //  driver.findElement(By.xpath("//button[@name=\"submit\"]")).click();



    }
}
