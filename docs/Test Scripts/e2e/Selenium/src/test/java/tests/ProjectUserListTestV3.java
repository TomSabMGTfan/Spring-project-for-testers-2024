package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class ProjectUserListTestV3 extends BaseTest{

    LoginPageV3 loginPageV3;
    ProjectPageV3 projectPageV3;
    ProjectsUpdatePageV3 projectsUpdatePageV3;
    ProjectTaskListPageV3 projectTaskListPageV3;
    ProjectUserListPageV3 projectUserListPageV3;

    //user list in Task List Page
    @Test
    void goToUserListAndEdit(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);
        projectUserListPageV3 = new ProjectUserListPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to project settings
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectTaskListPageV3.setPushGoToProjectButton();

        //user list
        projectUserListPageV3.setLinkToUserListInTaskListPage();
        projectUserListPageV3.setAddUserToProjectButton();
        projectUserListPageV3.setWriteUsernameToField("User8");
        projectUserListPageV3.setPushAddUserButton();

        //promote user
        projectUserListPageV3.setPromoteUserInUserList();
        //demote user
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectUserListPageV3.setDemoteUserInUserList();

        //Assertion promote User8
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        String expectedMessage = "admin";
//        String actualMessage = projectUserListPageV3.getTestPromoteUserInUserList();
//        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");
//
//        System.out.println("Succesfuly Assertion  promote User8!!!");


        //Assertion demote User8
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedMessage = "Promote";
        String actualMessage = projectUserListPageV3.getTestDemoteUserInUserList();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Assertion demote User8!!!");


        //Remove user
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectUserListPageV3.setRemoveUserInUserRoleAction();

        System.out.println("Succesfuly removed User8!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();





    }


}
