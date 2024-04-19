package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Doubble_and_rightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/buttons");

        Actions click = new Actions(driver);  //This Actions class has function of different clicks.

        //perform right click
        click.contextClick(driver.findElement(By.cssSelector("#rightClickBtn"))).perform();
        System.out.println(driver.findElement(By.cssSelector("#rightClickMessage")).getText());

        //perform double click
        click.doubleClick(driver.findElement(By.cssSelector("#doubleClickBtn"))).perform();
        System.out.println(driver.findElement(By.cssSelector("#doubleClickMessage")).getText());


    }
}
