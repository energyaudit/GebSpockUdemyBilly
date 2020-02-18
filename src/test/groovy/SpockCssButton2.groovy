import geb.navigator.Navigator
import org.openqa.selenium.WebElement
import spock.lang.Specification

import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver


System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");
//def browser=new Browser(driver:new FirefoxDriver())
def browser=new Browser(driver:new ChromeDriver())
browser.go("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio")

//browser.$("input[value='male']").click()
//$("#iFrame").contents().find("#someDiv").removeClass("hidden");
//browser.$(Array.from(document.getElementsByName('gender')).reduce(it => { return it.value === 'male' ? it : false}).click()
browser.$("#iframewrapper iframe#iframeResult").click()
sleep(2000)

println("I am here")
try {
 //   browser.$("#iframewrapper iframe#iframeResult").find( "input[value='male']").click()
    //browser.$("input[name='gender'][value='male']").click()

//    Navigator iframe = browser.$("#iframewrapper iframe#iframeResult")
//    Navigator children = iframe.
//    Navigator input = children.find("input[name='gender'][value='male']")
//    input.click()

    //Navigator s = browser.$("#iframewrapper iframe#iframeResult").allElements()

    //Collection<WebElement> allElements = browser.$("#iframewrapper iframe#iframeResult").allElements()
            //Navigator input = s.$("input[value='male']")
//
//    Navigator doc = browser.$("#iframewrapper iframe#iframeResult");
//    Navigator first = doc.first()
//    Navigator input  = first.find("input[name='gender'][value='male']")
    browser.$("#iframewrapper iframe#iframeResult").contents().find("#iframewrapper iframe#iframeResult").click()

    println("I am here1")
    sleep(3000)
} finally {
    browser.$("div.w3-col.s4 input")[1].click()
   browser.quit()

}

//browser.$("body > form > input[type=radio]:nth-child(1)").click()

//$("iframe[name='iframeResult']//input[name='gender']")


