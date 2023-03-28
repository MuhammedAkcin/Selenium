package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data=table.getText();
        //System.out.println(table_data);

        /*List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:Rows) {
            String rowText=row.getText();
            //System.out.println(rowText);
        }*/


        List<WebElement> Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:Rows) {
            String rowText=row.getText();
            if (rowText.contains("Google")||rowText.contains("Company")){
                //System.out.println(rowText);
            }
        }

        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column:columns) {
            //System.out.println(column.getText());

        }

        List<WebElement> first_columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement column:first_columns) {
            System.out.println(column.getText());

        }

    }
}
