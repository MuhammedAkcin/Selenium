package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        WebElement dropdown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select sel=new Select(dropdown);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByValue("Friday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Saturday");

    }
}
