package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        String path="https://www.google.com/";
        driver.get(path);

        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        String title = driver.getTitle();
        System.out.println("The title of the page is "+title);

        Thread.sleep(3000);

        driver.quit();





    }
}