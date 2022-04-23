package hooks;

import org.openqa.selenium.WebDriver;

public class Base {
    public static WebDriver driver;

    public static WebDriver CurrentDriver() {
        driver = DriverContext.getLocalWebDriver();
        return driver;
    }
}
