package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class makeAppointmentPage {
    WebDriver driver;
    String baseUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";

    public makeAppointmentPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFacility(String facility){
        driver.findElement(By.id("combo_facility")).click();
        if (facility == "tokyo"){
            driver.findElement(By.xpath("Xpath=//*[contains(text(),'Tokyo CURA Healthcare Center')]")).click();
        }
        else if (facility == "hongkong"){
            driver.findElement(By.xpath("Xpath=//*[contains(text(),'Hongkong CURA Healthcare Center')]")).click();
        }
        else if (facility == "seol"){
            driver.findElement(By.xpath("Xpath=//*[contains(text(),'Seoul CURA Healthcare Center')]")).click();
        }
    }

    public void selectReadmission(){
        driver.findElement(By.id("chk_hospotal_readmission")).click();
    }

    public void chooseHealthCareProgram(String HCProgram){
        if (HCProgram == "medicare"){
            driver.findElement(By.id("radio_program_medicare")).click();
        }
        else if (HCProgram == "medicaid"){
            driver.findElement(By.id("radio_program_medicaid")).click();
        }
        else if (HCProgram == "none"){
            driver.findElement(By.id("radio_program_none")).click();
        }
    }

    public void enterVisitDate(String date){
        driver.findElement(By.id("txt_visit_date")).sendKeys(date);
    }

    public void writeComment(String comment){
        driver.findElement(By.id("txt_comment")).sendKeys(comment);
    }

    public void enterBookAppointmentButton(){
        driver.findElement(By.id("btn-book-appointment")).click();
    }
}
