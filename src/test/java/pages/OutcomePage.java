package pages;

import hooks.Base;
import org.openqa.selenium.By;

public class OutcomePage extends Base {
    public String ResultContent(){
        return CurrentDriver().findElement(By.id("content")).getText();
    }
}
