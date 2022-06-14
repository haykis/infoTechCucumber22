@amazon  #bu sayfadaki tum testleri calistirmak icin FEATURE'nin uzerine bir tag yazmak zorundayiz.
Feature: Amazon Urun Arama
  Background: kullanici bir cok urun arar
    Given kullanici amazon sayfasina gider

    @amazonBisiklet
  Scenario: NL04_kullanici amazon da urun aramasi yapar
  #  Given kullanici amazon sayfasina gider
    And   kullanici arama kutusuna "bisiklet" yazar ve arar
    Then  kullanici sonucu ekrana yazdirir

    @amazonDrone
  Scenario: NL04_kullanici amazon da urun aramasi yapar
   # Given kullanici amazon sayfasina gider
    And   kullanici arama kutusuna "drone" yazar ve arar
    Then  kullanici sonucu ekrana yazdirir
  @amazonDrone
  Scenario: NL04_kullanici amazon da urun aramasi yapar
   # Given kullanici amazon sayfasina gider
    And   kullanici arama kutusuna "kamera" yazar ve arar
    Then  kullanici sonucu ekrana yazdirir
  @amazonDrone
  Scenario: NL04_kullanici amazon da urun aramasi yapar
   # Given kullanici amazon sayfasina gider
    And   kullanici arama kutusuna "tv" yazar ve arar
    Then  kullanici sonucu ekrana yazdirir