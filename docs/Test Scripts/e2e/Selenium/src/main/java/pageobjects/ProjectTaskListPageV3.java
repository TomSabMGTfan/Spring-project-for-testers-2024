package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectTaskListPageV3 extends BasePage{
    //project
    @FindBy(xpath = "(//a[contains(text(),'Go to project')])[13]")
    private WebElement pushGoToProjectButton;

    //task list
    @FindBy(xpath = "//button[normalize-space()='Create new task']")
    private WebElement pushCreateNewTaskButton;

    @FindBy(xpath = "//textarea[@name='name']")
    private WebElement enterTaskName;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement enterTaskDescription;

    @FindBy(xpath = "//input[@name='planned_end_date']")
    private WebElement enterTaskDeadline;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    private WebElement pushTheTaskCompleteSubmitButton;

    //review created task in task list
    @FindBy(xpath = "//tbody/tr[1]/td[8]/span[1]//*[name()='svg']")
    private WebElement inTaskListViewIconToReviewTask;
    //Assertions
    @FindBy(xpath = "//div[@class='modal']")
    private static WebElement newTaskInfoCard;

    //Task edit
    @FindBy(xpath = "//tbody/tr[1]/td[8]/span[1]//*[name()='svg']")
    private WebElement newTaskEditButton;
    @FindBy(xpath = "//textarea[@name='name']")
    private WebElement editNameField;
    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement editDescriptionField;
    @FindBy(xpath = "//textarea[@name='worker_username']")
    private WebElement editWorkerField;
    @FindBy(xpath = "//select[@name='status']")
    private WebElement editStatusField;
    @FindBy(xpath = "//input[@name='planned_end_date']")
    private WebElement editDeadLineField;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    private WebElement editFieldSubmitButton;






    //Task remove
    @FindBy(xpath = "//tbody/tr[5]/td[8]/span[1]//*[name()='svg']")
    private WebElement newTaskRemoveButton;







    public ProjectTaskListPageV3(WebDriver driver) {
        super(driver);
    }
    //project
    public void setPushGoToProjectButton(){
        pushGoToProjectButton.click();
    }
    //task list
    public void setPushCreateNewTaskButton(){
        pushCreateNewTaskButton.click();
    }
    public void setEnterTaskName(String txt){
        enterTaskName.sendKeys(txt);
    }
    public void setEnterTaskDescription(String txt){
        enterTaskDescription.sendKeys(txt);
    }
    public void setEnterTaskDeadline(String txt){
        enterTaskDeadline.sendKeys(txt);
    }
    public void setPushTheTaskCompleteSubmitButton(){
        pushTheTaskCompleteSubmitButton.click();
    }
    //review created task in task list
    public void setInTaskListViewIconToReviewTask(){
        inTaskListViewIconToReviewTask.click();
    }
    //Assertions
    public static String geNewTaskInfoCard() {
        return newTaskInfoCard.getText();
    }
    //new task edit
    public void setNewTaskEditButton(){
        newTaskEditButton.click();
    }
    public void setEditNameField(String txt){
        editNameField.sendKeys(txt);
    }
    public void setEditDescriptionField(String txt){
        editDescriptionField.sendKeys(txt);
    }
    public void setEditWorkerField(String txt){
        editWorkerField.sendKeys(txt);
    }
    public void setEditStatusField(String txt){
        editStatusField.sendKeys(txt);
    }
    public void setEditDeadLineField(String txt){
        editDeadLineField.sendKeys(txt);
    }
    public void setEditFieldSubmitButton(){
        editFieldSubmitButton.submit();
    }




    //new task remove
    public void setNewTaskRemoveButton(){
        newTaskRemoveButton.click();
    }











}
