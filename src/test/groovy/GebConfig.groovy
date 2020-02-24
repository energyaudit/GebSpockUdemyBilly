import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout =6
	retryInterval = 0.5
	includeCauseInMessage = true

	preset {
		slow{
			timeout =120
			retryInterval =10
		}

		verySlow{ timeout =50 }
	}
}

atCheckWaiting = "slow"
//atCheckWaiting = true



environments{
	
	chrome {
		driver = {new ChromeDriver()}
	}
	
	firefox {
		driver = {new FirefoxDriver()}
	}
}

baseUrl = "http://abodeqa.com"
reportsDir =".target/report"

//System.setProperty("webdriver.chrome.driver", "/QA INSTALL/chromedriver");
System.setProperty("webdriver.chrome.driver", "../resources/chromedriver.exe");//this need update whenever chrome updated
driver = {new ChromeDriver()}

//System.setProperty("webdriver.gecko.driver", "../resources/geckodriver.exe");
//driver = {new FirefoxDriver()}