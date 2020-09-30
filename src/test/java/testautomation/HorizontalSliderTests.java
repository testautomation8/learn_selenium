package testautomation;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HorizontalSliderTests extends BaseTests{

    @Test
    public void testHorizontalSlider(){

        String sliderValue= "4";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.clickSlider(sliderValue);
        Assert.assertEquals(horizontalSliderPage.getNumber(), sliderValue,"Number displayed is incorrect");

    }

}
