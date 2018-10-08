package com.scottlogic.gradtrader.poa.client;

import com.scottlogic.gradtrader.poa.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderElement extends PageObject {
    public static final By Title = By.cssSelector(".header-title");
    public static final By Username = By.cssSelector(".header-account-username");

    public HeaderElement(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getText(Title);
    }

    public String getUsername() {
        return getText(Username);
    }
}
