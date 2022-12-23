import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi,sayi2;
        double sonuc=1; // her sayının 0'ıncı kuvveti 1 olduğu için sonuc = 1 yaptık.
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen birinci sayiyi giriniz :"); sayi = sc.nextInt();
        System.out.print("Lütfen ikinci sayiyi giriniz :"); sayi2 = sc.nextInt();
        if(sayi == 0 && sayi2 == 0){
            System.out.println(sayi + " nın " + sayi2 + " nci kuvveti : Belirsizdir.");
        } else if(sayi2 >= 0){
            for (int i=0; i<sayi2; i++){
                sonuc *= sayi;
            }
            System.out.println(sayi + " nın " + sayi2 + " nci kuvveti :" + sonuc);
        } else {
            for (int i=0; i<Math.abs(sayi2); i++){ // negatif kuvvetler için mutlak değerini alıp döngümüzü aynı tuttuk.
                sonuc /= sayi;
            }
            System.out.println(sayi + " nın " + sayi2 + " nci kuvveti :" + sonuc);
        }

    }
}
