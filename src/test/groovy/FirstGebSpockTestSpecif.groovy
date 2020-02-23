import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.firefox.FirefoxDriver
import pages.ContactUsPage
import pages.MessageSubmittedPage

class FirstGebSpockTestSpecif extends GebSpec {


    def "Fill Contact us form and click on Sumit button" () {
      //  System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        def browser=new Browser(driver:new FirefoxDriver())
//        System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
        given:
        println("We are in given block")

        when:
        to ContactUsPage

        "enter name"("nameString")
		"Enter email "("dd.test@abodeqa.com")
		"Enter Comment in comment textarea"("Comment is nothing we are testing")

        and:
        "Click on submit button"()


        then:
        at MessageSubmittedPage

    }
}
