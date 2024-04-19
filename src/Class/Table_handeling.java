package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Table_handeling {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.rediff.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//a[@href=\"https://money.rediff.com\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/gainers/bse/daily/groupa\"]")).click();

        List<WebElement>tableheads =driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr/th"));
        System.out.println("number of table heads in the table ==> "+tableheads.size());

        List<WebElement>tablerows = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody/tr"));
        System.out.println("number of rows available in the table ==>"+tablerows.size());

        System.out.println(driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]")).getText());
        System.out.println("ALL Table Below ...............");
        System.out.println(driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody")).getText());



    }
}
