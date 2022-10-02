package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage{
    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passField;

    @FindBy(css = "[name='register']")
    private WebElementFacade registerButton;

    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorRegisterMessage;
    @FindBy(css = ".woocommerce-MyAccount-content [href*='logout']")
    private WebElementFacade successfulRegister;


    public void setEmailField(String value){
        typeInto(emailField, value);
    }
    public void setPassField(String value){
        typeInto(passField, value);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }
    public String getErrorRegisterMessage(){
        return errorRegisterMessage.getText();
    }
    public String getSuccessfulRegister(){
        return successfulRegister.getText();
    }
}
