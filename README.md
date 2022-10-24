# Son Güncelleme : 12/08/2022
• Bu projede Nerdle olarak bilinen oyunu Java Swing kütüphanesini kullanarak kodladım. İlk GUI projemdir. <br />
• Kodlara bakmak için src klasörünü kullanınız. Doğrudan programı çalıştırmak için ise Nerdle.jar uzantılı programı çalıştırabilirsiniz. <br />
• Nerdle oyununda günde bir kere ve daha önceden belirlenmiş bir denklemi bulmaya çalışırken, kendi programımda rastgele olarak denklem üretilmektedir. <br />
• Oyundaki temel amaç, program tarafından üretilen rastgele denklemi maksimum 6 adımda bulmaktır. <br />
• Yapmış olduğunuz tahminlere göre program size bazı ipuçları verir. Bunlar; <br />
&emsp;&emsp; Eğer bir rakam ya da işarette "yeşil" renk varsa, bu onun yerinin doğru olduğunu söylemektedir. <br />
&emsp;&emsp; Eğer bir rakam ya da işarette "sarı" renk varsa, bu onun yerinin doğru olmadığını ama denklemde bulunduğunu söylemektedir. <br />
&emsp;&emsp; Eğer bir rakam ya da işarette "kırmızı" renk varsa, bu onun denklemde bulunMAdığını söylemektedir. <br />
• Oyunda üç adet ekran bulunmaktadır: <br />
&emsp;&emsp; Ana Ekran <br />
&emsp;&emsp; Denklem Üretim Ekranı <br />
&emsp;&emsp; Oyun Ekranı <br />
• Oyun ekranından çıkış yapabilmek için 2 yol vardır: <br />
&emsp;&emsp; Denklemi doğru/yanlış bitirip "Ana Menü" butonunu kullanmak <br />
&emsp;&emsp; Denklemi yarıda bırakıp "Sonra Bitir" butonuna tıklamak <br />
• Eğer "Sonra Bitir" butonuna basarak bir oyunu yarıda bıraktıysanız ana ekrandaki "Devam Et" butonuna basarak kaldığınız yerden devam edebilirsiniz ancak sadece tek bir oyun kaydedilmektedir. Yani birden fazla "Sonra Bitir" butonuna basıldıysa, en son yarım bıraktığınız oyuna kaldığınız yerden devam edebilirsiniz.

# Ana Ekran
• Kullanıcı ilgili ekranlara yönlendiren ve önceki oyunlarına ait istatistiklerinin gösterildiği ekrandır.

# Denklem Üretim Ekranı
• Ana ekrandan "Test" butonuna basılarak gidilen ve rastgele olarak üretilen (7, 8 ya da 9 uzunluğunda) denklemin kontrolünün yapılabildiği ekrandır.

# Oyun Ekranı
• Ana ekrandan "Yeni" ya da "Devam Et" butonuna basılarak gidilen ve ekrandaki butonları kullanarak oyunun oynandığı ekrandır.
