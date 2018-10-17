package com.scottlogic.gradtrader.poa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    protected Integer countElements(By by) { return driver.findElements(by).size(); }

    protected boolean isVisible(By by) { return driver.findElement(by).isDisplayed(); }

    protected void setText(By by, String text) {
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(text);
    }

    protected void click(By by) {
        driver.findElement(by).click();
    }
}
