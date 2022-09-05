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
    //aici am ramas sa mai caut selectori, de aici in jos

    @FindBy(css = "tbody tr:last-child .a-right .price")
    private WebElementFacade taxPrice;

    @FindBy(css = "tfoot .price")
    private WebElementFacade totalCartPrice;

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
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }


}
