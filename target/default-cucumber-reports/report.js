$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/googleArama.feature");
formatter.feature({
  "name": "Google Arama",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Nl01_Kullanici googleda arama yapar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@googleArama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici google sayfasina gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleArama.kullanici_google_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici guvenlik duvarini gecer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleArama.kullanici_guvenlik_duvarini_gecer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici infotech aramasini yapar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleArama.kullanici_infotech_aramasini_yapar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici sayfa basligini kontrol eder",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleArama.kullanici_sayfa_basligini_kontrol_eder()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: failed to change window state to \u0027normal\u0027, current state is \u0027maximized\u0027\n  (Session info: chrome\u003d102.0.5005.115)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-QQ0UKPU\u0027, ip: \u0027192.168.2.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_333\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.115, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\Guest\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54325}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e64540b3d81cae300423feb33aa43117\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat utilities.Driver.getDriver(Driver.java:47)\r\n\tat stepdefinitions.GoogleArama.kullanici_sayfa_basligini_kontrol_eder(GoogleArama.java:36)\r\n\tat ✽.kullanici sayfa basligini kontrol eder(file:///C:/Users/Guest/workspace/infoTechCucumber22/src/test/resources/features/googleArama.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});