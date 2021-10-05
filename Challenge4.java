package com.challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Challenge4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.mx/");
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'pantallas')]"));
        System.out.println("Existen " + elements.size() + " con el texto pantallas");
        driver.close();
    }
}
