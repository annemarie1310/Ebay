package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_alerts_demoAutomation {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        // Alert 1
        driver.findElement(By.xpath("//div[@id=\"OKTab\"]//button")).click();
        Alert a =driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();

        //Alert 2.
        driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"CancelTab\"]//button")).click();
        Alert a1 =driver.switchTo().alert();
      //  System.out.println(driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText());
        System.out.println(a1.getText());
        a1.accept();

        //Alet 3.
        driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"Textbox\"]//button")).click();
        Alert a2 =driver.switchTo().alert();
        a2.sendKeys("Pranay k");
        System.out.println(a2.getText());
    //    System.out.println(driver.findElement(By.xpath("//p[@id=\"demo1\"]")).getText());
        a2.accept();

    }
}
