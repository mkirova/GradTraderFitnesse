package com.scottlogic.gradtrader.slim.scripts;

import com.scottlogic.gradtrader.poa.client.HeaderElement;
import com.scottlogic.gradtrader.util.StaticWebDriver;

public class Header {

    private HeaderElement element;

    public Header() {
        this.element = new HeaderElement(StaticWebDriver.get());
    }
    public String title() {
        return element.getTitle();
    }

    public String userName() {
        return element.getUsername();
    }
}
