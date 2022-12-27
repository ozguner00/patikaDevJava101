import java.util.Scanner;

public class GelismisHesapMakinesi {
    //https://app.patika.dev/courses/java101/pratik-hesap-mak-2
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz...");
        boolean isCon = true;
        Scanner sc = new Scanner(System.in);

        while (isCon){
            islemGoster();
            System.out.print("Yapmak istediğiniz işlemi seçiniz :"); int islem = sc.nextInt();
            switch (islem){
                case 1 : System.out.println(toplama()); break;
                case 2 : System.out.println(cikarma()); break;
                case 3 : System.out.println(carpma()); break;
                case 4 : System.out.println(bolme()); break;
                case 5 : System.out.println(ustAlma()); break;
                case 6 : System.out.println(faktoriyel()); break;
                case 7 : System.out.println(modAlma()); break;
                case 8 : alanCevre(); break;
                case 0 : isCon = false; System.out.println("Çıkış yapılıyor"); break;
                default: System.out.println("Hatalı bir değer giriniz lütfen tekrar deneyiniz.");
            }
        }
    }

    static void islemGoster(){
        System.out.println("1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap");
    }

    static int toplama(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç sayıyı toplamak istiyorsunuz :"); int n =  sc.nextInt();
        int toplam = 0;
        for(int i = 0; i<n; i++){
            System.out.println(i+1 + ".sayıyı giriniz :"); toplam += sc.nextInt();
        }
        return toplam;
    }
    static  int cikarma(){
        Scanner sc = new Scanner(System.in);
        int sayi, sayi2;
        System.out.println("1. sayiyi giriniz :"); sayi = sc.nextInt();
        System.out.println("2. sayiyi giriniz :"); sayi2 = sc.nextInt();
        return sayi-sayi2;
    }
    static int carpma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç sayıyı çarpmak istiyorsunuz :"); int n =  sc.nextInt();
        int carpim = 1;
        for(int i = 0; i<n; i++){
            System.out.println(i+1 + ".sayıyı giriniz :"); carpim *= sc.nextInt();
        }
        return carpim;
    }
    static  double bolme(){
        Scanner sc = new Scanner(System.in);
        int sayi, sayi2;
        System.out.println("1. sayiyi giriniz :"); sayi = sc.nextInt();
        System.out.println("2. sayiyi giriniz :"); sayi2 = sc.nextInt();
        return (double)sayi/(double) sayi2;
    }
    static int ustAlma(){
        Scanner sc = new Scanner(System.in);
        int sayi, sayi2;
        System.out.println("1. sayiyi giriniz :"); sayi = sc.nextInt();
        System.out.println("2. sayiyi giriniz :"); sayi2 = sc.nextInt();
        return (int)Math.pow((double)sayi,(double)sayi2);
    }
    static int faktoriyel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz :"); int n =  sc.nextInt();
        int carpim = 1;
        for(int i = 1; i<=n; i++){
            carpim *=i;
        }
        return carpim;
    }
    static int modAlma(){
        Scanner sc = new Scanner(System.in);
        int sayi, sayi2;
        System.out.println("1. sayiyi giriniz :"); sayi = sc.nextInt();
        System.out.println("2. sayiyi giriniz :"); sayi2 = sc.nextInt();
        return sayi%sayi2;
    }
    static void alanCevre(){
        Scanner sc = new Scanner(System.in);
        int sayi, sayi2;
        System.out.println("a kenarını giriniz :"); sayi = sc.nextInt();
        System.out.println("b kenarını giriniz :"); sayi2 = sc.nextInt();
        System.out.println("Çevresi :" + (sayi+sayi2)*2 + " Alanı :" + (sayi*sayi2));
    }

}
