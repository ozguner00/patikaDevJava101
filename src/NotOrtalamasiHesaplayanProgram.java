import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int matNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hoşgeldiniz...");
        System.out.println("Lütfen istenilen değerleri giriniz.");

        System.out.print("Matematik notunuz :");
        matNotu = sc.nextInt();

        System.out.print("Fizik notunuz :");
        fizikNotu = sc.nextInt();

        System.out.print("Kimya notunuz :");
        kimyaNotu = sc.nextInt();

        System.out.print("Türkçe notunuz :");
        turkceNotu = sc.nextInt();

        System.out.print("Tarih notunuz :");
        tarihNotu = sc.nextInt();

        System.out.print("Müzik notunuz :");
        muzikNotu = sc.nextInt();

        double ortalama =  (matNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu) / 6.00;

        System.out.println(ortalama > 60 ? "Tebrikler sınıfı geçtiniz" : "Sınıfta kaldınız ");
        System.out.println("Ortalamanız :" + ortalama);

    }
}
