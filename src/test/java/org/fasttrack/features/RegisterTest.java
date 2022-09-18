package org.fasttrack.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithRandomUser(){
        String randomEmail= RandomStringUtils.randomAlphabetic(8);
        String randomPass = RandomStringUtils.randomAlphanumeric(12);

        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail(randomEmail+"@yahoo.com");
        registerSteps.setPass(randomPass);
        registerSteps.clickRegisterButton();
        registerSteps.verifySuccesfulRegisterMessage();

    }

    @Test
    public void registerWithExistingAccount() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail(Constants.USER_EMAIL);
        registerSteps.setPass(Constants.USER_PASS);
        registerSteps.clickRegisterButton();
        registerSteps.verifyRegisterWithExistingUser();
    }

}
