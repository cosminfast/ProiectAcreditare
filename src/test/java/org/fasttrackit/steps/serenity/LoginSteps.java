package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void goToLogin(){
        homePage.clickOnLoginLink();
    }

    @Step
    public void enterCredentials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPassField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step
    public void checkLoggedIn(String username){
        Assert.assertTrue(myAccountPage.checkLoggedIn(username));
    }

    @Step
    public void login(String user, String pass){
        navigateToHomepage();
        goToLogin();
        enterCredentials(user,pass);
        clickLogin();
        checkLoggedIn(user);
    }
}
