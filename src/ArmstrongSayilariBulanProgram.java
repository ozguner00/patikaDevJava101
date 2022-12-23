import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    //Örnek : 1643 = 1 + 6 + 4 + 3 = 14
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğniiz için sistemden çıkış yapılıyor..";
        int sayi,toplam=0;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0) System.out.println(errorMes);
        else {
            for (int i = sayi; i>0; i /= 10){
                toplam += i%10;

            }
            System.out.println(sayi + " sayısının basamak değeri toplam :" + toplam);
        }
    }
}
