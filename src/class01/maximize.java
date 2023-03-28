package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        String path="https://www.google.com/";

        driver.get(path);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().getPosition();
    }
}
