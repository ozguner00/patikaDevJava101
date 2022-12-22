import java.util.Scanner;

public class BurcBulanProgram {

    // ÖDEV : Switch-case kullanmadan kullanıcıdan ayı ve günü alarak burç bulan program yapınız.

    //İlk önce her burcun yılın hangi gününe denk geldiğini bulduk.
    //Sonra her ayı 30 kabul edip günleri düzenledik.
    //Aradaki farklardan herhangi bir gününde burç çakışmadığı için direkt olarak kullandık. ( Her ay 30 gün kabul edersek burçlarımız değişmez.)

    /*
    Koç Burcu : 21 Mart - 20 Nisan          80-110 - 81-110
    Boğa Burcu : 21 Nisan - 21 Mayıs        111-141 - 111-141
    İkizler Burcu : 22 Mayıs - 22 Haziran   142-173 - 142-172
    Yengeç Burcu : 23 Haziran - 22 Temmuz   174-203 - 173-202
    Aslan Burcu : 23 Temmuz - 22 Ağustos    204-234 - 203-232
    Başak Burcu : 23 Ağustos - 22 Eylül     235-265 - 233-262
    Terazi Burcu : 23 Eylül - 22 Ekim       266-295 - 263-292
    Akrep Burcu : 23 Ekim - 21 Kasım        296-325 - 293-321
    Yay Burcu : 22 Kasım - 21 Aralık        326-355 - 322-351
    Oğlak Burcu : 22 Aralık - 21 Ocak       356-21 - 352-381
    Kova Burcu : 22 Ocak - 19 Şubat         22-50 - 22-49
    Balık Burcu : 20 Şubat - 20 Mart        51-79 - 50-80
    */

    public static void main(String[] args) {
        int ay,gun,burcGunu;
        String burc, errorM = "Girdiğiniz değerlerden en az 1 tanesi hatalı.";
        Scanner sc = new Scanner(System.in);

        System.out.println("Hoşgeldiniz.Burcunuzu bulabilmem için ay ve gün cinsinden doğum tarihinizi giriniz.");

        //while (true){ // Kontrol amaçlı hazır while döngüsü.
        System.out.print("Ay :"); ay = sc.nextInt();
        System.out.print("Gün :"); gun = sc.nextInt();
        burcGunu = (ay-1)*30+gun; //Ayı 30 gün kabul edip burcumuzun hangi güne denk geldiğini bulduk.
        if ( ay<1 || ay>12 || gun<1 || gun>31 ) {
                System.out.println(errorM);
            }
        else {
            if(burcGunu >= 22 && burcGunu <=49 ) burc = "Kova";
            else if(burcGunu >= 50 && burcGunu <=80 ) burc = "Balık";
            else if(burcGunu >= 81 && burcGunu <=110 ) burc = "Koç";
            else if(burcGunu >= 111 && burcGunu <=141 ) burc = "Boğa";
            else if(burcGunu >= 142 && burcGunu <=172 ) burc = "İkizler";
            else if(burcGunu >= 173 && burcGunu <=202 ) burc = "Yengeç";
            else if(burcGunu >= 203 && burcGunu <=232 ) burc = "Aslan";
            else if(burcGunu >= 233 && burcGunu <=262 ) burc = "Başak";
            else if(burcGunu >= 263 && burcGunu <=292 ) burc = "Terazi";
            else if(burcGunu >= 293 && burcGunu <=321 ) burc = "Akrep";
            else if(burcGunu >= 322 && burcGunu <=351 ) burc = "Yay";
            else burc = "Oğlak";

            System.out.println("Burcunuz :" + burc);}
        //Kontrol amaçlı hazır while döngüsü. }




    }



}
