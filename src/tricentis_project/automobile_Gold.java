package tricentis_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class automobile_Gold {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://www.sparkstone.co.nz/sampleapp/101/#");
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));

        // Select Automobile below .
        driver.findElement(By.xpath("//a[@id=\"nav_automobile\"][text()=\"Automobile\"][1]")).click();

        //  --------------  1st Page below --------------
        // Select car make .
        WebElement CarMake =driver.findElement(By.xpath("//select[@id=\"make\"]"));
        Select carmake =new Select(CarMake);
        carmake.selectByVisibleText("Porsche");
        // Enter Engine Cc .
        driver.findElement(By.xpath("//input[@id=\"engineperformance\"]")).sendKeys("2000");
        //select Manufacturing Date
        driver.findElement(By.xpath("//input[@id=\"dateofmanufacture\"]")).sendKeys("10/10/2010");
        //Select No.of Seats .
        driver.findElement(By.xpath("//select[@id=\"numberofseats\"]"));
        WebElement NoOfseats =driver.findElement(By.xpath("//select[@id=\"numberofseats\"]"));
        Select seats =new Select(NoOfseats);
        seats.selectByVisibleText("2");
        // Select Fuel Type
        driver.findElement(By.xpath("//select[@id=\"fuel\"]")).click();
        WebElement FuelType =driver.findElement(By.xpath("//select[@id=\"fuel\"]"));
        Select fuel =new Select(FuelType);
        fuel.selectByValue("Petrol");
        // input Price .
        driver.findElement(By.xpath("//input[@id=\"listprice\"]")).sendKeys("100000");
        // License Plate
        driver.findElement(By.xpath("//input[@id=\"licenseplatenumber\"]")).sendKeys("6TRJ244");
        //Select Mielage
        driver.findElement(By.xpath("//input[@id=\"annualmileage\"]")).sendKeys("500");
        //Select Next .
        driver.findElement(By.xpath("//button[@id=\"nextenterinsurantdata\"]")).click();

        //  ----------- 2nd page below ---------------

        //Enter First Name
        driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("Pranay");
        //Enter Last Name
        driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Khajindar");
        //Enter Birthdate
        driver.findElement(By.xpath("//input[@id=\"birthdate\"]")).sendKeys("10/13/2000");
        //enter Gender
        driver.findElement(By.xpath("//div[@class=\"field\"]//p//label[1]")).click();
        //Enter Address .
        driver.findElement(By.xpath("//input[@id=\"streetaddress\"]")).sendKeys("Park Avenue , 6th floor,ftno 600, Bella Blvd,Ontario Canada");
        // Select Country .
        driver.findElement(By.xpath("//select[@id=\"country\"]")).click();
        WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        Select selcountry=new Select(country);
        selcountry.selectByVisibleText("Canada");
        //Enter Zip Code.
        driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("411030");
        // City
        driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Ontario");
        //Select Occupation
        WebElement occupation =driver.findElement(By.xpath("//select[@id=\"occupation\"]"));
        Select occ =new Select(occupation);
        occ.selectByVisibleText("Selfemployed");
        // input Hobbies
        driver.findElement(By.xpath("//div[@class=\"field idealforms-field idealforms-field-checkbox\"][1]//p/label[1]")).click();
        //driver.findElement(By.xpath("//input[@id=\"skydiving\"]")).click();
        // Website
        driver.findElement(By.xpath("//input[@id=\"website\"]")).sendKeys("https://www.nerdwallet.com/ca/credit-cards/credit-card-zip-code-postal-code#:~:text=Postal%20codes%20in%20Canada%20are,helps%20Canada%20Post%20sort%20mail.");
        // Select Next
        driver.findElement(By.xpath("//button[@id=\"nextenterproductdata\"]")).click();

        //  ----------------xxxxx --3rd page below ---------------
        //Enter Start Date
        driver.findElement(By.xpath("//input[@id=\"startdate\"]")).sendKeys("10/05/2023");
        //Select Insurance Sum
        driver.findElement(By.xpath("//select[@id=\"insurancesum\"]")).click();
        WebElement Insuranamt =driver.findElement(By.xpath("//select[@id=\"insurancesum\"]"));
        Select insamt =new Select(Insuranamt);
        insamt.selectByVisibleText(" 35.000.000,00");
        //Select Merit Rating
        driver.findElement(By.xpath("//select[@id=\"meritrating\"]")).click();
        WebElement Meritr=driver.findElement(By.xpath("//select[@id=\"meritrating\"]"));
        Select merit =new Select(Meritr);
        merit.selectByVisibleText("Bonus 4");
        //Select Damage Insurance
        driver.findElement(By.xpath("//select[@id=\"damageinsurance\"]")).click();
        WebElement DmgInsu=driver.findElement(By.xpath("//select[@id=\"damageinsurance\"]"));
        Select damInsu =new Select(DmgInsu);
        damInsu.selectByVisibleText("Full Coverage");
        // Select Optional Product
        Thread.sleep(3000);
        driver.findElement(By.xpath("//section[@class=\"idealsteps-step\"][3]//div[@class=\"field idealforms-field idealforms-field-checkbox\"]//span[1]")).click();
        // Select Courtesy Car
        driver.findElement(By.xpath("//select[@id=\"courtesycar\"]")).click();
        WebElement CourtCar=driver.findElement(By.xpath("//select[@id=\"courtesycar\"]"));
        Select courcar =new Select(CourtCar);
        courcar.selectByValue("Yes");
        //Click on next
        driver.findElement(By.xpath("//button[@id=\"nextselectpriceoption\"]")).click();

        // ----------------xxxxxxxxxxxx  4th page Below--------------------------

        String price=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[1]/td[3]")).getText();
        String Onlineclaim=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[2]/td[3]")).getText();
        String ClaimsDisc=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[3]/td[3]")).getText();
        String WorldWideCover=driver.findElement(By.xpath("//table[@id=\"priceTable\"]//tbody/tr[4]/td[3]")).getText();

        if (price.equalsIgnoreCase("801.00")&&Onlineclaim.equalsIgnoreCase("Submit")&&ClaimsDisc.equalsIgnoreCase("2")&&WorldWideCover.equalsIgnoreCase("Limited")){
            driver.findElement(By.xpath("//table[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")).click();
            // Click on Next
            driver.findElement(By.xpath("//button[@id=\"nextsendquote\"]")).click();
        }


        // ---------------5th Page below -------------------------------
        // Enter Email .
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kkk@gl.commm");
        //enter Phone Number
        driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("75445454554");
        // enter Username
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("porsche_2023");
        // enter Password
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Porsche_2023");
        //Confirm  Password .
        driver.findElement(By.xpath("//input[@id=\"confirmpassword\"]")).sendKeys("Porsche_2023");
        // enter Comments
        driver.findElement(By.xpath("//textarea[@id=\"Comments\"]")).sendKeys("Hello Porsche !!");
        // Click on Send Button
        driver.findElement(By.xpath("//button[@id=\"sendemail\"]")).click();

        //  ------------------  Final    -------     Get message below  ---------------------------
        System.out.println(driver.findElement(By.xpath("//div[@class=\"sweet-alert showSweetAlert visible\"]")).getText());
        Thread.sleep(4000);
        //click on ok
        driver.findElement(By.xpath("//div[@class=\"sa-confirm-button-container\"]/button")).click();

    }
}
