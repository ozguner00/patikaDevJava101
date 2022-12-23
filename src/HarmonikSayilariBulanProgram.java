import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    //Java ile girilen sayının harmonik serisini bulan program yazacağız.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğniiz için sistemden çıkış yapılıyor..";
        int sayi;
        double toplam=0;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0) System.out.println(errorMes);
        else {
            for (int i = 1; i<=sayi; i++){
                toplam += 1.0/i;
                System.out.println(i);
            }
        }
    }
}
