package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

public class RegisterSteps extends BaseSteps{
    @Step
    public void navigateToRegisterPage() {
        homePage.clickAccountLink();
    }
    @Step
    public void setEmail(String email){
        registerPage.setEmailField(email);
    }
    @Step
    public void setPass(String pass){
        registerPage.setPassField(pass);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void verifyRegisterWithExistingUser(){
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", registerPage.getErrorRegisterMessage());
    }



}
