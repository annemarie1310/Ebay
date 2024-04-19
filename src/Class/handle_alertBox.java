package Class;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class handle_alertBox {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/alerts");


/*
//      Simple See Alert & accept
        driver.findElement(By.cssSelector("#alertButton")).click();
        Alert seealert = driver.switchTo().alert();
        System.out.println(seealert.getText());
        Thread.sleep(2000);
        seealert.accept();
        Thread.sleep(2000);
*/
/*
//      Simple See Alert after 5 seconds .
        driver.findElement(By.cssSelector("#timerAlertButton")).click();
        Thread.sleep(5000);
        Alert secalert = driver.switchTo().alert();
        System.out.println(secalert.getText());
        secalert.accept();
        Thread.sleep(2000);
*/
/*
//       confirm box Alert
        driver.findElement(By.cssSelector("#confirmButton")).click();
        Alert Confirmalert = driver.switchTo().alert();
        System.out.println(Confirmalert.getText());
        Thread.sleep(2000);
        Confirmalert.accept();
        System.out.println(driver.findElement(By.cssSelector("#confirmResult")).getText());
        Thread.sleep(2000);
*/

//      Promt Box Alert ( here we have to enter something )
        driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
        Alert PromtAlert = driver.switchTo().alert();
        PromtAlert.sendKeys("Pranay k");
        System.out.println(PromtAlert.getText());
        Thread.sleep(2000);
        PromtAlert.accept();   // here to cancel we can choose : dismiss.
        System.out.println(driver.findElement(By.cssSelector("#promptResult")).getText());
        Thread.sleep(2000);


        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("D:\\Screenshots_with_selenium"));



    }
}
