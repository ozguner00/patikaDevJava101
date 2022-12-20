import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km,tutar ;
        System.out.println("Hoşgeldiniz...");
        System.out.print("Lütfen gidilecek KM'yi yazınız :");
        km = sc.nextDouble();
        tutar = 10 + (km*2.20);
        System.out.print("Ödeyeceğiniz tutar :");
        System.out.println( (tutar>20) ? tutar : 20);


    }
}
