import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın
    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isError = false;
        String errorM = "Hatalı Veri Girdiniz";
        int yas,yolculukTipi,girisHakki = 3;
        double km,toplamTutar;
        System.out.println("Hoşgeldiniz.");
        while (girisHakki > 0){
            System.out.println("Sırasıyla istenilen değerleri istenilen formatta giriniz.");
            System.out.print("Mesafe pozitif sayı olmalıdır.Km cinsinden giriniz. KM :"); km = sc.nextDouble();
            System.out.print("Lütfen yaşınızı giriniz :"); yas = sc.nextInt();
            System.out.print("Lütfen yolculuk tipinizi giriniz. 1-Tek Yön 2-Gidiş Dönüş :"); yolculukTipi = sc.nextInt();
            girisHakki--;
            if (yas<0 || km<0 || yolculukTipi <1 || yolculukTipi > 2 ) {
                isError = true;
                System.out.println(errorM);
                System.out.print("Sistemden çıkış yapmak istiyor musunuz ? y/n :"); sc.nextLine(); char control = sc.nextLine().charAt(0);
                if (control == 'y' || girisHakki <= 0){
                    System.out.println("Cevabınız hayır veya giriş hakkınız kalmadı. Cevabınız :" + control +" Giriş Hakkınız :" + girisHakki);
                    System.out.println("Çıkış yapılıyor...");
                    break;
                }
                else {
                    System.out.println("Bilgilerinizi doğru bir şekilde girmek için :" + girisHakki + " hakkınız kaldı.");
                }

            }
            else {
                toplamTutar = km*0.10*yolculukTipi;
                if(yas < 12){
                    toplamTutar -= (toplamTutar *50 /100);
                }
                else if (yas >= 12 && yas<=24) {
                    toplamTutar -= (toplamTutar *10 /100);
                }
                else if (yas > 65) {
                    toplamTutar -= (toplamTutar *30 / 100) ;
                }

                if (yolculukTipi == 2){
                    toplamTutar -= (toplamTutar *20 /100);
                }

                System.out.println("Toplam tutar :" + toplamTutar);
                break;
            }

        }

    }
}
