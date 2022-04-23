package pages;

import hooks.Base;
import org.openqa.selenium.By;

public class TaxPage extends Base {

    public void ClickOptionYesOrNo(String option){
        if (option.equalsIgnoreCase("yes"))
            CurrentDriver().findElement(By.id("radio-yes")).click();
        else
            CurrentDriver().findElement(By.id("radio-no")).click();
    }

    public void ClickNext(){
        CurrentDriver().findElement(By.id("next-button")).click();
    }
}
