package com.telran.mesto.fw;

import com.telran.mesto.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void registration() {
        clickOnSingUpButton();
        Assert.assertTrue(isElementPresent(By.cssSelector(".header__link_visible")));
        fillRegistrationForm(new User().setEmail("rsd@mail.ru").setPassword("rsd12345"));
        ClickOnRegisterButton();
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPassword());
    }

    public boolean isComponentFormPresent() {
        return driver.findElements(By.cssSelector(".auth__form")).size()>0;

    }

    public void clickOnSingOutButton() {
        click(By.xpath("//button[contains(.,'sign-up')]"));
    }

    public boolean isAuthFormPresent() {
        return isElementPresent(By.cssSelector(".auth__form"));
    }

    public boolean isLogOutPresent() {
        return isElementPresent(By.xpath("//button[contains(text(),'Log out')]"));
    }
    public void login() {
        fillRegistrationForm(new User().setEmail("rsd@mail.ru").setPassword("rsd12345"));
        clickLogInButtun();
    }
    public boolean isLogInPresent() {
        return isElementPresent(By.xpath("//button[contains(text(),'Log in')]"));
    }
}
