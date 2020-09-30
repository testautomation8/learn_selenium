package testautomation;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testWaitUntilVisible(){
        var dynamicLoadingPage = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingPage.clickStartButton();
        assertEquals(dynamicLoadingPage.isStartButtonDisplayed(),false,"Button is displayed");
        assertEquals(dynamicLoadingPage.getLoadedText(),"Hello World!","Text displayed is incorrect");
    }
}
