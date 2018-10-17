package com.scottlogic.gradtrader.poa;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObject {
    private static final int DELAY_SECONDS = 2;

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    public PageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, DELAY_SECONDS);
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

    protected void clickWhenAvailable(By by) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.click();
    }

    public boolean hasElementCountIncreasedBy(int originalCount, int increasedBy, By by) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(by, originalCount + increasedBy));
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }
}
