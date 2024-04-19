package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Demoqa_checkbox_handle {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.xpath("//ul[@class=\"menu-list\"]/li[2]")).click();
        WebElement checkbox = driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"][1]"));

        System.out.println("before checking the check box ..");
        System.out.println("visible"+checkbox.isDisplayed());
        System.out.println("enabled"+checkbox.isEnabled());
        System.out.println("selected"+checkbox.isSelected());

        if (checkbox.isSelected()==false){
            checkbox.click();
        }

        System.out.println("After checking checkbox...");
        System.out.println("visible"+checkbox.isDisplayed());
        System.out.println("enabled"+checkbox.isEnabled());
        System.out.println("selected"+checkbox.isSelected());

        driver.findElement(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"][1]")).click();

        List<WebElement>listofchkbox = driver.findElements(By.xpath("//li[@class=\"rct-node rct-node-parent rct-node-expanded\"][1]/ol/li/span//span[3]"));
        System.out.println("Types of checkbox available under Home.....");
        for (WebElement listchk:listofchkbox) {
            System.out.println(listchk.getText());
        }

        driver.findElement(By.xpath("//button[@class=\"rct-option rct-option-expand-all\"]")).click();
        System.out.println("\nALL check box available under HOME .............");
       List<WebElement> allchklist = driver.findElements(By.xpath("//li[@class=\"rct-node rct-node-parent rct-node-expanded\"]/ol/li/span//span[3]"));

       for (WebElement alllist:allchklist) {
            System.out.println(alllist.getText());
        }
        System.out.println("Number of check box options available ==>"+""+allchklist.size());


        List<WebElement> dd = allchklist;
        for (int i=0;i<= dd.size();i++){
            System.out.printf("Index: %d,)");
        }



    }
}