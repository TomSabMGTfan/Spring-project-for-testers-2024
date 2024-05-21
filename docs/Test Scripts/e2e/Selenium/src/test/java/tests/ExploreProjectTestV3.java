package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class ExploreProjectTestV3 extends BaseTest{

    LoginPageV3 loginPageV3;
    ProjectPageV3 projectPageV3;
    ProjectsUpdatePageV3 projectsUpdatePageV3;
    ProjectTaskListPageV3 projectTaskListPageV3;
    ProjectUserListPageV3 projectUserListPageV3;
    ExploreProjectPageV3 exploreProjectPageV3;


    @Test
    void goToExploreProjectsPage(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);
        projectUserListPageV3 = new ProjectUserListPageV3(driver);
        exploreProjectPageV3 = new ExploreProjectPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to explore projects
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        exploreProjectPageV3.setExploreProjectsSymvbolOnTopNearHomeSymbol();
        exploreProjectPageV3.setEnterProjectNameInSearchField("Test13");
        exploreProjectPageV3.setSelectCurrentProjectFromPProjectlist();

        //Assertion explore projects
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedMessage = "Name: Test13";
        String actualMessage = exploreProjectPageV3.getAssertionExploreProjects();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly find project!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

    }



}
