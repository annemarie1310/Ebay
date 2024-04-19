import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoqa_from {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.xpath("//div[@id=\"stateCity-wrapper\"]//input[1]")).sendKeys("Haryana", Keys.ENTER);
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       // js.executeScript("arguments[0].sendKeys(\"Haryana\", Keys.ENTER)", driver.findElement(By.xpath("//div[@id=\"stateCity-wrapper\"]//input[1]")));



    }

}
