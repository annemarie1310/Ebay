package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ebay_website {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("iphone 14");
        driver.findElement(By.cssSelector("#gh-btn")).click();
        driver.findElement(By.linkText("iPhone 14 - Unlocked - 128GB - Black - Excellent")).click();
        js.executeScript("window.scrollBy(0,300)");

        Thread.sleep(4000);
        driver.close();


    }
}
