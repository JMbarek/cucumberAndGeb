package support


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
    timeout = 2
}

environments {

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        driver = {
            def driver = new ChromeDriver()
            driver.manage().window().maximize()
            driver
        }
    }

    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        driver = {
            def driver = new FirefoxDriver()
            driver.manage().window().maximize()
            driver
        }
    }

}
driver = "firefox"
baseUrl = "http://localhost:8080/test-webapp/"

reportsDir = new File("target/geb-reports")
reportOnTestFailureOnly = true