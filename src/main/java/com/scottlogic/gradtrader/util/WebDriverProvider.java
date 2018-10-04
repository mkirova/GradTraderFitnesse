package com.scottlogic.gradtrader.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider {
    // TODO Move to resources
    private static String Protocol = "http";
    private static String Host = "localhost:80810";
    private static String Path = "com/scottlogic/gradtrader";

    private final String root;
    public WebDriverProvider() {
        this.root = String.format("%s://%s/%s", Protocol, Host, Path);
    }

    private WebDriver create() {
        return new ChromeDriver();
    }

    private WebDriver createAndGet(String fullpath) {
        WebDriver driver = create();
        driver.get(fullpath);
        return driver;
    }

    public WebDriver get() {
        return createAndGet(this.root);
    }

    public WebDriver get(String path) {
        StringBuilder buildPath = new StringBuilder(this.root);
        if (!path.isEmpty()) {
            buildPath.append("/");
            buildPath.append(path);
        }
        return createAndGet(buildPath.toString());
    }
}
