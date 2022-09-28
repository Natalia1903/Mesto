package com.telran.mesto.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;

    UserHelper user;

    public UserHelper getUser() {
        return user;
    }

    public void init() {
        driver = new ChromeDriver();
        driver.get("https://mesto.om.nomoredomains.xyz");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        user = new UserHelper(driver);
    }

    public void stop() {
        driver.quit();
    }




}
