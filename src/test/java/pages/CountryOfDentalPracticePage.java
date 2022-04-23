package pages;

import hooks.Base;
import org.openqa.selenium.By;

public class CountryOfDentalPracticePage extends Base {

    public void ClickOptionRegion(String option){
        if (option.equalsIgnoreCase("england"))
            CurrentDriver().findElement(By.id("radio-england")).click();
        else if (option.equalsIgnoreCase("scotland"))
            CurrentDriver().findElement(By.id("radio-scotland")).click();
        else if (option.equalsIgnoreCase("wales"))
            CurrentDriver().findElement(By.id("radio-wales")).click();
        else if (option.equalsIgnoreCase("northern ireland"))
            CurrentDriver().findElement(By.id("radio-ni")).click();
        else
            CurrentDriver().findElement(By.id("radio-not-registered")).click();
    }

    public void ClickNext(){
        CurrentDriver().findElement(By.id("next-button")).click();
    }
}
