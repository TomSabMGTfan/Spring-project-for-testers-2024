package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageV3 extends BasePage{
        //login
        @FindBy(xpath = "//a[normalize-space()='Login']")
        private WebElement loginButton;

        @FindBy(xpath = "//input[@placeholder='Username']")
        private WebElement enterUserName;

        @FindBy(xpath = "//input[@placeholder='Password']")
        private WebElement enterUserPassword;

        @FindBy(xpath = "//input[@type='checkbox']")
        private WebElement rememberMeButton;

        @FindBy(xpath = "//button[normalize-space()='Login']")
        private WebElement loginButtonInLoginPage;
        //logout
        @FindBy(xpath = "//a[normalize-space()='Logout']")
        private WebElement logoutButtoninProjectPage;
        //Assertions
        @FindBy(xpath = "//a[normalize-space()='Login']")
        private WebElement  joinNowButtonOnMainPage;







    public LoginPageV3(WebDriver driver) {
        super(driver);
    }
    //login
    public void setLoginButton (){
        loginButton.click();
    }
    public void setEnterUserName(String txt){
        enterUserName.sendKeys(txt);
    }
    public void setEnterUserPassword(String txt){
        enterUserPassword.sendKeys(txt);
    }
    public void setRememberMeButton(){
        rememberMeButton.click();
    }
    public void setLoginButtonInLoginPage(){
        loginButtonInLoginPage.click();
    }
    //logout
    public void setLogoutButtoninProjectPage(){
        logoutButtoninProjectPage.click();
    }
    //Assertions
    public String getJoinNowButtonOnMainPage() {
        return joinNowButtonOnMainPage.getText();
    }

}
