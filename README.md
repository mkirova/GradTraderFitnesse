# Grad Trader Fitness

Overview
========
Introduction
------------
Proof of concept for fitnesse tests running against the GradTrader app.
It combines both ui tests running via webdriver and business logic tests running directly against the server code in a more junit like style.
(As the GradTrader app has no persistent data, there's no need for dedicated database mocking mechanism).

External Dependencies
---------------------
* Fitnesse
* ChromeDriver
* GradTrader (running for UI tests).

Internal Dependencies
---------------------
* Maven dependency management
* Fitnesse/Slim fixture architecture.
* Selenium/Webdriver for browser automation in UI tests.
* GradTrader (`testing-fitnesse` branch) system under test.

Running & Installing
====================
Cheatsheet
----------
* java -jar fitnesse-standalone.jar -p 8070

Fitnesse
--------
* download fitnesse jars
* import wiki - details to follow
* java -jar fitnesse-standalone.jar -p 8070

For fitnesse path settings, the following is used for a maven packaged application jar.
{{{ 
!define PROJECT_ROOT {C:\dev\git}
!define PROJECT {GradTraderFitnesse}
!define APP_ROOT {${PROJECT_ROOT}\${PROJECT}}

!define ARTIFACT_ID {grad-trader-fitnesse}
!define ARTIFACT_VERSION {1.0}
!define ARTIFACT_RELEASE {SNAPSHOT}
!define JAR_NAME {${ARTIFACT_ID}-${ARTIFACT_VERSION}-${ARTIFACT_RELEASE}.jar}

!define PROJECT_JAR {${APP_ROOT}\target\${JAR_NAME}}

!path ${PROJECT_JAR}
}}}

Business Logic Tests
--------------------
You will need to checkout the `testing-fitnesse` branch of GradTrader and install to the local repository.


UI Tests
--------

GradTrader
----------
See the grad trader app.
* Checkout `testing` branch.
* `mvn package` to write to the expected j


Install
=======
`mvn clean install`

ChromeDriver
------------
_Needed for WebDriver._

Download chrome driver:

https://sites.google.com/a/chromium.org/chromedriver/downloads

As per
https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver ensure:
* The chromedriver binary is in the system path, or
* The Selenium Server was started with -Dwebdriver.chrome.driver=c:\path\to\your\chromedriver.exe

TODO
====
* Wiki files under source control.
* Maven jar management to be tidied.
* Improve this README!