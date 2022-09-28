package com.telran.mesto.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class HelperBase {

    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;

    }

    public boolean isElementPresent2(By by) {
        try{
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException exception){
            return false;
        }
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        driver.findElement(locator).click();

    }

    public void clickLogInButtun() {
        click(By.xpath("//button[contains(.,'Log in')]"));
    }

    public void ClickOnRegisterButton() {
        click(By.xpath("//button[contains(.,'Register')]"));
    }

    public void clickOnSingUpButton() {
        click(By.xpath("//*[@href='/sign-up']"));
    }
}
