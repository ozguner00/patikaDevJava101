import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
    ifadelerini ekrana yazan programı Java dilinde yazınız.
    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir*/
    public static void main(String[] args) {
        int sayi, toplam = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        System.out.print("Lütfen sayiyi giriniz :"); sayi = sc.nextInt();
        temp = sayi;
        for (int i = 1; i < sayi; i++){
            if(sayi%i == 0){
                toplam += i;
            }
        }

        if(toplam == sayi){
            System.out.println(sayi + " Mükemmel sayidir.");
        }else {
            System.out.println(sayi + " Mükemmel sayi değildir.");
        }
    }
}
