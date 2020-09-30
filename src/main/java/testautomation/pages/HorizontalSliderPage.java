package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By horizontalSlider = By.tagName("input");
    private By sliderNumber = By.id("range");

    public HorizontalSliderPage(WebDriver driver) { this.driver = driver; }

    public void clickSlider(String numberToDisplay){
        driver.findElement(horizontalSlider).click();
        while (!getNumber().equals(numberToDisplay)) {
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getNumber(){
        return driver.findElement(sliderNumber).getText();
    }

}
