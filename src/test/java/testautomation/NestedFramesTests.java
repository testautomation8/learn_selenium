package testautomation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFramesText(){
        var nestedFramesPage = homePage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT", "Left Frame text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM", "Bottom Frame text is incorrect");
    }

}
