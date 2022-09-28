package com.telran.mesto.tests;

import com.telran.mesto.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown () {
        app.stop();
    }

}
