import spock.lang.Specification
import spock.lang.*

//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())


class Math2 extends Specification {

    //@shared use same object to share
    @Shared def obj=new SumOfTwoNumber()
    def "Featuer method one"()
    {
        given:
        obj
    }
    def "Featuer method two"()
    {
        given:
        obj
    }
}