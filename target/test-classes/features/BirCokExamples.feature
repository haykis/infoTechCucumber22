@birCokExample
Feature: Amazonda urun arama
  Scenario Outline: NL07_Kullanici Amazonda dropdown ve aramaKutusunu kullanarak arama yapar
    Given kullanici "http://amazon.com" sayfasina gider
    And kullanici dropDownda "<kategori>" secer
    And kullanici arama kutusuna "<urunler>" yazar ve arar
    And kullanici sonucu ekrana yazdirir
    Examples:
      | kategori   | urunler     |
      | Automotive | car  holder |
      | Baby       | stroller    |
      | Books      | Misarebles  |
