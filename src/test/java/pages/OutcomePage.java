package pages;

import hooks.Base;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;

public class OutcomePage extends Base {
    public void ResultContent(String expectedResult){

        String pageContent = CurrentDriver().findElement(By.id("content")).getText();
        System.out.println(pageContent);

        if (pageContent.contains(expectedResult))
            Asserts.check(true, expectedResult);

    }
}
