package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiple_window_handle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Windows.html"); // ( Parent Window ).

        //click to switch to new window........................   ( child Window ).
        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"][1]")).click();








    }

}
