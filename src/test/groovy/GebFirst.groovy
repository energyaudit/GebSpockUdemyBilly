import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
System.setProperty("webdriver.gecko.driver", "../resources/geckodriver.exe");
def browser = new Browser(driver : new FirefoxDriver())

browser.go("http://udemy.com")
