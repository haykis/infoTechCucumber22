Feature: Amazon Arama
  Background: oncesinde calistirmak istedigimiz methodlari buraya yaziyoruz
    Given kullanici amazon sayfasina gider

  @amazonArama
  Scenario: Nl02_Kullanici amazon sayfasinda arama yapar
   # Given kullanici amazon sayfasina gider
    And   kullanici s22 telefon aramasi yapar
    Then  kullanici sonucu ekrana yazdirir

#Birden fazla seneryo ekleyebilirsiniz
  @amazonCameraArama
  Scenario: Nl03_kullanici amazonda arama yapar
    #Given kullanici amazon sayfasina gider
    And kullanici camera aramasi yapar
    Then kullanici sonucu ekrana yazdirir

