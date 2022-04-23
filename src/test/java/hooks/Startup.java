package hooks;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Startup extends Base{
    private WebDriver driver;

    public void InitialiseTest(String browserType){
        String url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }


        driver.get(url);
        driver.manage().window().maximize();
        DriverContext.setLocalWebDriverThreadLocal(driver);
    }

    @After
    public void Dispose(){
        CurrentDriver().quit();
    }
}
