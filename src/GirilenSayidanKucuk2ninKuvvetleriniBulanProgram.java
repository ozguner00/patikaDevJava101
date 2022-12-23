import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleriniBulanProgram {
    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğniiz için sistemden çıkış yapılıyor..";
        int sayi;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0){
            System.out.println(errorMes);
        }
        System.out.print("4'ün katı olan sayılar : ");
        for (int i = 4; i<sayi; i+=4){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.print("5'in katı olan sayılar : ");
        for (int i = 5; i<sayi; i+=5){
            System.out.print(i + " ");
        }

    }
}
