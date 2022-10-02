package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {


    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade welcomeText2;

    @FindBy(id = "billing_first_name")
    private WebElementFacade nameField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade lastnameField;
    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade dropdownCountryList;
    @FindBy(id = "select2-billing_country-result-b0wk-RO")
    private WebElementFacade selectRomania;

    @FindBy(id = "billing_address_1")
    private WebElementFacade streetAddressField;
    @FindBy(id = "billing_city")
    private WebElementFacade cityField;
    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeField;
    @FindBy(id = "billing_phone")
    private WebElementFacade phoneField;
    @FindBy(id = "billing_email")
    private WebElementFacade emailField;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorPhoneAlertMessage;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorEmailAlertMessage;

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }

    public String getWelcomeText2(){
        return welcomeText2.getText();
    }
    public void setNameField(String myName){
        typeInto(nameField, myName);
    }
    public void setLastnameField(String myLastName){
        typeInto(lastnameField, myLastName);
    }
    public void clickDropdownCountryList(){
        clickOn(dropdownCountryList);
    }
    public void clickRomania(){
        clickOn(selectRomania);
    }
    public void setStreetAddressField(String myStreet){
        typeInto(streetAddressField, myStreet);
    }

    public void setCityField(String myCity){
        typeInto(cityField, myCity);

    }
    public void setPostcodeField(String myPostcode){
        typeInto(postcodeField, myPostcode);
    }
    public void setPhoneField(String myPhone){
        typeInto(phoneField, myPhone);
    }
    public void setEmailField(String myEmail){
        typeInto(emailField, myEmail);
    }
    public String getPhoneAlertMessage(){
        return errorPhoneAlertMessage.getText();
    }
    public String getEmailAlertMessage(){
        return errorEmailAlertMessage.getText();
    }
}