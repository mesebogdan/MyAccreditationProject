package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithExistingAccount() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setEmail(Constants.USER_EMAIL);
        registerSteps.setPass(Constants.USER_PASS);
        registerSteps.clickRegisterButton();
        registerSteps.verifyRegisterWithExistingUser();
    }
}
