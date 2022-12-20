import java.util.Scanner;

public class HesapMakinesi {
    /*
    https://youtu.be/XiXHRVm_hJY
    Videodaki hesap makinesini switch-case kullanarak yapınız.
    
    */
    public static void main(String[] args) {
        double sayi1, sayi2 ,sonuc;
        int islem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesap Makinesi Programına Hoşgeldiniz...");
        System.out.print("Birinci sayiyi giriniz:"); sayi1 = sc.nextDouble();
        System.out.print("İkinci sayiyi giriniz:"); sayi2 = sc.nextDouble();
        System.out.println("\n1 Toplama \n2 Çıkarma \n3 Çarpma \n4 Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz:"); islem = sc.nextInt();



        switch (islem){
            case 1:
                sonuc = sayi1 + sayi2; System.out.println(sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2; System.out.println(sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2; System.out.println(sonuc);
                break;
            case 4:
                sonuc = sayi1 / sayi2; System.out.println(sonuc);
                break;
            default:
                System.out.println("Hatalı bir işlem seçtiniz. \nÇıkış yapılıyor....");


        }



    }
}
