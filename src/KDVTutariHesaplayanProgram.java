import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
   /*
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
    KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
    */
    public static void main(String[] args) {
        double kdvOranK = 0.18, kdvOranB = 0.08;


        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz.");
        System.out.print("Lütfen tutarı giriniz :");
        double tutar = sc.nextInt();
        System.out.println("Girdiğiniz tutar :" + tutar );
        System.out.print("KDVli tutar:");
        System.out.println( tutar > 1000 ?  tutar*kdvOranB+tutar : tutar*kdvOranK+tutar);


    }
}
