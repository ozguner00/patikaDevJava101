import java.util.Scanner;

public class TekSayilarinToplaminiBulanProgram {
     //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
     // girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCift = true;
        int toplam = 0, sayi;

        System.out.println("Hoşgediniz.");
        while (isCift){
            System.out.print("Sayi giriniz :"); sayi = sc.nextInt();
            if (sayi%2 == 1){
                isCift = false;
            }
            else {
                if(sayi%4 == 0){
                    toplam += sayi;
                }
            }
        }
        System.out.println("Toplam : " + toplam);
    }
}
