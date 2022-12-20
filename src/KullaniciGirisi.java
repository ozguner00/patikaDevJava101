import java.util.Scanner;

public class KullaniciGirisi {
    /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
     şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

    public static void main(String[] args) {
        String username,password,passwordNew; // default username = username default password = pass123
        char a; boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.print("Lütfen kullanıcı adını giriniz :"); username = sc.nextLine();
        System.out.print("Lütfen şifrenizi giriniz :"); password = sc.nextLine();
        if(username.equals("username") && password.equals("pass123")){
            System.out.println("Başarılı bir şekilde giriş yaptınız...");
        }
        else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış.");
            while (check){
                System.out.print("Şifrenizi değiştirmek ister misiniz? (y/n)"); a = sc.nextLine().charAt(0);
                switch (a){
                    case 'y' :
                        System.out.print("Lütfen yeni şifrenizi giriniz:"); passwordNew = sc.nextLine();
                        if (passwordNew.equals("pass123") || passwordNew.equals(password)){
                            System.out.println("Şifreniz eski şifreniz ile aynı olamaz. Üst menüye aktarılıyorsunuz.");
                        }
                        else {
                            System.out.println("Yeni şifreniz başarılı bir şekilde oluşturuldu.");
                            System.out.println("Çıkış yapılıyor...");
                            check = false;
                            break;
                        }
                        break;
                    case 'n':
                        System.out.println("Çıkış yapılıyor..");
                        check = false;
                        break;
                    default:
                        System.out.println("Hatalı işlem seçtiniz. Üst menüye aktarılıyorsunuz.");
                }
            }

        }



    }
}
