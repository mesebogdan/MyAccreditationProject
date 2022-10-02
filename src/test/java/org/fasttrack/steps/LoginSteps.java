package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();
    }

    @Step
    public void setUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals(userName, accountPage.getWelcomeText());
    }

    @Step
    public void verifyUserNotLoggedIn(String possibleUserName){
        Assert.assertEquals("ERROR: The password you entered for the email address " + possibleUserName + " is incorrect. Lost your password?",loginPage.getErrorMessage());
    }
    @Step
    public void verifyLoginWithInvalidEmail(){
        Assert.assertEquals("ERROR: Invalid email address. Lost your password?", loginPage.getEmailErrorMessage());
    }

    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        setUserEmail(email);
        setPassword(pass);
        clickLogin();
    }
}
