package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dashbling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://dash.bling-center.com/platform/signIn");
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(8));

        driver.findElement(By.cssSelector("#email")).sendKeys("df");
        driver.findElement(By.cssSelector("#password")).sendKeys("dsfsd");
        driver.findElement(By.xpath("//button[@class=\"forget-password-btn\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Email address used at sign up\"]")).sendKeys("dff@gdfgdf.coom");
        driver.findElement(By.xpath("//button[@onclick=\"forgotPassword()\"]")).click();

       WebElement mes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id=\"resetsuccess\"]")));
        System.out.println(mes.getText());


    }
}
