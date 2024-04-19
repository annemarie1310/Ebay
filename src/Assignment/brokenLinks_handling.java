package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class brokenLinks_handling {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> Links=driver.findElements(By.tagName("a"));
        System.out.println(Links.size());

        for (WebElement link:Links) {
            String linkurl = link.getAttribute("href");
            URL url = new URL(linkurl);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode()>=400){
                System.err.println(linkurl+" "+httpURLConnection.getResponseMessage()+"is a BROKEN LINK !!!!");
            }
            httpURLConnection.disconnect();

        }



    }
}
