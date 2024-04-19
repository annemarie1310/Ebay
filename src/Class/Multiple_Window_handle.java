package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Multiple_Window_handle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Windows.html"); // ( Parent Window ).

        //click to switch to new window........................   ( child Window ).
        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"][1]")).click();

        // Method 1 with Set and Iterator .
        Set<String>WindoIds =driver.getWindowHandles();
        Iterator<String>it = WindoIds.iterator();
        String parent_window=it.next();
        String child_window=it.next();

        System.out.println("Parent WindowId is ==>"+parent_window);
        System.out.println("Child WindowId is ==>"+child_window);
/*
        // Method 2 .. Convert Set of WindowId's to List
        List<String>window_ids=new ArrayList<>(WindoIds);
        String PrarentWindowId =window_ids.get(0);
        String ChildWindowId =window_ids.get(1);

        System.out.println("Parent WindowId is ==>"+PrarentWindowId);
        System.out.println("Child WindowId is ==>"+ChildWindowId);
*/

        // Now .. Switching between Windows using driver.switch().

        // now have switched to Parent window.................
        driver.switchTo().window(parent_window);
        System.out.println("Parent Window Title ==>"+driver.getTitle());


        // now have Switched to child Window...................
        driver.switchTo().window(child_window);
        System.out.println("Child Window Title ==>"+driver.getTitle());


/*
        // We Print ALl browser Title's with forEach Loop .

        for (String winid:WindoIds){
            String title =driver.switchTo().window(winid).getTitle();
            System.out.println(title);
        }
*/

/*
        // we can also close Specific browser's with for Loop .
        for (String winid:WindoIds) {
            String title = driver.switchTo().window(winid).getTitle();
            if (title.equals("Selenium")||title.equals("anotherwindow title")){
                driver.close();
            }
        }

*/

         driver.close(); // Will Close particular window on which driver is focused.
        // driver.quit();  // Will close All windows opened.
    }
}
