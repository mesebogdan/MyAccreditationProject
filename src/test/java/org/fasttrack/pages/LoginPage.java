package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ClearContents;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElementFacade userField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = "[name='login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorMessageElement;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade emailErrorMessage;

    public void setEmailField(String value) {
        typeInto(userField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }

    public String getEmailErrorMessage(){
        return emailErrorMessage.getText();
    }

}
