package functional.step_definitions

import functional.pages.CustomerLoginPage
import functional.pages.FlaconiHomePage

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

//Given(~/^I am on Flaconi Homepage$/) { ->
//    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException()
//}
Given(~"I am on Flaconi Homepage") { ->
    to FlaconiHomePage
    at FlaconiHomePage
}

When(~/^I click on Anmelden link$/) { ->
//When(~"I click on Anmelden link") { ->
    at FlaconiHomePage
    page.clickAnmeldenLink()
    to CustomerLoginPage
}
Then(~"I will be redirect to Benutzerkonto page") { ->
    to CustomerLoginPage

}
And(~"I fill Ich bin Neukunde form out") { ->
    to CustomerLoginPage

}
When(~/^I fill in the form as follows$/) { ->

    at CustomerLoginPage
    page.registerFunction()
}
Given(~/^the user (?:types|provides)in (.*)$/) { ->

}

When(~/^I click registrieren button$/) { ->
    at CustomerLoginPage
    page.clickSubmit()

}

When(~/^the user registers with (.*), (.*) and (.*)$/) {
    final String userFirstName, final String userLastName, final String email ->
        page.registerFunction(userFirstName, userLastName, email)
}