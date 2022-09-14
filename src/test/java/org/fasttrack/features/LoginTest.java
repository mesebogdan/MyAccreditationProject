package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

import java.lang.invoke.ConstantCallSite;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("mesebogdan");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("mesebogdan@yahoo.com");
        loginSteps.setPassword("wrongpass");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn("mesebogdan@yahoo.com");
    }


}
