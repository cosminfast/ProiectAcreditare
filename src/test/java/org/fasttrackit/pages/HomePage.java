package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.testfasttrackit.info/OnlineLibrary/")
public class HomePage extends PageObject {


    @FindBy(className = "account_login_link")
    private WebElementFacade loginLink;

    @FindBy(className = "shopping_cart_link")
    private WebElementFacade shoppingCartLink;

   @FindBy(css = "#menu-about-us-2 .menu-item-5451 a[href*='/shop/']")
    private WebElementFacade allProductsLink;

    public void clickOnLoginLink() {
        clickOn(loginLink);
    }

    public void clickOnAllProducts(){
        clickOn(allProductsLink);
    }

    public void clickCart(){
        clickOn(shoppingCartLink);
    }
}
