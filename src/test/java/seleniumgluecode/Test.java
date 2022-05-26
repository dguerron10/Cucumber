package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test extends TestBase{



    @Given("^El usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace clic sobre el boton$")
    public void hace_clic_sobre_el_boton() throws Throwable {
        //WebElement titleComicsLocator = driver.findElement(homePage.getTitleComicsLocator());
        //titleComicsLocator.click();
        homePage.clicOnTitleComics();
    }

    @Then("^se debe redirigir a la pagina de comics$")
    public void se_debe_redirigir_a_la_pagina_de_comics() throws Throwable {
        //WebElement pageTitleLocator = driver.findElement(comicsPage.getPageTitleLocator());
        //Assert.assertTrue("Error de redireccionamiento",pageTitleLocator.isDisplayed());
        //Assert.assertEquals(comicsPage.getTitlePage(),pageTitleLocator.getText());
        Assert.assertTrue("Error de redireccionamiento a pagina de comics",comicsPage.isTitleComicsDisplayed());
    }

}
