package pages

import geb.Page


class FlaconiHomePage extends Page {


    static url = 'http://www-testing.flaconi.de/'
    static at = { title =~ "Online Parfümerie: Parfum & Kosmetik bestellen | Flaconi" }

    static content = {

//        loginLinkAnmelden { $("ul li", text: "Anmelden")}
//        loginLinkAnmelden {  $(title: "Anmelden")}
//        loginLinkAnmelden{ $("div#login-link" , text: "Anmelden")}
//        loginLinkAnmelden{  $('div.top-nav-right  p:nth-child(2)[title^="Anmelden"]') }

        topNavRight { $(".top-nav-right") }
        anmeldenRow { $("#login-link") }
//        loginLinkAnmelden{  $("ul", 0, title: "Anmelden") }
        loginLinkAnmelden{  $(anmeldenRow.Anmelden) }


        contactLink { $("ul li", text: "Kontakt") }
    }

    def clickAnmeldenLink() {
        loginLinkAnmelden.click()
    }

    def clickContactLink() {
        contactLink.click()
    }

}
