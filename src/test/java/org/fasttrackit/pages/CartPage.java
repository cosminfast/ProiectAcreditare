package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends PageObject {

    @FindBy(className = "remove")
    private List<WebElementFacade> removeButtons;

    public void removeProductsFromCart(){
        for (int i = 0; i< removeButtons.size(); i++){
            System.out.println("Got here 1");
            removeButtons.get(i).click();
            System.out.println("Got here 2");
            waitABit(3000);
        }
    }
}
