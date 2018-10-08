package com.scottlogic.gradtrader.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebDriver {
    private static WebDriver driver = new ChromeDriver();
    static public WebDriver get() {
        return driver;
    }
}
