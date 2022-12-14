package org.fasttrack.features;


import org.fasttrack.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void loginAndSearchForProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");

    }

    @Test
    public void loginAndSearchForSecondProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
        searchSteps.findProductWithNameInListAndOpen("T-SHIRT WITH LOGO");

    }
    @Test
    public void searchForProductWithoutLogin(){
        searchSteps.searchForKeyword("hoodie");
        searchSteps.findProductWithNameInListAndOpen("new hoodie");


    }
}
