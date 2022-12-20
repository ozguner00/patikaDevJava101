import java.util.Scanner;

public class SinifiGecmeDurumu {
    /*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
      Geçme Notu : 55
      Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/

    public static void main(String[] args) {
        double matNotu, fizikNotu, kimyaNotu, turkceNotu, muzikNotu, dersSayisi = 0, toplam = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hoşgeldiniz...");
        System.out.println("Lütfen istenilen değerleri giriniz.");

        System.out.print("Matematik notunuz :"); matNotu = sc.nextInt();
        if(matNotu > 0 & matNotu < 100){
            toplam += matNotu;
            dersSayisi++;
        }

        System.out.print("Fizik notunuz :"); fizikNotu = sc.nextInt();
        if(fizikNotu > 0 & fizikNotu < 100){
            toplam += fizikNotu;
            dersSayisi++;
        }
        System.out.print("Kimya notunuz :"); kimyaNotu = sc.nextInt();
        if(kimyaNotu > 0 & kimyaNotu < 100){
            toplam += kimyaNotu;
            dersSayisi++;
        }
        System.out.print("Türkçe notunuz :"); turkceNotu = sc.nextInt();
        if(turkceNotu > 0 & turkceNotu < 100){
            toplam += turkceNotu;
            dersSayisi++;
        }
        System.out.print("Müzik notunuz :"); muzikNotu = sc.nextInt();
        if(muzikNotu > 0 & muzikNotu < 100){
            toplam += muzikNotu;
            dersSayisi++;
        }

        double ortalama = toplam / dersSayisi;
        System.out.println(ortalama > 55 ? "Geçtiniz. Ortalamanız :" + ortalama : "Kaldınız. Ortalamanız :" + ortalama);


    }
}
