Feature: Google Arama
  @googleArama
  Scenario: Nl01_Kullanici googleda arama yapar
    Given kullanici google sayfasina gider
    And   kullanici guvenlik duvarini gecer
    And   kullanici infotech aramasini yapar
    Then  kullanici sayfa basligini kontrol eder


# Given,When,And,But,Then kullanilabilir,seneryomuzun adimlari
#Genellikle Given ile baslar Then ile biter

