import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ATMProjesi {
    //Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız. https://youtu.be/UN5xIYKFCfA

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username,password;
        boolean giris = false;
        String errorM = "Eksik veya hatalı tuşladınız. Lütfen tekrar deneyiniz.";
        String islemler = "1-Bakiye Sorgulama\n"
                        + "2-Para Yatırma\n"
                        + "3-Para Çekme\n"
                        + "4-İşlemleri görüntüleme\n"
                        + "5-Çıkış";

        int girisHakki = 3;
        int bakiye = 1500;
        System.out.println("Hoşgeldiniz...");
        while (girisHakki>0){
            System.out.print("Kullanıcı adınız :"); username = sc.nextLine();
            System.out.print("Şifreniz :"); password = sc.nextLine();
            if (giris = girisKontrol(username,password)){
                System.out.println("Hoşgeldiniz.");
                break;
            }
            else {
                girisHakki--;
                System.out.println(errorM);
                System.out.println("Kalan giriş hakkınız :" + girisHakki);
            }

        }

        while (giris){
            System.out.println(islemler);
            int islem = 0;
            System.out.print("Lütfen yapamk istediğiniz işlemi seçiniz :"); islem = sc.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Bakiyeniz" + bakiyeSorgulama(bakiye)); break;
                case 2: {
                    System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz :");
                    bakiye = paraYatirma(bakiye,sc.nextInt());
                    System.out.println("Bakiyeniz :" + bakiye);
                    break;
                }
                case 3:{
                    System.out.print("Lütfen çekmek istediğiniz tutarı giriniz :"); int cekim = sc.nextInt();
                    if (paraCekme(bakiye,cekim) > 1){
                        bakiye = paraCekme(bakiye,cekim);
                        System.out.println("Kalan bakiyeniz :" +bakiye);
                    }else {
                        System.out.println(errorM);
                    }
                    break;

                }
                case 4:System.out.println(islemler); break;
                case 5:System.out.println("Çıkış Yapılıyor..."); giris = false; break;
                default:System.out.println(errorM); System.out.println(islemler);

            }
        }


    }

    static int paraCekme(int bakiye, int tutar){
        if(tutar > bakiye) return -1;
        else return bakiye-tutar;
    }
    static int paraYatirma(int bakiye, int tutar){
        return bakiye+tutar;
    }
    static int bakiyeSorgulama(int bakiye){
        return bakiye;
    }
    static boolean girisKontrol(String username, String password){
        String defaultUsername = "username";
        String defaultPassword = "pass123";
        if(username.equals(defaultUsername) && password.equals(defaultPassword)) return true;
        else return false;
    }

}
