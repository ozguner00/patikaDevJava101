import java.util.Scanner;

public class YildizlarileUcgenYapimi {
    //Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
    /*    * 4-1 boşluk ve yıldız sayıları.
         *** 3-3
        ***** 2-5
       ******* 1-7
      ********* 0-9
       ******* 7
        ***** 5
         *** 3
          * 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğiniz için sistemden çıkış yapılıyor..";
        int sayi;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0) System.out.println(errorMes);
        else {
            for(int i = 0; i<sayi; i++){//üst kısım
                for(int j=1; j<sayi-i; j++){ //boşluk yazdıran döngü
                    System.out.print(" ");
                }
                for(int k=sayi*2; k>=(sayi-i)*2; k--){ //yıldız yazdıran döngü
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i = 0; i<sayi-1; i++){ //alt kısım
                for(int j=sayi; j>=sayi-i; j--){//boşluk yazdıran döngü
                    System.out.print(" ");
                }
                for(int k=1; k<(sayi-i-1)*2; k++){ //yıldız yazdıran döngü
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

}
