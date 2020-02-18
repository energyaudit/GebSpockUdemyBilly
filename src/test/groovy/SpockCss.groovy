import spock.lang.Specification

import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())
def browser=new Browser(driver:new ChromeDriver())
browser.go("https://www.google.ca/")

browser.$("input[name='q']").isDisplayed()
browser.$("input[name='q']").value("gradle")
//browser.$("input[name='q']").value"Beginner"
browser.$("input[name='q']") <<" Tutorial"
