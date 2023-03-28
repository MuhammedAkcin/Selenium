package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String path="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        driver.get(path);

        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));

        boolean isEnabledMale = maleBtn.isEnabled();
        System.out.println("the radio button male is enabled: "+isEnabledMale);

        boolean isDisplayedMale = maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed: "+isDisplayedMale);

        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("the radio button male is selected: "+isSelectedMale);

        if (!isSelectedMale){
            maleBtn.click();
        }

        isSelectedMale=maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedMale);


    }
}
