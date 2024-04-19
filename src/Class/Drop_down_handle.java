package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Drop_down_handle {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Register.html");

        //1.print all skills in list
        List<WebElement> Skills= driver.findElements(By.xpath("//select[@id=\"Skills\"]"));
        int i=0;
        for (WebElement typesofskill:Skills){
                System.out.println(i+" "+typesofskill.getText());
          i++;
        }

        WebElement droplist = driver.findElement(By.id("Skills"));
        Select Selectskills = new Select(droplist);

        //2.show selected country
        System.out.println("Selected Skill is "+Selectskills.getFirstSelectedOption().getText());

        //3.show number of skills in the list
        System.out.println("number of skills in list"+Selectskills.getOptions().size());

        //4.select a skill
        Selectskills.selectByVisibleText("Analytics");
       // Selectskills.selectByValue("Analytics");  // here there can be number also.
       // Selectskills.selectByIndex(3);

        //5. show the selected Skill
        System.out.println("Selected Skill is :"+Selectskills.getFirstSelectedOption().getText());

/*
  //not working it's for printing list of options available in droplist with it's index value .
        for (int i=0;i<= Skills.size();i++){
            System.out.println(i+" "+Skills.get(i).getText());
        }
*/




        driver.close();
    }
}
