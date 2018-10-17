package com.scottlogic.gradtrader.poa.client;

import com.scottlogic.gradtrader.poa.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlotterElement extends PageObject {

    public static final By LastTradeID = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(1)");
    public static final By LastTradeTime = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(2)");
    public static final By LastTradeDate = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(3)");
    public static final By LastTradeCurrency = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(4)");
    public static final By LastTradeDirection = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(5)");
    public static final By LastTradeQuantity = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(6)");
    public static final By LastTradeRate = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(7)");
    public static final By LastTradePortfolio = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(8)");
    public static final By LastTradeUser = By.cssSelector(".blotter-table-body .Grid__cell:nth-child(1) .FlexTable__rowColumn:nth-child(9)");
    public static final By TradeRow = By.cssSelector(".blotter-table-body .Grid__cell");


    public BlotterElement(WebDriver driver) {
        super(driver);
    }

    public int getTradeCount() {
        return this.driver.findElements(TradeRow).size();
    }

    public boolean hasTradeCount(int originalCount, int increasedBy) {
      return hasElementCountIncreasedBy(originalCount, increasedBy, TradeRow);
    }

    public String getLastTradeID() {
        return getText(LastTradeID);
    }

    public String getLastTradeTime() {
        return getText(LastTradeTime);
    }

    public String getLastTradeDate() {
        return getText(LastTradeDate);
    }

    public String getLastTradeCurrency() {
        return getText(LastTradeCurrency);
    }

    public String getLastTradeDirection() {
        return getText(LastTradeDirection);
    }

    public String getLastTradeQuantity() {
        return getText(LastTradeQuantity);
    }

    public String getLastTradeRate() {
        return getText(LastTradeRate);
    }

    public String getLastTradePortfolio() {
        return getText(LastTradePortfolio);
    }

    public String getLastTradeUser() {
        return getText(LastTradeUser);
    }

}
