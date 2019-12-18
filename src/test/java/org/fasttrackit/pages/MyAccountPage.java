package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content p:first-child")
    private WebElementFacade helloParagraph;

    public boolean checkLoggedIn(String text){
        return helloParagraph.containsOnlyText("Hello "+text+" (not "+text+"? Log out)");
    }
}
