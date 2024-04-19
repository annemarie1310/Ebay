package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class istqb {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.istqb.in/");
        driver.findElement(By.xpath("//a[text()=\"AGILE\"][1]")).click();
        System.out.println(driver.findElement(By.xpath("//li[@class=\"sp-menu-item sp-has-child\"][4]//ul")).getText());


    }
}
