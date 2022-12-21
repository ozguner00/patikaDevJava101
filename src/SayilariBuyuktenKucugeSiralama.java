import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Hoşgeldiniz.");
        System.out.print("Lütfen 1.sayiyi(a) giriniz:"); a = sc.nextDouble();
        System.out.print("Lütfen 2.sayiyi(b) giriniz:"); b = sc.nextDouble();
        System.out.print("Lütfen 3.sayiyi(c) giriniz:"); c = sc.nextDouble();

        if (a == b || a == c || b == c){
            System.out.println("Sayılardan en az ikisi eşit girilmiş.");
            System.out.println("Sonra girilen sayı büyük sayı olarak kabul edilir.");
            System.out.println("Örnek/ a = 3 b = 3 c = 3 çıktı olarak : c > b > a sonucunu verir.");
            System.out.println("***************************");
        }

        if(a > b && a > c){ // a sayısının en büyük olma durumu
            if (b > c){
                System.out.println("a > b > c");
            } else{
                System.out.println("a > c > b");
            }
        } else if (b > a && b > c) { // b sayısının en büyük olma durumu
            if (a > c){
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        }else { // c sayısının en büyük olma durumu
            if (a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }


    }
}
