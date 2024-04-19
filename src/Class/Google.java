package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        ChromeDriver driver = new ChromeDriver(options);
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("input[title=\"Search\"]")).sendKeys("suraj");
        driver.findElement(By.cssSelector("input[title=\"Search\"]")).submit();
        //driver.findElement(By.xpath("//a[@href=\"https://en.wikipedia.org/wiki/Suraj_(film)\"]")).click();
        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[@href=\"https://en.wikipedia.org/wiki/Suraj_(film)\"]")).click();

    }
}
