package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends  DriverManager{
    @Override
    protected void createDriver() {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/101_0_4951_41/chromedriver.exe");
        driver= new ChromeDriver();
    }
}
