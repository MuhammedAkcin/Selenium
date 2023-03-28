package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHdkb6o3-72hj_lVFzsjEFMN2TVhRmBWDq71LFz9rYNxdI4idj5dbCodXMUCGqAMtN6hXK9V&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        String parentwindow=driver.getWindowHandle();
        System.out.println(parentwindow);

        Set<String> allwindow=driver.getWindowHandles();
        for (String wh:allwindow) {
            driver.switchTo().window(wh);
            String title=driver.getTitle();
            if (title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentwindow);

    }
}
