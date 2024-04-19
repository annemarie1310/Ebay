package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Demoqa_radiobutton_handle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/elements");

        driver.findElement(By.xpath("//ul[@class=\"menu-list\"]/li[3]")).click();

        //below List of webelements gives list of radio buttons available
    List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
        System.out.println("before clicking radio button....");
        for (WebElement radiolist:radiobuttons) {
            System.out.println("visible .. "+radiolist.isDisplayed());
            System.out.println("enabled .. "+radiolist.isEnabled());
            System.out.println("selected .. "+radiolist.isSelected());
        }

//        radiobuttons.get(1).click();

        //below driver. clicks on radio button yes.
        driver.findElement(By.xpath("//label[@class=\"custom-control-label\"][@for=\"yesRadio\"]")).click();
        String message = driver.findElement(By.xpath("//p[@class=\"mt-3\"]")).getText();
        System.out.println(message);

        driver.findElement(By.xpath("//label[@class=\"custom-control-label\"][@for=\"impressiveRadio\"]")).click();
        String message1 = driver.findElement(By.xpath("//p[@class=\"mt-3\"]")).getText();
        System.out.println(message1);


    }
}
