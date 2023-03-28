package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String path="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        driver.get(path);

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[name='ageGroup']"));
        for (WebElement button:radioButtons) {
            String age = button.getAttribute("value");
            if (age.equals("5 - 15")){
                button.click();
            }
        }
    }
}
