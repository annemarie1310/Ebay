package Class;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class Cookie_management {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");

            Set<Cookie> cookies =driver.manage().getCookies();
        System.out.println("size of cookies : "+cookies.size());

        for (Cookie cokie :cookies)
        {
            System.out.println(cokie.getName()+" : "+cokie.getValue());  // print All cookie names and values.
        }

        System.out.println(driver.manage().getCookieNamed("session-id-time : 2082787201l")); //this will print info about a cookie

        //add new Cookie
        Cookie ckname =new Cookie("MyCookie","454545455");
        driver.manage().getCookies();

        cookies=driver.manage().getCookies();
        System.out.println("size of cookies"+cookies.size());

        for (Cookie cokie :cookies)
        {
            System.out.println(cokie.getName()+" : "+cokie.getValue());  // print All cookie names and values.
        }

        // delete the cookie.
        driver.manage().deleteCookieNamed("session-id-time");
        driver.manage().deleteAllCookies();

        for (Cookie cokie :cookies)
        {
            System.out.println(cokie.getName()+" : "+cokie.getValue());  // print All cookie names and values.
        }

    }
}
