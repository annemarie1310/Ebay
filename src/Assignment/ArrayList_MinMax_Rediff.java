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

public class ArrayList_MinMax_Rediff {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.rediff.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//a[@href=\"https://money.rediff.com\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/gainers/bse/daily/groupa\"]")).click();


       List<WebElement> price=driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody/tr/td[4]"));

        int number=price.size();
/*
        //Printing All prices.
        for (WebElement f:price){
            System.out.println(f.getText());
        }
*/
        Double price1[] = new Double[460];
        //Converting Webelements as string to double
        for (int i=0;i<number;i++){
            String text=price.get(i).getText().replace(",","");
            price1[i]=Double.parseDouble(text);
        }
/*
        // printing Converted prices
        for (int j=0;j<number;j++){
            System.out.println("converted ==>"+price1[j]);
        }
*/
        //Put all numbers in ArrayList
/*
        ArrayList<Double> p=new ArrayList<>(List.of(price1));
        Double min=p.get(0);
        Double max=p.get(0);

*/

        List<Double>p=new ArrayList<>(List.of(price1));
        Double min=p.get(0);
        Double max=p.get(0);



        // loop to find minimum from ArrayList
        for (int h = 1; h < number; h++) {
            if (p.get(h) <min) {
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




    }
}
