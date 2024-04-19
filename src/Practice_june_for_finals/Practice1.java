package Practice_june_for_finals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice1 {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options =new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");


    }
}
