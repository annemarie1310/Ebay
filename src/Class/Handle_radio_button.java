package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Handle_radio_button {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Register.html");

        //below List of webelements gives list of radio buttons available
        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("before clicking radio button....");
        for (WebElement radiolist:radio) {
            System.out.println("visible .. "+radiolist.isDisplayed());
            System.out.println("enabled .. "+radiolist.isEnabled());
            System.out.println("selected .. "+radiolist.isSelected());

        }
        radio.get(0).click();//  (0) will click on male  & (1) will click on female
        System.out.println("After clicking ...");
        for (WebElement radiolist:radio) {
            System.out.println("visible .. "+radiolist.isDisplayed());
            System.out.println("enabled .. "+radiolist.isEnabled());
            System.out.println("selected .. "+radiolist.isSelected());
        }

        driver.close();




    }
}
