package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.id("droppable"));

        Actions mouse = new Actions(driver);
        mouse.dragAndDrop(drag,drop).perform();


    }
}
