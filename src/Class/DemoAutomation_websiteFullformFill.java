package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DemoAutomation_websiteFullformFill {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.automationtesting.in/Register.html");


        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pranay");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Khajindar");
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Birds valley road,AVA avenue,15th floor,ft no :150,New York, USA");
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[3]/div/input")).sendKeys("ZZz@gmail.com"); //Email-id
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("15506552222"); //phone number
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[5]/div//input")).click();    //select Gender
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[6]/div/div[2]/input")).click(); //select Hobby movies.
        //Below languages Selected.
        driver.findElement(By.xpath("//div[@id='msdd']")).click();  //Open languages box .
        driver.findElement(By.xpath("//div[@class=\"form-group\"][7]//div/multi-select/div/ul/li[8]")).click(); //english
        driver.findElement(By.xpath("//div[@class=\"form-group\"][7]//div/multi-select/div/ul/li[13]")).click();//german
        driver.findElement(By.xpath("//div[@class=\"form-group\"][7]//div/multi-select/div/ul/li[16]")).click();//hindi

//------------Mandatory Action to remove focus from language box -------------------------
        Actions mouse = new Actions(driver);
        mouse.click(driver.findElement(By.xpath("//div[@class=\"row \"]"))).perform();
        Thread.sleep(2000);
//---------------xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx----------------------------------

        //Select Skill
        driver.findElement(By.xpath("//select[@id=\"Skills\"]")).click();
        WebElement skill =driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
        Select Selectskills = new Select(skill);
        Selectskills.selectByVisibleText("Analytics");

        //Select country
        driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();  //click to open country box
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class=\"select2-container select2-container--default select2-container--open\"]//ul//li[6]")).click(); //select country India

//------------Mandatory Action to remove focus from country box -------------------------
        mouse.click(driver.findElement(By.xpath("//div[@class=\"row \"]"))).perform();
        Thread.sleep(2000);
//---------------xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx----------------------------------

        //select Year
        driver.findElement(By.xpath("//span[@class=\"selection\"]")).click();
        WebElement Year =driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
        Select yearr =new Select(Year);
        yearr.selectByVisibleText("2000");
        //select month .
        driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")).click();
        WebElement Month =driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
        Select Moonth =new Select(Month);
        Moonth.selectByVisibleText("October");
        //select day
        driver.findElement(By.xpath("//select[@placeholder=\"Day\"]")).click();
        WebElement days =driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
        Select day =new Select(days);
        day.selectByVisibleText("13");

        //Password
        driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("fsdf");  //firstpassword
        driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("gggg"); //confirm password

        //submit
        driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();



//        List<WebElement>lang=driver.findElements(By.xpath("//div[@class=\"form-group\"][7]//div/multi-select/div/ul"));
//        for (WebElement languages:lang){
//            if (languages.getText().equals("English")||languages.getText().equals("German")){
//                languages.click();
//            }
//        }


    }
}
