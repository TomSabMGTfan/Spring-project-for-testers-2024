package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectUserListPageV3 extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='User list']")
    private WebElement linkToUserListInTaskListPage;
    @FindBy(xpath = "//button[normalize-space()='Add user to project']")
    private WebElement addUserToProjectButton;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement writeUsernameToField;
    @FindBy(xpath = "//button[normalize-space()='Add user']")
    private WebElement pushAddUserButton;
    //Username	Role	Actions
    @FindBy(xpath = "//button[normalize-space()='Promote']")
    private WebElement promoteUserInUserList;
    @FindBy(xpath = "//button[normalize-space()='Promote']")
    private WebElement demoteUserInUserList;
    //Assertion promote User8
    @FindBy(xpath = "//button[normalize-space()='Promote']")
    private WebElement testPromoteUserInUserList;
    //Assertion demote User8
    @FindBy(xpath = "//button[normalize-space()='Promote']")
    private WebElement testDemoteUserInUserList;
    //Remove user
    @FindBy(css = "tbody tr:nth-child(4) td:nth-child(3) button:nth-child(2)")
    private WebElement removeUserInUserRoleAction;









    public ProjectUserListPageV3(WebDriver driver) {
        super(driver);
    }


    public void setLinkToUserListInTaskListPage(){
        linkToUserListInTaskListPage.click();
    }
    public void setAddUserToProjectButton(){
        addUserToProjectButton.click();
    }
    public void setWriteUsernameToField(String txt){
        writeUsernameToField.sendKeys(txt);
    }
    public void setPushAddUserButton(){
        pushAddUserButton.click();
    }
    //promote user
    public void setPromoteUserInUserList(){
        promoteUserInUserList.click();
    }
    //demote user
    public void setDemoteUserInUserList(){
        demoteUserInUserList.click();
    }
    //Assertion promote User8
    public String getTestPromoteUserInUserList(){
        return testPromoteUserInUserList.getText();
    }
    //Assertion demote User8
    public String getTestDemoteUserInUserList(){
        return testDemoteUserInUserList.getText();
    }
    //Remove user
    public void setRemoveUserInUserRoleAction(){
        removeUserInUserRoleAction.click();
    }




}
