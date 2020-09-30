package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By linkExample1 = By.xpath("//a[contains(text(),'Example 1')]");
    private By linkExample2 = By.xpath("//a[contains(text(),'Example 2')]");

    public DynamicLoadingPage(WebDriver driver) { this.driver = driver; }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(linkExample2).click();
        return new DynamicLoadingExample2Page(driver);
    }
}
