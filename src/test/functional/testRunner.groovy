import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith




class testRunner {

    @RunWith(Cucumber.class)
    // @CucumberOptions(features="src/test/resources")
    @CucumberOptions(features = "/home/flaconi-qa/IdeaProjects/cucumberAndGeb/src/test/functional/features/FlaconiUserRegistration.feature")

    class RunCukesIT {
    }

}
