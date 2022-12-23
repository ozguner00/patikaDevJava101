import java.util.Scanner;

public class CinZodyagiHesaplama {
    /*
    Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
    Çin Zodyağı nasıl hesaplanır?
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil;
        String cinZodyak = null;
        System.out.println("Hoşgeldiniz.");
        System.out.print("Lütfen doğum yılınızı giriniz: "); yil = sc.nextInt();
        switch (yil%12) {
            case (0) : cinZodyak = "Maymun"; break;
            case (1) : cinZodyak = "Horoz"; break;
            case (2) : cinZodyak = "Köpek"; break;
            case (3) : cinZodyak = "Domuz"; break;
            case (4) : cinZodyak = "Fare"; break;
            case (5) : cinZodyak = "Öküz"; break;
            case (6) : cinZodyak = "Kaplan"; break;
            case (7) : cinZodyak = "Tavşan"; break;
            case (8) : cinZodyak = "Ejderha"; break;
            case (9) : cinZodyak = "Yılan"; break;
            case (10) : cinZodyak = "At"; break;
            case (11) : cinZodyak = "Koyun"; break;
        }

        System.out.println("Çin zodyağınız : " + cinZodyak);
    }
}
