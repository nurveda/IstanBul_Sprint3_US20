$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_25.feature");
formatter.feature({
  "name": "Configure Menu",
  "description": "  Agile Story: As a user, I should be able to configure menu;\n  so that I can edit the menu options for quick access to custom menu",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"HR\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.crmly.step_definitions.PreConditionStepDefs.the_user_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should add custom menu -AC1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us25"
    }
  ]
});
formatter.step({
  "name": "the user clicks configure menu option",
  "keyword": "When "
});
formatter.match({
  "location": "com.crmly.step_definitions.US25_CustomMenuStepDefs.the_user_clicks_configure_menu_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user hits \"Add custom menu item\" option from the menu pop up",
  "keyword": "And "
});
formatter.match({
  "location": "com.crmly.step_definitions.US25_CustomMenuStepDefs.the_user_hits_option_from_the_menu_pop_up(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds custom menu as \"Google\" to redirect \"google.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.crmly.step_definitions.US25_CustomMenuStepDefs.user_adds_custom_menu_as_to_redirect(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hit the \"Add\" button on the add custom menu window",
  "keyword": "Then "
});
formatter.match({
  "location": "com.crmly.step_definitions.US25_CustomMenuStepDefs.hit_the_button_on_the_add_custom_menu_window(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Google\" custom menu is displayed on the menu items",
  "keyword": "And "
});
formatter.match({
  "location": "com.crmly.step_definitions.US25_CustomMenuStepDefs.verify_custom_menu_is_displayed_on_the_menu_items(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[.\u003d\u0027Google\u0027]\"}\n  (Session info: chrome\u003d96.0.4664.45)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-VTV2UVS\u0027, ip: \u0027192.168.1.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.45, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\pc\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:55302}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 781b79032b30313501284c6a7830a948\n*** Element info: {Using\u003dxpath, value\u003d//span[.\u003d\u0027Google\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.crmly.step_definitions.US25_CustomMenuStepDefs.verify_custom_menu_is_displayed_on_the_menu_items(US25_CustomMenuStepDefs.java:115)\r\n\tat ✽.verify \"Google\" custom menu is displayed on the menu items(file:///C:/Users/pc/IdeaProjects/IstanBul_Sprint3_US20/src/test/resources/features/US_25.feature:37)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});