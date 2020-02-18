import spock.lang.Specification

import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
//System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
def browser=new Browser(driver:new FirefoxDriver())
browser.go("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file")
browser.$("input[name='myFile']")[1].click()


