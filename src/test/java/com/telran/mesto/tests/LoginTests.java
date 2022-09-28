package com.telran.mesto.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


    @Test
    public void loginUserPositiveTest() {

        app.getUser().login();
        Assert.assertTrue(app.getUser().isLogOutPresent());
        System.out.println(app.getUser().isAuthFormPresent());
    }

}