package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Facebok {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        //enter email
        driver.findElement(By.cssSelector("input[type^=\"text\"][placeholder^=\"Email address or phone number\"]")).sendKeys("dsdsd");
        //enter pass
        driver.findElement(By.cssSelector("input[type^=\"password\"][placeholder^=\"Password\"]")).sendKeys("fgdf");
        //click on login
        driver.findElement(By.cssSelector("button[value^=\"1\"][data-testid^=\"royal_login_button\"]")).click();
        //clear the email entered
        driver.findElement(By.cssSelector("input[type^=\"text\"][placeholder^=\"Email address or phone number\"]")).clear();


        // Below program : print the list of all links present on facebook login page.
        List<WebElement>Links=driver.findElements(By.tagName("a"));

     // below print all links with for loop.
        for (int i=1;i<=Links.size();i++) {
            System.out.println(Links.get(i).getText());
        }

     /*  //below print all links with for each loop
        for(WebElement link:Links){
            System.out.println(link.getText());
        }
    */
        System.out.println("No of links on webpage : "+Links.size());   // provides number of links are present on the webpage

    }
}
