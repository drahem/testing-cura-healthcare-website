package test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import pages.makeAppointmentPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class makeAppointmentTest extends testBase{
    WebDriver driver;
    ATUTestRecorder recorder;
    String baseUrl = "https://katalon-demo-cura.herokuapp.com/";
    homePage homePageObj;
    loginPage loginPageObj;
    makeAppointmentPage makeAppointmentPageObj;

    public makeAppointmentTest(WebDriver driver){
        this.driver = driver;
    }

    @BeforeTest
    public void setup() throws ATUTestRecorderException {
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        Date date = new Date();
        recorder = new ATUTestRecorder("videos",
                "TestVideo-"+dateFormat.format(date),false);
        chooseBrowser("firefox");
        driver.get(baseUrl);
        recorder.start();
    }

    @Test(priority = 0)
    public void loginSenario(){
        homePageObj = new homePage(driver);
        loginPageObj = new loginPage(driver);
        makeAppointmentPageObj = new makeAppointmentPage(driver);

        homePageObj.OpenMenu();
        homePageObj.openLoginPage();
        loginPageObj.enterUserNameAndPassword("John Doe","ThisIsNotAPassword");
        loginPageObj.clickLoginButton();
    }

    @Test(priority = 1)
    public void bookAppointmentSenario(){
        // from excel file contains data for some appointments
        // loop in :
            // book appointment
            // back to home page
        // finally view history page

    }

}
