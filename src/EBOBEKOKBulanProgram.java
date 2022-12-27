import java.util.Scanner;

public class EBOBEKOKBulanProgram {
    //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
    public static void main(String[] args) {
        int sayi,sayi2,EBOB = 1,EKOK = 1, i = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        System.out.print("Lütfen 1. sayiyi giriniz :"); sayi = sc.nextInt();
        System.out.print("Lütfen 2. sayiyi giriniz :"); sayi2 = sc.nextInt();

        if (sayi < 1 || sayi2 < 1){
            System.out.println("Girdiğiniz sayılardan en az bir tanesi 1'den küçük.");
            System.out.println("Çıkış yapılıyor...");
        }else {
            while (sayi > 1 || sayi2 > 1){
                if(sayi%i == 0 && sayi2%i == 0){
                    EBOB *=i;
                    EKOK *=i;
                    sayi /=i;
                    sayi2 /=i;
                } else if (sayi%i == 0 && sayi2%i != 0 ) {
                    EKOK *=i;
                    sayi /= i;
                } else if (sayi%i != 0 && sayi2%i == 0) {
                    EKOK *=i;
                    sayi2 /= i;
                } else {
                    i++;
                }
            }
            System.out.println("EBOB :" + EBOB + " EKOK :" + EKOK);
        }
    }
}
