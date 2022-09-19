package org.fasttrack.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class ReviewTest extends BaseTest{
    String randomReview = RandomStringUtils.randomAlphanumeric(6);

    @Test
    public void reviewWithLoginTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        reviewSteps.clickFiveStarReview();
        reviewSteps.setCommentField("Un produs de calitate superioara" + randomReview);
        reviewSteps.clickSubmitButton();
        reviewSteps.verifyReviewIsSent();
    }
    @Test
    public void reviewWithoutLoginTest(){

        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");
        reviewSteps.clickFiveStarReview();
        reviewSteps.setCommentField("Am cumparat acest produs si il port zilnic. Merita cumparat" + randomReview);
        reviewSteps.setReviewNameRequestField("Mesesan Bogdan");
        reviewSteps.setReviewEmailRequestField("mesebogdan2@yahoo.com");
        reviewSteps.clickSubmitButton();
        reviewSteps.verifyReviewIsSent();

    }


}
