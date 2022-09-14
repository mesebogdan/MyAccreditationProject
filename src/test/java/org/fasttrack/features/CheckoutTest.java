package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("T-SHIRT WITH LOGO");
        cartSteps.addProductToCart();
        checkoutSteps.clickCartButton();
        checkoutSteps.clickCheckoutButton();
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.verifyIfOrderIsSent();
    }
    @Test
    public void validCheckoutTestWithoutLogin(){
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("T-SHIRT WITH LOGO");
        cartSteps.addProductToCart();
        checkoutSteps.clickCartButton();
        checkoutSteps.clickCheckoutButton();
        checkoutSteps.setName("Mesesan");
        checkoutSteps.setLastName("Bogdan");
        checkoutSteps.setStreetAddressField("Transilvaniei");
        checkoutSteps.setCityField("Cluj");
        checkoutSteps.setPostcodeField("407055");
        checkoutSteps.setPhoneField("0744558855");
        checkoutSteps.setEmailField("mese@yahoo.com");
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.verifyIfOrderIsSent();
    }
    @Test
    public void CheckoutTestWithoutLoginWithInvalidPhoneNumber(){
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("T-SHIRT WITH LOGO");
        cartSteps.addProductToCart();
        checkoutSteps.clickCartButton();
        checkoutSteps.clickCheckoutButton();
        checkoutSteps.setName("Mesesan");
        checkoutSteps.setLastName("Bogdan");
        checkoutSteps.setStreetAddressField("Transilvaniei");
        checkoutSteps.setCityField("Cluj");
        checkoutSteps.setPostcodeField("407055");
        checkoutSteps.setPhoneField("0744558855bb");
        checkoutSteps.setEmailField("mese@yahoo.com");
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.verifyOrderIsNotSent();

    }
}
