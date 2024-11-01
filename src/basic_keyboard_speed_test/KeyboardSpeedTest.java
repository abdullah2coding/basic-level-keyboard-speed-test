
package basic_keyboard_speed_test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class KeyboardSpeedTest {
    
    // Rastgele kelimelerin bulunduğu dizi
    private static final String[] KELIMELER = {
        "Hayat", "bir", "yolculuktur", "her", "ani", "degerlendirilmelidir",
        "Zamani", "iyi", "kullanmak", "sevdiklerimizle", "kaliteli", "anlar",
        "gecirerek", "onemlidir", "calisma", "ve", "kararlilikla",
        "gelir", "Insanlar", "hayallerinin", "pesinden", "kosarken", "karsilastiklari",
        "zorluklari", "asmak", "icin", "mucadele", "etmelidirler", "Doga",
        "bize", "bircok", "guzellik", "sunar", "bunlari", "gormek", "ve",
        "takdir", "etmek", "gerekir", "Saglikli", "yasam", "dengeli",
        "beslenme", "ve", "duzenli", "egzersizle", "mumkundur", "Arkadaslar",
        "hayatimizin", "onemli", "parcalardir", "Onlarla", "gecirilen",
        "zaman", "unutulmaz", "ani", "Hayallerimize",
        "ulasmak", "icin", "her", "gun", "bir", "adim", "atmaliyiz",
        "Unutulmamalidir", "ki", "mutluluk", "basit", "seydlerde", "saklidir",
        "Kendimize", "ve", "cevreye", "duydugumuz", "sevgi", "bizi",
        "daha", "iyi", "insanlar", "yapar"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kelime_goster();

        int sayac = 0;
        long startTime = System.currentTimeMillis();
        long duration = 60 * 1000; // 60 saniye
        ArrayList<String> kelimeListesi = new ArrayList<>();

        // Kullanıcının yazdığı kelimeleri toplama döngüsü
        while (System.currentTimeMillis() - startTime <= duration) {
            String kelime = input.next();
            kelimeListesi.add(kelime);
        }

        // Eşleşen kelimeleri sayma
      /*  Set<String> kelimeSet = new HashSet<>(List.of(KELIMELER));
        for (String typedKelime : kelimeListesi) {
            if (kelimeSet.equals(typedKelime)) {
                sayac++;
            }
        }*/
        for (String aranacakKelime: kelimeListesi) {
            //System.out.println(kelime);
          for(int p=0;p<KELIMELER.length;p++){
              if(aranacakKelime.equals(KELIMELER[p])){
                  sayac++;
                  break;
              }
              else{
                  
              }
          }
          
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Toplam: " + sayac + " tane dogru kelime yazdınız");
        System.out.println("1 dakikalık süre doldu.");
    }
    
    // Rastgele kelimeleri gösteren metod
    public static void Kelime_goster() {
        Random random = new Random();
        System.out.println("Rastgele Olusturulan Metin:");
        System.out.println("****************************************************************************************************************************************************");

        for (int j = 0; j < 3; j++) {
            Set<Integer> kullanilanIndeksler = new HashSet<>();
            StringBuilder sonuc = new StringBuilder();

            // 20 benzersiz kelime oluşturma
            while (kullanilanIndeksler.size() < 20) {
                int index = random.nextInt(KELIMELER.length);
                if (kullanilanIndeksler.add(index)) { // Set'e ekle
                    sonuc.append(KELIMELER[index]).append(" ");
                }
            }

            // Oluşan cümleyi ekrana yazdırma
            System.out.println(sonuc.toString().trim());
        }
        System.out.println("****************************************************************************************************************************************************");
    }
}
