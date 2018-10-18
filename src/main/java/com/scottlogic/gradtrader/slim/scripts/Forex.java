package com.scottlogic.gradtrader.slim.scripts;

import com.scottlogic.gradtrader.poa.client.ForexElement;
import com.scottlogic.gradtrader.util.StaticWebDriver;

public class Forex {
    private String from;
    private String to;

    private ForexElement forexElement;

    public Forex(String from, String to) {
        this.from = from;
        this.to = to;
        this.forexElement = new ForexElement(StaticWebDriver.get(), from +  to);
    }

    public String from() {
        return from;
    }

    public String to() {
        return to;
    }

    public String status() {
        return "Sell failure";
    }

    public boolean inputVisible(String inputName) {
        return forexElement.inputVisible(inputName);
    }

    public boolean buttonVisible(String buttonName) {
        return forexElement.buttonVisible(buttonName);
    }

    public void enterOrderValue(String orderValue) {
        forexElement.enterOrderValue(orderValue);
    }

    public void click(String name) {
        forexElement.click(name);
    }

}
