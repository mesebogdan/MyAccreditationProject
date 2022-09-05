package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade welcomeAddToCartText;




    public void clickAddToCart(){
        clickOn(addToCartButton);
    }
    public String getWelcomeAddToCartText(){
        return welcomeAddToCartText.getText();
    }
}
