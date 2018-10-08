package com.scottlogic.gradtrader.slim.scripts;

import com.scottlogic.gradtrader.util.StaticWebDriver;

// TODO Extend as chrome.
// Pass the chrome driver into the static web driver.
public class Navigate {
    public void url(String url) {
        StaticWebDriver.get().get(url);
    }

    public void close() {
        StaticWebDriver.get().close();
    }
}
