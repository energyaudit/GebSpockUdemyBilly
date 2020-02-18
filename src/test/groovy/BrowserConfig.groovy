
import spock.lang.Specification
import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())


class LegalSpec extends Specification {

    def "we are able to fetch the legal information about greach"() {

        when:
        System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
        def browser=new Browser(driver:new ChromeDriver())
        browser.go 'http://2017.greachconf.com'

        then:
        browser.page.find('footer div.credits').text() == 'The Greach Network SL, 2011-2017 - CIF B86412491 - C/Valtravieso, 28023 Madrid (Spain)'
    }
}