import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    /*Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
          Lütfen kilonuzu giriniz : 105
          Vücut Kitle İndeksiniz : 35.49215792320173
          Formul = Kilo (kg) / Boy(m) * Boy(m)
          */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double boy,kilo,kitleIn;
        System.out.println("Hoşgeldiniz.");
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        boy = sc.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = sc.nextDouble();
        kitleIn = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:" + kitleIn);
    }
}
