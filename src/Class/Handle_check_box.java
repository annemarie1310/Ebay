package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_check_box {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement checkbox = driver.findElement(By.cssSelector("input#checkbox2"));

        System.out.println("before clicking checkbox status");
        System.out.println("checkbox is Visible ="+checkbox.isDisplayed());
        System.out.println("checkbox is Enabled ? = "+checkbox.isEnabled());
        System.out.println("checkbox is not Selected ? = "+checkbox.isSelected());

        if (checkbox.isSelected()==false){
        checkbox.click();
    }
        System.out.println("after checking checkbox status");
        System.out.println("check box is displayed"+checkbox.isDisplayed());
        System.out.println("check box is enabled"+checkbox.isEnabled());
        System.out.println("checkbox is selected"+checkbox.isSelected());






}}
