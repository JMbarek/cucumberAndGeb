Feature: 01

  Positiv: User registration

  Background:
    Given the user goes to Flaconi Homepage
    When the user clicks on 'Anmelden' link
    Then the user is redirected to 'Benutzerkonto anlegen' page
#    And the user fills the register form out

  Scenario Outline: 01_01

  #register with 'Frau'
    Given the user checks "Frau" as salutation
#    When the user registers with <Vorname>,<Nachname> and <E-Mail-Adresse>
    When the user registers with Vorname,Nachname and E-Mail-Adresse
#    When the user gives his <Vorname>
#    And the user gives his <Nachname>
#    And the user gives his <E-Mail-Adresse>
    And she checks a newsletter checkbox
    And the user clicks on <Registrieren> button
    Then the user is redirected to Mein Konto page
    #or
    Then the user should be logged in to the application
    And the user should see a message "Vielen Dank für Ihre Registrierung bei Flaconi."
    And the user should stay logged in

    Examples:

      | Vorname       | Nachname     | E-Mail-Adresse      |
      | testFrau      | testFrau     | testFrau@web.de     |
      | testFirstname | testLastname | testEmail@gmail.com |
      | Christina     | O'neill      | oneill@co.uk        |

