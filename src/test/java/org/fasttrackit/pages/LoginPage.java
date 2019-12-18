package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

@DefaultUrl("")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(css = "button[name='login']")
    private WebElementFacade loginButton;


    public void setEmailField(String email){
        waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPassField(String pass){
        emailField.sendKeys(Keys.TAB);
        typeInto(passField, pass);
    }

    public void clickLogin(){
        clickOn(loginButton);
    }


}
