import java.util.Scanner;

public class DizidekiMaksimumveMinimumDegerleriBulanProgram {
    //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
    //Dizi : {15,12,788,1,-1,-778,2,0}
    //Girilen Sayı : 5
    //Girilen sayıdan küçük en yakın sayı : 2
    //Girilen sayıdan büyük en yakın sayı : 12
    public static void main(String[] args) {
        int numbers[] = {15,12,788,1,-1,-778,2,0},sayi,upNearFark = 99999,downNearFark = -99999,upNear = 99999,downNear = 99999;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        System.out.println("Lütfen bir sayı giriniz :"); sayi = sc.nextInt();

        for (int i :numbers){
            if(sayi-i > 0){
                if(sayi-i < upNearFark){
                    upNear = i;
                    upNearFark = sayi-i;
                }
            }else if (sayi-i < 0){
                if(sayi-i > downNearFark){
                    downNear = i;
                    downNearFark = sayi-i;
                }

            }else {
                upNear = sayi;
                downNear = sayi;
                break;
            }
        }
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + upNear
                        +"\nGirilen sayıdan küçük en yakın sayı :" + downNear);
    }
}
