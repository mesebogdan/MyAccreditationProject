package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.lang.reflect.Field;

public class CheckoutSteps extends BaseSteps{
    @Step
    public void clickCartButton(){
        homePage.clickCartButton();
    }

    @Step
    public void clickCheckoutButton(){
        cartPage.clickCheckoutButton();
    }
    @Step
    public void clickPlaceOrderButton(){
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void verifyIfOrderIsSent(){
        Assert.assertEquals("Thank you. Your order has been received.", checkoutPage.getWelcomeText2());
    }
    @Step
    public void setName(String myName){
        checkoutPage.setNameField(myName);
    }
    @Step
    public void setLastName(String myLastName){
        checkoutPage.setLastnameField(myLastName);
    }
    @Step
    public void clickDropdownCountryList(){
        checkoutPage.clickDropdownCountryList();
    }
    @Step
    public void clickRomania(){
        checkoutPage.clickRomania();
    }
    @Step
    public void setStreetAddressField(String myStreet){
        checkoutPage.setStreetAddressField(myStreet);
    }
    @Step
    public void setCityField(String myCity){
        checkoutPage.setCityField(myCity);
    }
    @Step
    public void setPostcodeField(String myPostcode){
        checkoutPage.setPostcodeField(myPostcode);
    }
    @Step
    public void setPhoneField(String myPhone){
        checkoutPage.setPhoneField(myPhone);
    }
    @Step
    public void setEmailField(String myEmail){
        checkoutPage.setEmailField(myEmail);
    }
    @Step
    public void verifyOrderIsNotSent() {
        Assert.assertEquals("Billing Phone is not a valid phone number.", checkoutPage.getPhoneAlertMessage());
    }
}
