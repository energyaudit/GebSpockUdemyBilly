import spock.lang.Specification

import static java.lang.Math.*

//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())


class FeatureMthdWTHExpB extends Specification {


    def "add two number"()
    {
        setup:
        def a=5
        def b=6
       def obj=new SumOfTwoNumber()
        when:" call adder method"
        def sum=obj.adder(a,b)
        then:
        sum==11

        when:
        def list=[]
        list.add(3)
        list.add(4)

        println list.get(5)
        then:
        thrown(IndexOutOfBoundsException)
        println "Thrown the exception"
        list.size()==2

        expect:
        Math.max(2,3)==3

        cleanup:
        println "I have done the clean:clear the objects created"


    }

}