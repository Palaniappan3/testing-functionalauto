package com.practice.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import io.magentys.cinnamon.webdriver.support.FindByKey;
import org.openqa.selenium.support.FindBy;
import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.*;

public class LandingPage {

    // You can lookup locators using a key that is specified within an external locator.yml file
    @FindByKey("landing-page.main-menu")
    public PageElement mainMenuByKey;

    // You can also use the standard webdriver annotations for finding an element
    @FindBy(id = "mainMenuId") //TODO Replace with a valid id
    public PageElement mainMenu;
    
    
    
    @FindBy(css = "span.nav-logo-base.nav-sprite")
    public PageElement amazonIcon;
    
    @FindBy(id = "twotabsearchtextbox")
    public PageElement amazonSearchBox;
    
    @FindBy(css = "input[value='Go']")
    public PageElement searchButton;
    
    
    public void enterSearchDetails(String arg1)
    {
    	amazonSearchBox.waitUntil(displayed).sendKeys(arg1);
    }
    
    public void clickSearchButton()
    {
    	searchButton.waitUntil(displayed).click();
    }
}