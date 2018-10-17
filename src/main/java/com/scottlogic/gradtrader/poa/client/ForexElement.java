package com.scottlogic.gradtrader.poa.client;

import com.scottlogic.gradtrader.poa.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForexElement extends PageObject {

  public static final By SellButton = By.cssSelector(".tile-pair-purchase-button");
  public static final By OrderInput = By.cssSelector(".tile-pair-quantity-value");
  public static final By ConfirmButton = By.cssSelector(".tile-confirmation-button");

  public ForexElement(WebDriver driver) {
    super(driver);
  }

  public boolean buttonVisible(String buttonName) {
    return buttonName.equals("SELL") ? isVisible(SellButton) : false;
  }

  public boolean inputVisible(String inputName) {
    return inputName.equals("order") ? isVisible(OrderInput) : false;
  }

  public void enterOrderValue(String value) {
    setText(OrderInput, value);
  }

  public void click(String name) {
    if (name.equals("SELL")) {
      clickWhenAvailable(SellButton);
    }
    if (name.equals("CONFIRM")) {
      clickWhenAvailable(ConfirmButton);
    }
  }

}
