package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        //        tell your project where the webdriver is located.
        //        for mac user please do not use .exe with chromedriver

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        String path="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

        driver.get(path);
        driver.manage().window().maximize();


        // find the username
        WebElement username=driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
        username.sendKeys("Tester");

        WebElement password=driver.findElement(By.xpath("//input[@type= 'password']"));
        password.sendKeys("test");


        // clear the username text box using method clear()
        username.clear();

        // get the username text which is beside the username text box
        WebElement usernameText=driver.findElement(By.xpath("//label[text()= 'Username:']"));
        System.out.println(usernameText.getText());

        //get the password text which is beside the password text box
        WebElement passwordText=driver.findElement(By.xpath("//label[text()= 'Password:']"));
        String passText=passwordText.getText();
        System.out.println(passText);



    }
}
