package com.telran.mesto.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isElementPresent(By.xpath("//a[contains(.,'Register')]"))) {
            app.getUser().clickOnSingOutButton();
        }
    }

    @Test
    public void registrationPositiveTest(){
        app.getUser().registration();
        Assert.assertTrue(app.getUser().isLogInPresent());
    }


}
