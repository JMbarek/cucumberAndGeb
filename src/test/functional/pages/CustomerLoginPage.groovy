package pages
import geb.Page
class CustomerLoginPage extends Page {

     static url = 'https://www-testing.flaconi.de/benutzerkonto/anmelden/'
    // static at = { title =~ "Benutzerkonto anlegen | Flaconi" }
    static at = {
        (title =~ /^Benutzerkonto anlegen | Flaconi$/) as Boolean
    }
    static content = {
        loginEmail { $("input[id='loginEmail']") }
        loginPassword { $("input[id='loginPassword']") }
        buttonLogin { $("button[id='loginSubmit']") }
        registerFirstName { $("input[id='registerFirstname']") }
        registerLastName { $("input[id='registerLastname']") }
        registerEmail { $("input[id='registerEmail']") }
        buttonRegister { $("button[id='registerSubmit']") }
    }
    def loginFunction(final String email, final String password) {
        loginEmail = email
        loginPassword = password
    }
    def registerFunction(final String userFirstName, final String userLastName, final String email) {
        registerFirstName = userFirstName
        registerLastName = userLastName
        registerEmail = email
    }
    def clickRegisterSubmit() {
        buttonRegister.click()
    }
    def clickLoginSubmit() {
        buttonLogin.click()
    }
}


