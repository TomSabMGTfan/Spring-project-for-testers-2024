package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectRemovePageV3 extends BasePage{


    @FindBy (xpath = "(//button[contains(text(),'Remove')])[77]")
    private WebElement removeProjectButton;



    public ProjectRemovePageV3(WebDriver driver) {
        super(driver);
    }

    public void setRemoveProjectButton(){
        removeProjectButton.click();
    }




}
