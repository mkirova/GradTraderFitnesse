package com.scottlogic.gradtrader.poa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    protected final WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(By by) {
        return driver.findElement(by);
    }

    protected String getText(By by) {
        return find(by).getText();
    }
}
