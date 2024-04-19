package Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class RediffAlertBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


        driver.findElement(By.xpath("//input[@title=\"Sign in\"]")).click();
        Thread.sleep(4000);
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
    }
}
