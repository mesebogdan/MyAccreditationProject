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
        cartSteps.checkSuccessMessage("new hoodie");
        //cum identific doar textul cu selector
    }
}
