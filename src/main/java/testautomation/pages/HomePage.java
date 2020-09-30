package testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) { this.driver = driver; }

    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public NestedFramesPage clickNestedFrames(){
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }



    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
