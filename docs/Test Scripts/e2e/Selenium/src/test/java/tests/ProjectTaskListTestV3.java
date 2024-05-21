package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobjects.ProjectTaskListPageV3;
import pageobjects.LoginPageV3;
import pageobjects.ProjectPageV3;
import pageobjects.ProjectsUpdatePageV3;
import utils.RandomGenerator;

import java.util.concurrent.TimeUnit;

public class ProjectTaskListTestV3 extends BaseTest{

    LoginPageV3 loginPageV3;
    ProjectPageV3 projectPageV3;
    ProjectsUpdatePageV3 projectsUpdatePageV3;
    ProjectTaskListPageV3 projectTaskListPageV3;


    //only to look project settings page - task list page
    @Test
    void onlyGoToProjectSettings(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to project settings
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectTaskListPageV3.setPushGoToProjectButton();

        //Assertions



        System.out.println("successfully entered to project task list!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

    }
        //manual data entering
    @Test
    void enterToProjectSettingsAndCreateNewTaskV1(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to project settings
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectTaskListPageV3.setPushGoToProjectButton();

        //Create new task list
        projectTaskListPageV3.setPushCreateNewTaskButton();
        projectTaskListPageV3.setEnterTaskName("Task1");
        projectTaskListPageV3.setEnterTaskDescription("Description1");
        projectTaskListPageV3.setEnterTaskDeadline("05/24/2024"); //   mm/dd/yyyy
        projectTaskListPageV3.setPushTheTaskCompleteSubmitButton();


        //Assertions

        System.out.println("successfully create new task in project!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

    }

    //automatic data entering
    @Test
    void enterToProjectSettingsAndCreateNewTaskV2(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to project settings
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectTaskListPageV3.setPushGoToProjectButton();

        //Create new task list
        projectTaskListPageV3.setPushCreateNewTaskButton();
        //Random Project Name
        String projectTaskName = RandomGenerator.generateRandomProjectTaskName();
        projectTaskListPageV3.setEnterTaskName(projectTaskName);
       // projectSettingsPageV3.setEnterTaskName("Task1");

        String projectTaskDescription = RandomGenerator.generateRandomProjectTaskDescription();
        projectTaskListPageV3.setEnterTaskDescription(projectTaskDescription);
        //projectSettingsPageV3.setEnterTaskDescription("Description1");

        //String projectTaskDeadline = RandomGenerator.generateRandomDate();
        //projectSettingsPageV3.setEnterTaskDeadline(projectTaskDeadline);
        projectTaskListPageV3.setEnterTaskDeadline("05/24/2024"); //   mm/dd/yyyy

        projectTaskListPageV3.setPushTheTaskCompleteSubmitButton();


        //Assertions

        System.out.println("successfully create new task in project!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();


    }
//review icon in TASK list page
    @Test
    void reviewIconInTaskListPage(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to project settings
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectTaskListPageV3.setPushGoToProjectButton();

        //review created task in task list
        projectTaskListPageV3.setInTaskListViewIconToReviewTask();

        //Assertions
        //String expectedMessage = "Id", "Name", "Description", "Worker", "Status", "Created on", "Deadline";
//
//        String expectedMessage = "Deadline";
//        String actualMessage = ProjectTaskListPageV3.geNewTaskInfoCard();
//        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("successfully viewed new task INFO!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

    }
    //Edit icon in TASK list page
    @Test
    void editIconInTaskListPage(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to project settings
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectTaskListPageV3.setPushGoToProjectButton();

        //new task edit
        projectTaskListPageV3.setNewTaskEditButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //fields
        projectTaskListPageV3.setEditNameField("Task 33");
        projectTaskListPageV3.setEditDescriptionField("Description 33");
        projectTaskListPageV3.setEditWorkerField("Kimberly Miler");
        projectTaskListPageV3.setEditWorkerField("in progress"); //"to do", "in progress", "done"
        projectTaskListPageV3.setEditDeadLineField("05/24/2024");
        projectTaskListPageV3.setEditFieldSubmitButton();


        //reikia edit visus laukus, pagal galimybes, parasyti Essertion

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

    }

    //remove icon in TASK list page
    @Test
    void removeIconInTaskListPage(){

        loginPageV3 = new LoginPageV3(driver);
        projectPageV3 = new ProjectPageV3(driver);
        projectsUpdatePageV3 = new ProjectsUpdatePageV3(driver);
        projectTaskListPageV3 = new ProjectTaskListPageV3(driver);


        //login
        loginPageV3.setLoginButton();
        loginPageV3.setEnterUserName("tomas.sab@mail.com");
        loginPageV3.setEnterUserPassword("Tomas.Sab@123456,");
        loginPageV3.setRememberMeButton();
        loginPageV3.setLoginButtonInLoginPage();

        //Go to project settings
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projectTaskListPageV3.setPushGoToProjectButton();

        //new task edit
        projectTaskListPageV3.setNewTaskRemoveButton();

        //pagal galimybes, parasyti Essertion - nera patvirtinimo kad issitrina


        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageV3.setLogoutButtoninProjectPage();

    }




}
