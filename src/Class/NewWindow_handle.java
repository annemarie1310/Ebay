package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class NewWindow_handle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.online.citibank.co.in/");

        driver.findElement(By.xpath("//img[@src=\"/images/login.png\"][1]")).click();


        System.out.println(driver.getTitle());

// -------------- Below We have Created --SET which will return all windows & through Iterator we will switch to parent & child window .---------
        Set<String>windowId =driver.getWindowHandles();//this gets window id's in string format.
        Iterator<String>i= windowId.iterator();  //this will return window id's.
        String mainwindow = i.next();           //parent window
        String newWindow =i.next();             //child window
//  ------------------------------xxxxxxxxxxxxxxxxxxxxxxxxxxx---------------------------------------------

        System.out.println("Window id is ==>"+windowId); //this will change dynamically everytime.

        driver.switchTo().window(newWindow);  //this will switch to new window
        System.out.println(driver.getTitle());  // this will get the Title of new window

        //Below Will perform actions on New Window
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#User_Id")).sendKeys("efes");


        driver.switchTo().window(mainwindow);
        System.out.println(driver.findElement(By.xpath("//div[@class=\"signOnAccount\"]//p[1]")).getText());


    }
}
