import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Specification

//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())


class Math1 extends Specification {

    def "Math Teaching "() {

       expect:
       Math.max(2,3)==4
    }
}