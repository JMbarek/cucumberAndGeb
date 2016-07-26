package pages

import geb.Page


class FlaconiHomePage extends Page {


     static url = 'http://www-testing.flaconi.de/'
    static at = { title =~ "Online Parfümerie: Parfum & Kosmetik bestellen | Flaconi" }

    static content = {
        loginLinkAnmelden { $("ul li", text: "Anmelden")}

        contactLink { $("ul li", text: "Kontakt") }
    }

    def clickAnmeldenLink() {
        loginLinkAnmelden.click()
    }

    def clickContactLink() {
        contactLink.click()
    }

}
