package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade welcomeAddToCartText;
    @FindBy(css = ".star-5")
    private WebElementFacade fiveStarReview;
    @FindBy(id = "comment")
    private WebElementFacade commentField;
    @FindBy(css = ".submit")
    private WebElementFacade submitButton;
    @FindBy(css = ".woocommerce-review__awaiting-approval")
    private WebElementFacade succesSentReview;
    @FindBy(id = "author")
    private WebElementFacade reviewNameRequestField;
    @FindBy(id = "email")
    private WebElementFacade reviewEmailRequestField;




    public void clickAddToCart(){
        clickOn(addToCartButton);
    }
    public void getWelcomeAddToCartText(){
        element(welcomeAddToCartText).shouldContainText("has been added to your cart.");
    }
    public void clickFiveStarReview(){
        clickOn(fiveStarReview);
    }
    public void setCommentField(String comment){
        typeInto(commentField, comment);
    }
    public void clickSubmitButton(){
        clickOn(submitButton);
    }
    public String getSuccesSentReview(){
        return succesSentReview.getText();
    }
    public void setReviewNameRequestField(String myName){
        typeInto(reviewNameRequestField, myName);
    }
    public void setReviewEmailRequestField(String myEmail){
        typeInto(reviewEmailRequestField, myEmail);
    }

}
