package pages;

import hooks.Base;
import org.openqa.selenium.By;

public class UniversalCreditPage extends Base {

    public void ClickOptionYesOrNoUniversalCredit(String option){
        if (option.equalsIgnoreCase("yes"))
            CurrentDriver().findElement(By.id("yes-universal")).click();
        else if(option.equalsIgnoreCase("not yet"))
            CurrentDriver().findElement(By.id("not-yet")).click();
        else
            CurrentDriver().findElement(By.id("different-benefit")).click();
    }

    public void ClickNext(){
        CurrentDriver().findElement(By.id("next-button")).click();
    }
}
