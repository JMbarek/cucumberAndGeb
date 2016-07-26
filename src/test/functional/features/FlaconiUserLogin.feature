Feature: 02
  Positiv: Given the user exists in Flaconi Shop

  Background:
    Given the user goes to Flaconi Homepage
    When the user clicks on Anmelden link
    Then the user is redirected to Benutzerkonto page
    And the user fills a login form out

  Scenario Outline: 02_01
  Positiv: in this scenario the user did not have any orders

    Given the user provides <E-Mail-Adresse> and <Passwort>
    And the user clicks on 'Anmelden' button
    Then the user should be provided to Mein Konto page
    #or
    Then the user should be logged in to the application

    Examples:

      | E-Mail-Adresse          | Passwort |
      | testFrau@web.de         | test1234 |
      | oneill@co.uk            |          |
      | testEmail@gmail.com     |          |
      | testHerr@hotmail.com    |          |
      | testHerrYahoo@yahoo.de  |          |
      | testHerrGmail@gmail.com |          |

    And the user should see an 'Übersicht' and greetings


  Scenario Outline: 02_02
  Positiv:the user have order table on Mein Konto page with an id = account-orders

    Given the user provides <E-Mail-Adresse> and <Passwort>
    And the user clicks on 'Anmelden' button
    Then the user should be provided to Mein Konto page
     #or
    Then the user should be logged in to the application

    Examples:
      | E-Mail-Adresse                 | Passwort |
      | Unterschied@automatisierung.de | test1234 |
      | KlarnaKauf@automatisierung.de  | test1234 |

    And there is a table "Letzte Bestellungen" with an overview about current order(s)

  Scenario Outline: 02_03
  Negativ: with those invalid credentials should be impossible to log in into application


    Given the user provides <E-Mail-Adresse> and <Passwort>
    And the user clicks on 'Anmelden' button
    Then the user should see an <errorMessage>
    And the user should stay at Benutzerkonto page

    Examples:
      | E-Mail-Adresse                                                                                      | Passwort  | errorMessage                                                                      |
      |                                                                                                     |           | Bitte geben Sie Ihre E-Mail-Adresse ein.,   Bitte geben Sie Ihr Passwort ein.     |
      | changesIFrame@automatisierung.de                                                                    |           | Bitte geben Sie Ihr Passwort ein.                                                 |
      |                                                                                                     | test1234  | Bitte geben Sie Ihre E-Mail-Adresse ein.                                          |
      #E-Mail-Adresse is wrong
      | changesIFrame@automatisierung.de                                                                    | test12345 | Anmeldename oder Passwort sind fehlerhaft                                         |
      #Passwort is wrong
      | changesIFrame@automatisierung.de                                                                    | test12345 | Anmeldename oder Passwort sind fehlerhaft                                         |
    #ungültige E-Mail-Adresse
      | changesIFrame@automatisierung.comchangesIFrame@automatisierung.comchangesIFrame@automatisierung.com |           | Bitte geben Sie eine gültige E-Mail-Adresse ein. Zum Beispiel muster@beispiel.de. |
      | 66666&&&&&&&____@web.de                                                                             |           | Bitte geben Sie eine gültige E-Mail-Adresse ein. Zum Beispiel muster@beispiel.de. |
      | @yahoo.de                                                                                           |           | Bitte geben Sie eine gültige E-Mail-Adresse ein. Zum Beispiel muster@beispiel.de. |
      | et@yahoo&.de                                                                                        |           | Bitte geben Sie eine gültige E-Mail-Adresse ein. Zum Beispiel muster@beispiel.de. |
