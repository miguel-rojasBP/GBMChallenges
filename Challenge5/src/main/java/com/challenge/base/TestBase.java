package com.challenge.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * @apiNote Test Base. Here you can start Selenium driver and connect to Selenium driver
 */
public class TestBase {
    private static Logger logger = LogManager.getLogger(TestBase.class);
    protected static WebDriver webDriver;

    /**
     * This method start Selenium driver and connect to Selenium driver
     *
     * @param browser           browser used in test (Chrome, Firefox, Edge)
     * @param url               browser URL
     */
    @BeforeClass
    @Parameters({"browser", "url"})
    public static void initDrivers(String browser, String url) {
        logger.trace("SELENIUM DRIVER STARTED");
        initWebDriver(browser);
        webDriver.get(url);
        logger.trace("URL " + url +" OPENED");
    }

    /**
     *  This method start Selenium driver
     * @param browser browser used in test (Chrome, Firefox, Edge)
     */
    public static void initWebDriver(String browser){
        switch(browser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;
            default:
                logger.error("Browser doesn't exist");
                System.exit(-1);
        }
    }

    /**
     * This method close Appium and Selenium drivers
     */
    @AfterClass
    public void tearDown() {
        logger.trace("SELENIUM DRIVER STOPPED");
        webDriver.quit();
    }
}
