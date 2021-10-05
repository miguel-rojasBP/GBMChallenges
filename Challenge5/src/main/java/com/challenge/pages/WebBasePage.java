package com.challenge.pages;

import org.openqa.selenium.WebDriver;

/**
 * @apiNote Contains Selenium Driver instance. All pages from mobile app must contain this page.
 * Here you can put methods that would be useful for all automation pages.
 */
public class WebBasePage {
    protected WebDriver driver;

    public WebBasePage(WebDriver driver) {
        this.driver = driver;
    }
}
