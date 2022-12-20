import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz.");

        while (true){
            System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");
            double a,b,c;
            System.out.print("a kenarı:"); a = sc.nextDouble();
            System.out.print("b kenarı:"); b = sc.nextDouble();
            System.out.print("c kenarı:"); c = sc.nextDouble();
            //üçgen oluşturma kuralı kontrolü - bir üçgenin iki kenar uzunluğunun toplamı daima üçüncü kenardan daha büyük olmalı
            if((a+b) > c & (a+c) > b & (b+c) > a ){
                 /*
                    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
                    𝑢 = (a+b+c) / 2
                    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
                 */
                System.out.println("Alan hesaplanıyor. Lütfen bekleyiniz.");
                double u = (a+b+c)/2;
                double alan = Math.sqrt(u * ( u-a) * (u-b) * (u-c));
                System.out.println("Girdiniğiniz üçgenin alanı :" + alan );
                break;
            }
            else {
                System.out.println("Girdiğiniz uzunluklar üçgen oluşturma kuralını sağlamamaktadır.");
                System.out.println("Üçgen oluşturma kuralı : Bir üçgenin iki kenar uzunluğunun toplamı daima üçüncü kenardan daha büyük olmalı");
            }
        }




    }
}
