package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tagname {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");

        // get all the links
        List<WebElement> tags=driver.findElements(By.tagName("a"));
        // in order to print use iterator
        for (WebElement tag:tags) {
            String link=tag.getAttribute("href");
            System.out.println(link);

        }
    }
}
