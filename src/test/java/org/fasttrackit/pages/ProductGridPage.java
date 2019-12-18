package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductGridPage extends PageObject {

    @FindBy(css = ".grid-holder div.span3:first-child img")
    private WebElementFacade firstProductImage;

    public void clickFirstProduct(){
        clickOn(firstProductImage);
    }
}
