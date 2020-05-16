package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class loginPage {
    WebDriver driver;
    String baseUrl = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
    public loginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterUserNameAndPassword(String userName, String password){
        driver.findElement(By.id("txt-username")).sendKeys(userName);
        driver.findElement(By.id("txt-password")).sendKeys(password);

    }
    public void clickLoginButton(){
        driver.findElement(By.id("btn-login")).click();
        // assert being logged in
        Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/#appointment",driver.getCurrentUrl());
    }
}
