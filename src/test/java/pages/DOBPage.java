package pages;

import hooks.Base;
import org.openqa.selenium.By;

public class DOBPage extends Base {

    public void EnterDOB(String day, String month, String year){
        CurrentDriver().findElement(By.id("dob-day")).sendKeys(day);
        CurrentDriver().findElement(By.id("dob-month")).sendKeys(month);
        CurrentDriver().findElement(By.id("dob-year")).sendKeys(year);
    }

    public void ClickNext(){
        CurrentDriver().findElement(By.id("next-button")).click();
    }
}
