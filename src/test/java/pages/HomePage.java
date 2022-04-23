package pages;

import hooks.Base;
import org.openqa.selenium.By;

public class HomePage extends Base {

    // CHeck what help you could get to pay for NHS costs
    public void ClickNext(){
        CurrentDriver().findElement(By.id("next-button")).click();
    }

}
