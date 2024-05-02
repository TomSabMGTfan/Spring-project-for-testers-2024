package tests;

import org.junit.jupiter.api.Test;
import pageobjects.LoginPage;
import utils.RandomGenerator;

public class LoginTest extends BaseTest {

    LoginPage loginPage;


    @Test
    void userCanClickSignUpAndLogin() throws InterruptedException {
        loginPage = new LoginPage(driver);
//        loginPage = new LoginPage(driver);
        loginPage.clickSignUpButton();


        String name = RandomGenerator.generateRandomUserName();
        loginPage.setEnterUserName(name);

      String email = RandomGenerator.generateRandomEmail();
        loginPage.setEnterEmailAddress(email);

       String pass = RandomGenerator.generateRandomPass();
        loginPage.setEnterPassword(pass);

    //   String repeatpass = RandomGenerator.generateRandomPass();
        loginPage.setRepeatPassword(pass);

        Thread.sleep(1000);

        loginPage.setContinueSignUp();

        loginPage.setClickLogin();

    //       String name = RandomGenerator.generateRandomUserName();
        loginPage.setInputUserName(name);

 //       String pass= RandomGenerator.generateRandomPass();
        loginPage.setInputUserPassword(pass);


        loginPage.setClickRememberMe();
        Thread.sleep(2000);
        loginPage.setClickLogin1();
        Thread.sleep(2000);
        loginPage.setClickLogout();


  //      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

}
