import java.util.Scanner;

public class TersUcgenYapimi {
    //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
    //https://app.patika.dev/courses/java101/odev-ters-ucgen

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğiniz için sistemden çıkış yapılıyor..";
        int sayi;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0) System.out.println(errorMes);
        else {
            for(int i = 0; i<sayi; i++){ //alt kısım
                for(int j=sayi; j>=sayi-i; j--){//boşluk yazdıran döngü
                    System.out.print(" ");
                }
                for(int k=1; k<(sayi-i)*2; k++){ //yıldız yazdıran döngü
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
