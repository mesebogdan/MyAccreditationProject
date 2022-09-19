package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage();
    }
    @Test
    public void addToCartWithoutLogin(){
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage();

    }
    @Test
    public void checkTotalAndSubtotalTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        cartSteps.addProductToCart();
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("T-SHIRT WITH LOGO");
        cartSteps.addProductToCart();
        checkoutSteps.clickCartButton();
        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }
    @Test
    public void removeItemFromCartTest(){
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        cartSteps.addProductToCart();
        checkoutSteps.clickCartButton();
        cartSteps.removeProductFromCart();
        cartSteps.checkRemoveMessage();
    }
    @Test
    public void removeItemFromCartThenUndoThenCheckTotalTest() {
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        cartSteps.addProductToCart();
        checkoutSteps.clickCartButton();
        cartSteps.removeProductFromCart();
        cartSteps.checkRemoveMessage();
        cartSteps.undoItemAfterRemoved();
        cartSteps.checkTotalPrice();

    }
    @Test
    public void addToCartThenChangeQuantityAndUpdateTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        cartSteps.addProductToCart();
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("T-SHIRT WITH LOGO");
        cartSteps.addProductToCart();
        checkoutSteps.clickCartButton();
        cartSteps.setFirstItemQuantity("7");
        cartSteps.clickUpdateButton();
        cartSteps.checkUpdateMessage();
        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }
}
