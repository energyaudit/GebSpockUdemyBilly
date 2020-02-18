import geb.spock.GebSpec
import pages.ContactUsPage

class moduleSpec extends GebSpec {

    def "example use module"(){
        given: " we are using module class"
        when:
        to ContactUsPage
        "all click method of module class"
        then:
        println  title
    }
}
