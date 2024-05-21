package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsUpdatePageV3 extends BasePage{

    @FindBy(xpath = "(//button[contains(text(),'Update')])[1]")
    private WebElement updateProjectOneButton;

    @FindBy(xpath = "//select[@name='status']")
    private WebElement updateProjectStatusButton;

    @FindBy(xpath = "//button[normalize-space()='Update Project']")
    private WebElement finishUpdateProjectButton;
    //Assertations
    @FindBy(xpath = "//td[normalize-space()='done']")
    private static WebElement statusOfSelectedProject;




    public ProjectsUpdatePageV3(WebDriver driver) {
        super(driver);
    }


    public void setUpdateProjectOneButton(){
        updateProjectOneButton.click();
    }
    public void setUpdateProjectStatusButton(String txt){
        updateProjectStatusButton.sendKeys(txt);
    }
    public void setFinishUpdateProjectButton(){
        finishUpdateProjectButton.click();
    }
    //Assertions
    public static String getStatusOfSelectedProject() {
        return statusOfSelectedProject.getText();
    }






}
