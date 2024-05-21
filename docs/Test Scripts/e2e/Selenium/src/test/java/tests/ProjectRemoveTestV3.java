package tests;

import org.junit.jupiter.api.Test;
import pageobjects.LoginPageV3;
import pageobjects.ProjectPageV3;
import pageobjects.ProjectRemovePageV3;
import pageobjects.ProjectsUpdatePageV3;

import java.util.concurrent.TimeUnit;

public class ProjectRemoveTestV3 extends BaseTest{

    LoginPageV3 loginPageV3;
    ProjectPageV3 projectPageV3;
    ProjectsUpdatePageV3 projectsUpdatePageV3;
    ProjectRemovePageV3 projectRemovePageV3;

    @Test
    void removeProjectFromAllProjectListV1(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectRemovePageV3 = new ProjectRemovePageV3(driver);

        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Delete project
        //Change project number in Project Remove Page V3
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectRemovePageV3.setRemoveProjectButton();

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();


        System.out.println("Deleted project without confirmation!!!");



    }













}
