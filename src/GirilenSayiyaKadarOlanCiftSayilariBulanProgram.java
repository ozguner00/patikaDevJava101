import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğniiz için sistemden çıkış yapılıyor..";
        int sayi;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0){
            System.out.println(errorMes);
        }
        else {
            int toplam = 0, count = 0;
            for (int i = 1; i <= sayi; i++ ){
                if(i%4==0 && i%3==0){
                    count++;
                    toplam += i;
                }
            }
            if(count == 0){
                System.out.println("3 ve 4'e tam bölünen sayı yok.");
            }
            else {
                double ort = toplam/count;
                System.out.println("Ortalama : " + ort );
            }

        }

    }
}
