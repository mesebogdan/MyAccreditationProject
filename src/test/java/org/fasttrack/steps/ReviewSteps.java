package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

public class ReviewSteps extends BaseSteps{
    @Step

    public void clickFiveStarReview(){
        productPage.clickFiveStarReview();
    }
    @Step
    public void setCommentField(String commentField){
        productPage.setCommentField(commentField);
    }
    @Step
    public void clickSubmitButton(){
        productPage.clickSubmitButton();
    }
    @Step
    public void verifyReviewIsSent(){
        Assert.assertEquals("Your review is awaiting approval", productPage.getSuccessSentReview());
    }

    @Step
    public void setReviewNameRequestField(String myName){
        productPage.setReviewNameRequestField(myName);
    }
    @Step
    public void setReviewEmailRequestField(String myEmail){
        productPage.setReviewEmailRequestField(myEmail);
    }

}
