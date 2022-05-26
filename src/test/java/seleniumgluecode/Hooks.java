package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;

    @Before
    public void setup()
    {
        //System.setProperty("webdriver.chrome.driver","./src/test/resources/101_0_4951_41/chromedriver.exe");
        //driver= new ChromeDriver();
        driverManager= DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver= driverManager.getDriver();
        driver.get("https://imalittletester.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driverManager.quitDriver();
    }

   public static WebDriver getDriver()
    {
       return driver;
    }

}
