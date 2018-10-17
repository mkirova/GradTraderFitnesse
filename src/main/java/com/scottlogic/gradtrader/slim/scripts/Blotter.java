package com.scottlogic.gradtrader.slim.scripts;

import com.scottlogic.gradtrader.poa.client.BlotterElement;
import com.scottlogic.gradtrader.util.StaticWebDriver;

public class Blotter {

    private BlotterElement element;

    public Blotter() {
        this.element = new BlotterElement(StaticWebDriver.get());
    }

    public int numberOfTrades() {
        return element.getTradeCount();
    }

    public boolean hasNumberOfTradesIncreasedBy(int originalCount, int increasedBy) {
        return element.hasTradeCount(originalCount, increasedBy);
    }

  public String lastTradeID() {
        return element.getLastTradeID();
    }

    public String lastTradeTime() {
        return element.getLastTradeTime();
    }

    public String lastTradeDate() {
        return element.getLastTradeDate();
    }

    public String lastTradeCurrency() {
        return element.getLastTradeCurrency();
    }

    public String lastTradeDirection() {
        return element.getLastTradeDirection();
    }

    public String lastTradeQuantity() {
        return element.getLastTradeQuantity();
    }

    public String lastTradeRate() {
        return element.getLastTradeRate();
    }

    public String lastTradePortfolio() {
        return element.getLastTradePortfolio();
    }

    public String lastTradeUser() {
        return element.getLastTradeUser();
    }
}
