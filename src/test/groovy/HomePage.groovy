import geb.Page

class HomePage extends Page{

   static url="/selenium-webdriver/"
    //final url=baseUrl+static URL
    static at ={title=="Selenium WebDriver"}
    static content={
        headerTitel(wait:true){$("#post-458>h1")}
    }

    def "Show message on screen" ()
    {println headerTitle.text()}
}
