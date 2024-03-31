package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class DemoQAPage extends BasePage{

    public DemoQAPage(String pageUrl) {
        super(pageUrl);
    }

    // ÖDEV 16 ADIM 1
    public SelenideElement btnButtons = $(".collapse.element-list.show > .menu-list > li:nth-of-type(5)");
    public SelenideElement btnClickMe = $("div:nth-child(4)>button");
    public SelenideElement txtMessage = $("#dynamicClickMessage");

    //ÖDEV 16 ADIM 2
    public SelenideElement btnWebTables = $(".collapse.element-list.show > .menu-list > li:nth-of-type(4)");
    public SelenideElement btnAdd = $("button#addNewRecordButton");

    public SelenideElement firstName = $("#firstName");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement userEmail = $("#userEmail");
    public SelenideElement age = $("#age");
    public SelenideElement salary = $("#salary");
    public SelenideElement department = $("#department");

    public SelenideElement btnSubmit = $("#submit");
    public SelenideElement firstNameAfterSubmit = $("div:nth-of-type(4) > div[role='row'] > div:nth-of-type(1)");

    public SelenideElement btnEdit = $("#edit-record-4");
    public SelenideElement updateAge = $("#age");
    public SelenideElement btnSubmitAfterEdit = $("#submit");
    public SelenideElement ageAfterEdit = $("div:nth-of-type(4) > div[role='row'] > div:nth-of-type(3)");


    public void ClickMeButtons(){
        btnButtons.click();
        btnClickMe.click();
    }

    public String getMessage(){
        return txtMessage.getText();
    }

    public void addRecordTest(String firstname, String lastname, String userMail, String userAge, String userSalary, String userDepartment){
        btnWebTables.click();
        btnAdd.click();

        firstName.setValue(firstname);
        lastName.setValue(lastname);
        userEmail.setValue(userMail);
        age.setValue(userAge);
        salary.setValue(userSalary);
        department.setValue(userDepartment);

        btnSubmit.click();

    }

    public void editRecord(String uptadeage){

        btnEdit.click();
        updateAge.clear();
        updateAge.setValue(uptadeage);

        btnSubmitAfterEdit.click();

    }

}