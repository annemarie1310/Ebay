package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Multiple_select_dropdown {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

    // get and print the list of dropdown options available .
        List<WebElement>Droplist=driver.findElements(By.xpath("//select[@name=\"selenium_commands\"]"));
        for (WebElement d:Droplist) {
            System.out.println(d.getText());
        }

    // select options on index 1&2 ( which are : Navigation Commands & Switch Commands )
        WebElement droplistt =driver.findElement(By.xpath("//select[@name=\"selenium_commands\"]"));
        Select Selectdrop = new Select(droplistt);
        System.out.println("\ncan dropdown options be selected multiple ==> "+" "+Selectdrop.isMultiple());
        Selectdrop.selectByIndex(1);
        Selectdrop.selectByIndex(2);

    // print the selected options from the dropdown .
        System.out.println("\nall selected options are :: /.....");
        List<WebElement>selectedoptions =Selectdrop.getAllSelectedOptions();
        for (WebElement list:selectedoptions) {
            System.out.println(list.getText());
        }

    // print the number of options available in the dropdown .
        List<WebElement> numberofoptions=Selectdrop.getOptions();
        System.out.println("\nNumber of elements in dropbox : "+" "+numberofoptions.size());


    }

}
