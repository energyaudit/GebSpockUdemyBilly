import spock.lang.Ignore
import spock.lang.IgnoreRest
import spock.lang.Issue
import spock.lang.Specification
import spock.lang.Timeout

class extensionExp  extends Specification{
    @Issue("http://usertory2")
    def "feature 1"(){
        given:
        println "We are in feature method 1"
    }

    @Ignore
    def "feature 2"(){
        given:
        println "We are in feature method 2"
    }
    @Timeout(2)
    def "feature "(){
        given:
        println "We are in feature method 13"
    }
   @IgnoreRest
    def "feature 4"(){
        given:
        println  "We are in feature method 4"
    }
}
