package pages

import geb.Page

class CustomerContactPage extends Page {

  static url = 'http://www-testing.flaconi.de/faq/kontakt'

    static at = {
        (title =~ /^Fragen oder Probleme? Nehmen Sie Kontakt mit uns auf | Flaconi$/) as Boolean
    }
    // static at = { title =~ "Fragen oder Probleme? Nehmen Sie Kontakt mit uns auf | Flaconi" }

    static content = {
//        inputName { $("input[id='name']") }
//        inputEmail { $("input[id='email']") }
//        inputTelephone { $("input[id='telephone']") }
        // selectSubject { $("select").subject = "Status meiner Bestellung" }
        contactForm { $("form[id='contactForm']") }
        inputName { contactForm.$("input[id='name']") }
        inputEmail { contactForm.$("input[id='email']") }
        inputTelephone { contactForm.$("input[id='telephone']") }
        inputComment { contactForm.$("textarea[id='comment']") }

        //selectSubject { contactForm.$("input[id='name']") }

//Button 'Absenden'
        sendFormButton { contactForm.$("button[type='submit']") }

    }

    def sendContactForm(final String name,
                        final String email,
                        final String telephone,
                        final String comment) {


        inputName = name
        inputEmail = email
        inputTelephone = telephone
//        selectSubject = subject
        inputComment = comment
    }

    def clickSendButton() {
        sendFormButton.click()
    }
}
