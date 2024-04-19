package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.*;
import java.util.List;

public class Handle_brokenLinks {
    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement>Links=driver.findElements(By.tagName("a"));
        System.out.println(Links.size());

        for (WebElement link:Links) {
            String LinkUrl = link.getAttribute("href");  //this is getting link url in LinkUrl
            URL url = new URL(LinkUrl);                        // this is collecting all links in LinkUrl in url
            // below ==> this is opening the connection with url and returning an object
            URLConnection urlConnection = url.openConnection();
// below ==> here connection object above is converted to  https connection through which we can send a connection request
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            //below we are setting wait for 5sec before timeout
            httpURLConnection.setConnectTimeout(5000);
            // below we are connecting to url.
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode()>=400) {
                System.out.println(LinkUrl + "--" + httpURLConnection.getResponseMessage());
            }
            else    System.err.println(LinkUrl+"--"+httpURLConnection.getResponseCode());


            httpURLConnection.disconnect();
        }


    }
}
