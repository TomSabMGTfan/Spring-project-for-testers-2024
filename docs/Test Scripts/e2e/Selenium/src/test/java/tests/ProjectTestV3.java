package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.LoginPageV3;
import pageobjects.ProjectPageV3;
import utils.RandomGenerator;

import java.util.concurrent.TimeUnit;

public class ProjectTestV3 extends BaseTest{

    LoginPageV3 loginPageV3;
    ProjectPageV3 projectPageV3;


    @Test
    void CreateNewProjectV1() {

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();


        //create new project
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectPageV3.setCreateNewProjectButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectPageV3.setInputProjectName("Ref4");
        projectPageV3.setInputProjectDescription("Description1");
        projectPageV3.setInputProjectDescriptionButtonSubmit();


        //Assertions
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedMessage = "Create new project";
        String actualMessage = ProjectPageV3.getTheButtonToCreateANewProjectIsAvailable();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly created project V1!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();
    }


    @Test
    void CreateNewProjectV2() {


        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();


        //create new project
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectPageV3.setCreateNewProjectButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Random Project Name
        String projectName = RandomGenerator.generateRandomProjectName();
        projectPageV3.setInputProjectNameV2(projectName);
       // projectPage.setInputProjectName("Ref4");

        //Random Project Description
        String projectDescription = RandomGenerator.generateRandomProjectDescription();
        projectPageV3.setInputProjectDescriptionV2(projectDescription);
       // projectPage.setInputProjectDescription("Description1");

        projectPageV3.setInputProjectDescriptionButtonSubmit();


        //Assertions
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedMessage = "Create new project";
        String actualMessage = ProjectPageV3.getTheButtonToCreateANewProjectIsAvailable();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly created project V2!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

    }


}




