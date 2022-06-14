@teknolojikArama
Feature: Amazonda Bir Cok Urun Arama
  Scenario Outline: NL05_Kullanici Amazonda Urun Arar
    Given kullanici amazon sayfasina gider
    And   kullanici arama kutusuna "<urunler>" yazar ve arar
    Then kullanici sonucu ekrana yazdirir
    Examples:
      | urunler  |
      | camera   |
      | drone    |
      | pencil   |
      | tv       |
      | bisiklet |


