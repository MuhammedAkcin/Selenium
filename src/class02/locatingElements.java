package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        String path="https://www.facebook.com/";
        driver.get(path);

// send in the username
        driver.findElement(By.id("email")).sendKeys("m_akcin1907@windowslive.com");

// send in the password
        driver.findElement(By.name("pass")).sendKeys("M_akcin1907");

// click on forgot password
        driver.findElement(By.partialLinkText("password?")).click();

        driver.close();

 // click on the button create New Account
//        driver.findElement(By.linkText("Create new account")).click();



    }
}
