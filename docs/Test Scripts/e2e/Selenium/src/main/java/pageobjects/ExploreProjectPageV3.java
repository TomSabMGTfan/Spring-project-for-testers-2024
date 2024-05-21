package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExploreProjectPageV3 extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='Explore']")
    private WebElement exploreProjectsSymvbolOnTopNearHomeSymbol;
    @FindBy(xpath = "//input[@placeholder='Search..']")
    private WebElement enterProjectNameInSearchField;
    @FindBy(xpath = "//div[@class='main-content']//a[2]")
    private WebElement selectCurrentProjectFromPProjectlist;
    //Assertion explore projects
    @FindBy(xpath = "//h3[normalize-space()='Name: Test13']")
    private WebElement assertionExploreProjects;





    public ExploreProjectPageV3(WebDriver driver) {
        super(driver);
    }

    public void setExploreProjectsSymvbolOnTopNearHomeSymbol(){
        exploreProjectsSymvbolOnTopNearHomeSymbol.click();
    }
    public void setEnterProjectNameInSearchField(String txt){
        enterProjectNameInSearchField.sendKeys(txt);
    }
    public void setSelectCurrentProjectFromPProjectlist(){
        selectCurrentProjectFromPProjectlist.click();
    }
    //Assertion explore projects
    public String getAssertionExploreProjects(){
        return assertionExploreProjects.getText();
    }



}
