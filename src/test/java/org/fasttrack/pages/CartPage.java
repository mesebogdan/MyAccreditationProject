package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElementFacade successMessage;

    @FindBy(css = "tbody .product-subtotal")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".cart-subtotal .amount")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = ".shipping .amount")
    private WebElementFacade shippingTax;

    @FindBy(css = ".order-total .amount")
    private WebElementFacade totalCartPrice;
    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;

    public String getSuccessMessage(){
        return successMessage.getText();
    }
    public int getProductsSubtotal(){
        int sum = 0;
        for(WebElementFacade elementFacade:subtotalProductsList){
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }
    public boolean checkIfSubtotalMatches(){
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }
    public boolean checkIfTotalPriceMatches(){
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(shippingTax.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }
    public void clickCheckoutButton(){
        clickOn(checkoutButton);
    }


}
