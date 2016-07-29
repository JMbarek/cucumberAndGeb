package step_definitions


import cucumber.api.PendingException
import pages.*

import geb.error.GebException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^the user (?:is )?(?:goes|redirected) to (.*)/) {
    final String page ->
        switch (page) {
            case "Flaconi Homepage":
                to FlaconiHomePage
                break
            case "Benutzerkonto anlegen":
                to CustomerAccountPage
                break
            case "Benutzerkonto page":
                to CustomerLoginPage
                break
            case "Mein Konto page":
                to CustomerAccountPage
                break
            case "Kontaktpage":
                at CustomerContactPage
                break
            case "ProductDetailPage":
                at  ProductDetailPage
                break

            default:
                throw new GebException("Page ${page} not found")
        }
}


And(~/^the user should stay at (.*)/) {
    final String page ->
        switch (page) {
            case "Benutzerkonto page":
                to CustomerLoginPage
                break
            default:
                throw new GebException("Page ${page} not found")
        }
}
When(~/^the user clicks on (.*) link$/) {
    final String linkName ->
        switch (linkName) {
            case "Anmelden":
                at FlaconiHomePage
                page.clickAnmeldenLink()
//                to CustomerAccountPage
                break
            case "Kontakt":
                at FlaconiHomePage
                page.clickContactLink()
                break
            default:
                throw new GebException("Link ${linkName} not found")
        }
}

Then(~/^the user should see a message (.*)$/) {
    final String messageName ->
        switch (messageName) {

            case "Vielen Dank für Ihre Registrierung bei Flaconi":

                at CustomerAccountPage
                break
            case "Anmeldename oder Passwort sind fehlerhaft":

                at CustomerLoginPage
                break
            case "Diese E-Mail-Adresse ist bereits bei Flaconi registriert. Bitte melden Sie sich mit Ihren Login-Daten an":
                at CustomerLoginPage
                break
            case "Bitte benutzen Sie zwischen 1 und 22 Buchstaben für den Vornamen.":
                at CustomerLoginPage
                break
            case "Ihre Feedback wurde versendet. Vielen Dank für Ihr Interesse.":

                at CustomerContactPage
                break
            default:
                throw new GebException("Message ${messageName} not found")
        }
}



And(~/^the user clicks on (.*) button$/) {
    final String buttonName ->

        switch (buttonName) {

            case "Anmelden":
                at CustomerLoginPage
                page.clickLoginSubmit()
                to CustomerAccountPage
                break
            case "Registrieren":
                at CustomerLoginPage
                page.clickRegisterSubmit()
                break
            case "Absenden":
                at CustomerContactPage
                page.clickSendButton()
                break

            default:
                throw new GebException("Button ${buttonName} not found")
        }

}
And(~/^the user should see a table containing (.*)$/) {

    final String tableName ->

        switch (tableName) {

            case "Letzte Bestellungen":

                at CustomerAccountPage

                break
            case "Newsletter":

                at CustomerAccountPage

                break
            case "Rechnungadresse":
                at CustomerAccountPage
            default:

                throw new GebException("Table ${tableName} not found")
        }
}
When(~/^the user types (.*) and (.*)$/) { final String email, final String password ->

    page.loginFunction(email, password)

}
Then(~/^the user should receive a confirmation email$/) { ->

}

When(~/^the user provides (.*), (.*), (.*) and (.*)$/) {

        //When(~/^the user provides (.*),(.*),(.*),(.*) and (.*)$/) {
    final String name,
    final String email,
    final String telephone,
//    final String subject,
    final String comment ->
        at CustomerContactPage
        page.sendContactForm(name, email, telephone, comment)
}

Given(~/^the user is successfully logged in$/) { ->

    at CustomerLoginPage
    page.loginFunction()
    page.clickLoginSubmit()
    at CustomerAccountPage
}
Then(~/^the user should see a product that contains (.*),(.*) and (.*)$/) { ->


}
/**
 * Steps Methoden
 */


Given(~/^the user checks "([^"]*)" as salutation$/) { String arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

/*
When(~/^the user registers with <Vorname>,<Nachname> and <E-Mail-Adresse>$/) {
    String[] names = [ Vorname, Nachname, E-Mail-Adresse]->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
*/

When(~/^the user gives his <Vorname>$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
And(~/^she checks a newsletter checkbox$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^the user should be logged in to the application$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

And(~/^the user should stay logged in$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}


When(~/^the user registers with Vorname,Nachname and E-Mail-Adresse$/) {

    String[][] table = [
            ["Vorname"  ,  "Nachname"   , "E-Mail-Adresse"  ],
            [   "testFrau"  ,  "testFrau"  ,"testFrau@web.de" ],
            [   "testFirstname" , "testLastname"  ,"testEmail@gmail.com" ],
            [   "Christina"   ,"O'neill" , "oneill@co.uk" ]
    ] ->
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException()
}