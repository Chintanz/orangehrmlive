package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Setup chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Maximise Browser
        driver.manage().window().maximize();
        //We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the page title
        String title = driver.getTitle();
        System.out.println("This is the page title: " + title);

        //Print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current url: " + url);

        //Print the page source
        System.out.println("Page source" + driver.getPageSource());

        //Enter the username to username field
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Close the browser
        driver.close();
    }

}
