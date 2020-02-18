import spock.lang.Shared
import spock.lang.Specification

//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())


class FeatureMthd extends Specification {


    def "add two number"()
    {
        given:
       def obj=new SumOfTwoNumber()
        when:" call adder method"
        def sum=obj.adder(2,3)
        then:
        sum==5

    }

}