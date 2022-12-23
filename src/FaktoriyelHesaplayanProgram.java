import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
    N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü :C(n,r) = n! / (r! * (n-r)!)
    */
    public static void main(String[] args) {
        int n,r,nFak = 1, rFak = 1, nrFak = 1, sonuc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz.");
        System.out.println("N ve r değerlerini sırasıyla giriniz.");
        System.out.print("N :"); n =sc.nextInt();
        System.out.print("r :"); r =sc.nextInt();

        if ( n<r){
            System.out.println("N değeri r değerinden küçük olamaz.");
            System.out.println("Çıkış yapılıyor.");
        }
        else {
            for (int i=1; i<=n; i++){
                nFak *= i;
            }
            for (int i=1; i<=r; i++){
                rFak *= i;
            }
            for (int i=1; i<=n-r; i++){
                nrFak *= i;
            }
            sonuc = nFak / (rFak*nrFak);
            System.out.println("C(n,r) :" + sonuc);
        }

    }
}
