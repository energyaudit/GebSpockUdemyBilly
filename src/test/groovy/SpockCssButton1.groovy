import spock.lang.Specification

import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())
def browser=new Browser(driver:new ChromeDriver())
browser.go("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp")
try{
    browser.$("div.w3-col.s4 input")[1].click()
}
finally {
    browser.close()
}


