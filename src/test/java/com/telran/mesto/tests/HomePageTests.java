package com.telran.mesto.tests;

import org.testng.annotations.Test;

public class HomePageTests  extends TestBase {

    @Test
    public void openHomePageTests(){
        System.out.println("Site opened!!!");
        app.getUser().isComponentFormPresent();
        System.out.println("Component Form:" + app.getUser().isComponentFormPresent());

        app.getUser().isAuthFormPresent();
        app.getUser().isComponentFormPresent();
    }

}
