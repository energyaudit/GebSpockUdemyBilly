import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver
import pages.ContactUsPage
System.setProperty("webdriver.gecko.driver", "../resources/geckodriver.exe");
//System.setProperty("webdriver.gecko.driver", "/QA INSTALL/geckodriver");

//driver = {new FirefoxDriver()}
def browser=new Browser(driver:new FirefoxDriver())

Browser.drive {

   try{to ContactUsPage
       println currentUrl
       "enter name"("Abodeqa")}
    finally{
//       driver.close()
        Browser.close()
           }
}