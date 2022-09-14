package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        productPage.clickAddToCart();
    }

    @Step
    public void checkSuccessMessage(String productName){
        Assert.assertEquals(("\"" + productName + "\"" + " has been added to your cart.").toLowerCase(), productPage.getWelcomeAddToCartText().toLowerCase());
    }

    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }
    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }

}
