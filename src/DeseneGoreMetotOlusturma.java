import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    /*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğniiz için sistemden çıkış yapılıyor..";
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); int sayi = sc.nextInt();
        System.out.print("Lütfen desen aralığını giriniz :"); int sayi2 = sc.nextInt();

        if(sayi <= 0 || sayi2 <=0) System.out.println(errorMes);
        else {
            desenOlusturma(sayi,sayi,sayi2);
        }
    }

    static int desenOlusturma(int n,int n2, int desenModeli){ //n2=n
        if(n > n2){
            return 1;
        }else {
            System.out.print(n + " ");
            if(n > 0){
                return desenOlusturma((n-desenModeli),n2,desenModeli);
            }else {
                desenModeli = -desenModeli;
                return desenOlusturma((n-desenModeli),n2,desenModeli);
            }
        }

    }
}
