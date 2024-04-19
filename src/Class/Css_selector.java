package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Css_selector {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.cssSelector("input[type^=\"text\"]")).sendKeys("egjhfje");
        driver.findElement(By.cssSelector("input[type^=\"text\"][name='login']")).sendKeys("dd"); // this double attribute method is used when we have to get to the particular element
        driver.findElement(By.cssSelector("input[type^=\"password\"]")).sendKeys("dfksduhf");
        driver.findElement(By.cssSelector("input[type^=\"submit\"]")).click();
        driver.findElement(By.cssSelector("input[type^=\"text\"]")).clear();

     // below special elements are used when the attribute values keeps on changing when page is refreshed .
        // here we can use ^ for starting with
        // here we can use $ for ending with
        // here we can use * for containing middle with

    }
}
