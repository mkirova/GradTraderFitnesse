# Grad Trader Fitness


Introduction
============
Proof of concept for fitness tests running against the GradTrader app

This builds a jar to be included in a fitnesse wiki.
Maven project.
Fitnesse fixtures.
Webdriver for browser automation.


java -jar fitnesse-standalone.jar -p 8070

Install
=======
 mvn clean install

Download chrome driver:

https://sites.google.com/a/chromium.org/chromedriver/downloads

As per
https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver ensure:
* The chromedriver binary is in the system path, or
* The Selenium Server was started with -Dwebdriver.chrome.driver=c:\path\to\your\chromedriver.exe

