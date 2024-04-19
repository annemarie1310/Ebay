import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Final {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php?index=FNO");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> price=driver.findElements(By.xpath("//div[@class=\"bsr_table hist_tbl_hm\"]//table/tbody/tr/td[4]"));

        int number=price.size();
/*
        for (WebElement f:price){
            System.out.println(f.getText());
        }
*/
        Double price1[] = new Double[455];
        for (int i=0;i<number;i++){
            String text=price.get(i).getText().replace(",","");
            price1[i]=Double.parseDouble(text);
        }
/*
        for (int j=0;j<number;j++){
            System.out.println("converted ==>"+price1[j]);
        }
*/
        /*

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;


        // loop to find minimum from ArrayList
        for (int h = 1; h < number; h++) {
            if (price1 <min) {
                min = p.get(h);
            }
        }

        // loop to find maximum from ArrayList
        for (int k = 1; k < number; k++) {
            if (p.get(k) > max) {
                max = p.get(k);
            }
        }

        // Final Result
        System.out.println("Min num is ==>"+min);
        System.out.println("max num is ==>"+max);
*/
        // Find min and max values in array
        double miin = Double.MAX_VALUE;
        double maxx = Double.MIN_VALUE;
        for (double d : price1) {
            if (d < miin) {
                miin = d;
            }
            if (d > maxx) {
                maxx = d;
            }
        }

        // Print results
        System.out.println("Min value: " + miin);
        System.out.println("Max value: " + maxx);


    }
}
