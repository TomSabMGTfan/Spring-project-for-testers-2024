package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPageV3 extends BasePage{


    @FindBy(xpath = "(//button[normalize-space()='Create new project'])[1]")
    private WebElement createNewProjectButton;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputProjectName;

    //Random Project Name
    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputProjectNameV2;

    @FindBy(xpath = "//input[@name='description']")
    private WebElement inputProjectDescription;

    //Random Project Description
    @FindBy(xpath = "//input[@name='description']")
    private WebElement inputProjectDescriptionV2;

    @FindBy(xpath = "//input[@name='description']")
    private WebElement inputProjectDescriptionButtonSubmit;
    //Assertions
    @FindBy(xpath = "(//button[normalize-space()='Create new project'])[1]")
    private static WebElement theButtonToCreateANewProjectIsAvailable;




    public ProjectPageV3(WebDriver driver) {
        super(driver);
    }

    //create new project
    public void setCreateNewProjectButton (){
        createNewProjectButton.click();
    }
    public void setInputProjectName(String txt){
        inputProjectName.sendKeys(txt);
    }
    //Random Project Name
    public void setInputProjectNameV2 (String projectName) {
        inputProjectNameV2.sendKeys(projectName);
    }

    public void setInputProjectDescription(String txt){
        inputProjectDescription.sendKeys(txt);
    }
    //Random Project Description
    public void setInputProjectDescriptionV2(String projectDescription){
        inputProjectDescriptionV2.sendKeys(projectDescription);
    }

    public void setInputProjectDescriptionButtonSubmit(){
        inputProjectDescriptionButtonSubmit.submit();
    }
    //Assertions
    public static String getTheButtonToCreateANewProjectIsAvailable() {
        return theButtonToCreateANewProjectIsAvailable.getText();
    }




}
