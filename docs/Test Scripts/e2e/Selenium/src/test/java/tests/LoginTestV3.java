package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.LoginPageV3;

import java.util.concurrent.TimeUnit;

public class LoginTestV3 extends BaseTest{

    LoginPageV3 loginPageV3;


    @Test
    void RegisteredUserLoginAndLogout(){

        loginPageV3 = new LoginPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();


        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

        //Assertions
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedMessage = "Login";
        String actualMessage = loginPageV3.getJoinNowButtonOnMainPage();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Login and Logout!!!");

    }

}
