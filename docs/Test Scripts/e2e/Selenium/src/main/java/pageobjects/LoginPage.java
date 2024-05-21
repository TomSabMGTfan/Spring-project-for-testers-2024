package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = ".main_page_button")
    private WebElement clickSignUp;

    @FindBy (css = "input[placeholder='Enter your user name']")
    private WebElement enterUserName;

    @FindBy (css = "input[placeholder='Enter your email address']")
    private WebElement enterEmailAddress;

    @FindBy (css = "input[placeholder='Enter your password'][name='password']")
    private WebElement enterPassword;

    @FindBy (css = "input[placeholder='Enter your password'][name='repeatPassword']")
    private WebElement repeatPassword;

    @FindBy (css = "button[type='submit']")
    private WebElement continueSignUp;

    @FindBy (css = "a[href='/login']")
    private WebElement clickLogin;

    @FindBy (css = "input[name='login']")
    private WebElement inputUserName;

    @FindBy (css = "input[name='password']")
    private WebElement inputUserPassword;

    @FindBy (css = "input[name='Re']")
    private WebElement clickRememberMe;

    @FindBy (css = "button[type='submit']")
    private WebElement clickLogin1;

    @FindBy (xpath= "//button[normalize-space()='Logout']")
    private WebElement clickLogout;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpButton (){
        clickSignUp.click();
    }
    public void setEnterUserName (String txt) {
        enterUserName.sendKeys(txt);
    }

    public void setEnterEmailAddress (String txt) {
        enterEmailAddress.sendKeys(txt);
    }

    public void setEnterPassword (String txt) {
        enterPassword.sendKeys(txt);

    }

    public void setRepeatPassword (String txt) {
        repeatPassword.sendKeys(txt);
    }

    public void setContinueSignUp () {
        continueSignUp.click();
    }
    public void setClickLogin () {
        clickLogin.click();
    }

    public void setInputUserName (String username) {
        inputUserName.sendKeys(username);
    }

    public void setInputUserPassword (String password) {
        inputUserPassword.sendKeys(password);
    }

    public void setClickRememberMe () {
        clickRememberMe.click();
    }

    public void setClickLogin1 () {
        clickLogin1.click();
    }

    public void setClickLogout () {
        clickLogout.click();
    }
}