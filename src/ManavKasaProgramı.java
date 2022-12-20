import java.util.Scanner;

public class ManavKasaProgramı {
    /* Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
       değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

       Meyveler ve KG Fiyatları
       Armut : 2,14 TL  Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00 TL*/
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz.");
        System.out.println("Lütfen hangi meyveden kaç kg aldığınızı sırayla giriniz:");
        Scanner sc = new Scanner(System.in);
        double armut,elma,domates,muz,patlıcan,tutar;
        System.out.print("Elma :"); elma = sc.nextDouble();
        System.out.print("Domates :"); domates = sc.nextDouble();
        System.out.print("Armut :"); armut = sc.nextDouble();
        System.out.print("Muz :"); muz = sc.nextDouble();
        System.out.print("Patlıcan :"); patlıcan = sc.nextDouble();
        tutar = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlıcan*5.00);
        System.out.println("Toplam tutar :" + tutar);

    }
}
