package pages

import geb.Page

class CustomerAccountPage extends Page {

 static url = 'https://www-testing.flaconi.de/benutzerkonto/'
    static at = { title =~ "Mein Konto | Flaconi" }
    static content = {
//        searchBox {$("input#query")}
//        searchButton {$("input#go")}
//        dropdown {$("select#catAbb")}
//        // workaround for getting the selected text from the dropdown....
//        dropdownSelectedText {dropdown.find('option', value:dropdown.value()).text()}

//        table Letzte Bestellungen
//        Table Rechnungsadresse
//        table NL Box
        //success message

    }

    def searchFor(textString) {
        searchBox = textString
        searchButton.click()
    }
}
