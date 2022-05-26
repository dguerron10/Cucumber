package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPage extends BasePage{

    private String titlePage = "Category: comics";
    @FindBy(className = "page-title")
    private WebElement pageTitleLocator; //= By.className("page-title");

    public ComicsPage(WebDriver driver)
    {
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplay(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }
}
