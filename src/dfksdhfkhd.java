package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dfksdhfkhd {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.rediff.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//a[@href=\"https://money.rediff.com\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/gainers/bse/daily/groupa\"]")).click();


        List<WebElement> elements =driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody/tr/td[4]"));

      //  int number=price.size();

        // Find elements and convert to array of doubles
        double[] StockPrices = new double[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            String text = elements.get(i).getText().trim().replace(",", "");
            StockPrices[i] = Double.parseDouble(text);
        }

        // Find min and max values in array
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double d : StockPrices) {
            if (d < min) {
                min = d;
            }
            if (d > max) {
                max = d;
            }
        }

        // Print results
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        // Close WebDriver
        driver.quit();


    }

}

