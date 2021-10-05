package com.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @apiNote Examples of web page using phptravels.net demo
 */
public class SupplierLoginPage extends WebBasePage{
    private static By emailInput = By.name("email");
    private static By passwordInput = By.name("password");
    private static By loginButton = By.className("btn");

    public SupplierLoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void insertEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }

    public void insertPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void login(){
        driver.findElement(loginButton).click();
    }
}
