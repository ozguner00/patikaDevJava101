import java.util.Scanner;

public class ArtikYilHesaplama {
    /*Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
    Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
    1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
    100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
    Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil ;
        System.out.println("Hoşgeldiniz.");
        System.out.print("Lütfen yili giriniz :");  yil = sc.nextInt();
        String mes = yil + " Artık yıldır."; String mesN = yil + " Artık yıl değildir.";
        if (yil%100 == 0){
            if (yil%400 == 0){
                System.out.println(mes);
            }
            else {
                System.out.println(mesN);
            }
        }
        else {
            if (yil%4 == 0){
                System.out.println(mes);
            }
            else {
                System.out.println(mesN);
            }
        }
    }
}
