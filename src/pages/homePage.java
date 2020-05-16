package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

    String baseUrl = "https://katalon-demo-cura.herokuapp.com/";
    WebDriver driver;

    public homePage(WebDriver driver){
        this.driver = driver;
    }
   public void clickMakeAppointmentButton(){
       driver.findElement(By.id("btn-make-appointment")).click();
   }

   public void OpenMenu(){
        driver.findElement(By.id("menu-toggle")).click();
   }
   public void openLoginPage(){
       driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")).click();
       // check being in login page
       if (driver.findElements(By.id("txt-username")).size() != 0){
           System.out.println("this is login page.");
       }
       else{
           System.out.println("error! this is not the login page.");
       }
   }

}
