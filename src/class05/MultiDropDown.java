package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dd=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(dd);

        sel.selectByValue("New Jersey");
        sel.selectByVisibleText("Ohio");
        sel.selectByIndex(0);

        Thread.sleep(2000);

        sel.deselectByIndex(2);
        sel.deselectByVisibleText("Ohio");
        sel.deselectByValue("California");

        System.out.println("The dropdown is multiple: "+sel.isMultiple());


    }
}
