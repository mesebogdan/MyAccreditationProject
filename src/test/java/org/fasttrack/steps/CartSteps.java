package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        productPage.clickAddToCart();
    }

    @Step
    public void checkSuccessMessage(){
        productPage.getWelcomeAddToCartText();
    }

    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }
    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }
    @Step
    public void removeProductFromCart(){
        cartPage.clickRemoveButton();
    }
    @Step
    public void checkRemoveMessage(){
        cartPage.getRemovedMessage();
    }
    @Step
    public void undoItemAfterRemoved(){
        cartPage.clickUndoButton();
    }
    @Step
    public void setFirstItemQuantity(String quantity){
        cartPage.setRemoveFirstItem(quantity);
    }
    @Step
    public void clickUpdateButton(){
        cartPage.clickUpdateButton();
    }
    @Step
    public void checkUpdateMessage(){
        Assert.assertEquals("Cart updated.", cartPage.getUpdateCartMessage());
    }


}
