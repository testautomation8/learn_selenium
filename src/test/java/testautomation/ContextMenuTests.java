package testautomation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String message = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(message,"You selected a context menu","Alert text is incorrect");
    }
}
