package com.scottlogic.gradtrader.poa.client;

import com.scottlogic.gradtrader.poa.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForexElement extends PageObject {

  private String rootElementXpath;

  public ForexElement(WebDriver driver, String rootAttributeId) {
    super(driver);
    this.rootElementXpath = "//div[@data-tile-id-" + rootAttributeId.toLowerCase() + "]";
  }

  public boolean buttonVisible(String buttonName) {
    return isVisible(constructButtonXpath(buttonName));
  }

  // TODO: do we need a better convention for identifying inputs?
  public boolean inputVisible(String inputName) {
    return inputName.equals("order") && isVisible(constructOrderInputXpath());
  }

  public void enterOrderValue(String value) {
    setText(constructOrderInputXpath(), value);
  }

  public void click(String name) {
    clickWhenAvailable(constructButtonXpath(name));
  }

  private By constructButtonXpath(String buttonName) {
    return By.xpath(rootElementXpath + "//button[text()='" + buttonName + "']");
  }

  private By constructOrderInputXpath() {
    return By.xpath(rootElementXpath + "//input" + constructXpathClassCheck("tile-pair-quantity-value"));
  }

  private String constructXpathClassCheck(String className) {
    return "[contains(concat(' ',normalize-space(@class),' '),' " + className + " ')]";
  }
}
