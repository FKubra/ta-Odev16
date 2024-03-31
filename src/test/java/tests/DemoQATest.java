package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoQATest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.demoQAPage.open();
    }

    @Test
    public void clickMeButtonTest(){
        pageManager.demoQAPage.ClickMeButtons();
        assertThat(pageManager.demoQAPage.getMessage()).isEqualTo("You have done a dynamic click");
    }

    @Test
    public void webTablesTest(){
        pageManager.demoQAPage.addRecordTest("Kübra","Dikmen","kubra@mail.com","27","12345","Test");
        assertThat(pageManager.demoQAPage.firstNameAfterSubmit.getText()).isEqualTo("Kübra");

        pageManager.demoQAPage.editRecord("28");
        assertThat(pageManager.demoQAPage.ageAfterEdit.getText()).isEqualTo("28");
    }
}
