import spock.lang.Specification

//import geb.Browser
//import org.openqa.selenium.firefox.FirefoxDriver
//def browser=new Browser(driver:new FirefoxDriver())
//browser.go("https://sandbox-beta.airmiles.ca/")
//
class SampleTest1 extends Specification {


    def "this is my business need" () {
        when:
        Map map = new HashMap();

        then:
        map.size() == 0
    }
}

