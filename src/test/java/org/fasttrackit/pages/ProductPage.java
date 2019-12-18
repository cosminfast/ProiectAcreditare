package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(className = "single_add_to_cart_button")
    private WebElementFacade addToCartButton;

    @FindBy(className = "woocommerce-message")
    private WebElementFacade confirmMessage;


    private String text = "has been added to your cart";

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public boolean isAddedToCart(){
        return confirmMessage.containsText(text);
    }
}
