package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ProductGridPage;
import org.junit.Assert;

public class CartSteps {

    private HomePage homePage;
    private ProductGridPage productGridPage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void goToAllProducts(){
        homePage.clickOnAllProducts();
    }

    @Step
    public void clickOnProduct(){
        productGridPage.clickFirstProduct();
    }

    @Step
    public void addProductToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkAddedToCart(){
        Assert.assertTrue(productPage.isAddedToCart());
    }

    @Step
    public void goToCart(){
        homePage.clickCart();
    }

    @Step
    public void emptyCart(){
        cartPage.removeProductsFromCart();
    }
}
