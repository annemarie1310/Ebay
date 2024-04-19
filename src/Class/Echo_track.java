package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Echo_track {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
        driver.findElement(By.xpath("//input[@id=\"txtCustomerID\"]")).sendKeys("dfsd");  //enter invalid email
        driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("sfs"); //enter invalid password
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click(); //click on login

        System.out.println(driver.findElement(By.xpath("//span[@id=\"lblMsg\"]")).getText()); // print the output message


    }

}
