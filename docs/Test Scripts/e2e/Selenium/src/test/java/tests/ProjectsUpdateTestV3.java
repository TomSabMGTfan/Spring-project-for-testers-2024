package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.LoginPageV3;
import pageobjects.ProjectPageV3;
import pageobjects.ProjectsUpdatePageV3;

import java.util.concurrent.TimeUnit;

public class ProjectsUpdateTestV3 extends BaseTest {


    LoginPageV3 loginPageV3;
    ProjectPageV3 projectPageV3;
    ProjectsUpdatePageV3 projectsUpdatePageV3;

    @Test
    void ProjectUpdateV1() {

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Project Update
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectsUpdatePageV3.setUpdateProjectOneButton();
        projectsUpdatePageV3.setUpdateProjectStatusButton("done"); //"ongoing" "done"
        projectsUpdatePageV3.setFinishUpdateProjectButton();

        //Assertions
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String expectedMessage = "done"; //"ongoing" "done"
        String actualMessage = projectsUpdatePageV3.getStatusOfSelectedProject();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Update Project Status V1!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();


    }


        @Test
        void ProjectUpdateV2() {

            loginPageV3 = new LoginPageV3(driver);
            projectPageV3 = new ProjectPageV3(driver);
            projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);


            //login
            loginPageV3.setLoginButton();
            loginPageV3.setEnterUserName("tomas.sab@mail.com");
            loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
            loginPageV3.setRememberMeButton();
            loginPageV3.setLoginButtonInLoginPage();

            //Project Update
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            projectsUpdatePageV3.setUpdateProjectOneButton();
            projectsUpdatePageV3.setUpdateProjectStatusButton("ongoing"); //"ongoing" "done"
            projectsUpdatePageV3.setFinishUpdateProjectButton();

            //Assertions
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            String expectedMessage = "done"; //"ongoing" "done"
            String actualMessage = projectsUpdatePageV3.getStatusOfSelectedProject();
            Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

            System.out.println("Succesfuly Update Project Status V2!!!");

            //logout
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            loginPageV3.setLogoutButtoninProjectPage();


        }


    }

