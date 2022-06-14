@ebayUrunArama
Feature: Ebayda bir cok urun arama
  Scenario Outline: NL06_kullanici ebayda urun arar
    Given kullanici "http://ebay.com" sayfasina gider
    And   kullanici ebay guvenlik duvarini gecer
    And   kullanici ebay arama kutusuna "<urunler>" yazar ve arar
    Then  kullanici ebaydaki sonucu ekrana yazdirir
    Examples:
      | urunler       |
      | araba         |
      | tv            |
      | bebek arabasi |
      | bisiklet      |

#Kullanici daha onceden olusturdugu bir method varsa ,cucumber yeniden adim olustrumak yerine
#onceki adim icin olusturdugu methodu kullaniyor.Bu yuzden ,ager ayni isimde method kullanacak isek
#Buna dikkat etmemiz gerekiyor,eger ihtiyac duyarsak METHOD USMINI KESINLIKLER DEGISTIRMEMIZ GEREKIYOR !!!!

