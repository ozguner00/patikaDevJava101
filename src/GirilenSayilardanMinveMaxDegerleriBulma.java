import java.util.Scanner;

public class GirilenSayilardanMinveMaxDegerleriBulma {
    //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
    public static void main(String[] args) {
        int n = 0,min = 0,max = 0, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        System.out.print("Lütfen kaç adet sayı gireceğinizi belirtin :"); n = sc.nextInt();
        while (n > 0){
            System.out.print(i + ". sayıyı giriniz :"); int sayi = sc.nextInt();
            if(i == 1){
                min = sayi;
                max = sayi;
            }else {
                if (min > sayi) min = sayi;
                if (max < sayi) max = sayi;
            }
            n --;
            i ++;
        }
        System.out.println("Max :" + max + " Min :" + min);
    }
}
