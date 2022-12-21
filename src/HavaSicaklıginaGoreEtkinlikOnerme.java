import java.util.Scanner;

public class HavaSicaklıginaGoreEtkinlikOnerme {
    /*Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    Ödev
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz. https://youtu.be/FGYoUQLMpT8*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sicaklik;
        System.out.print("Hoşgeldiniz. Lütfen sicaklik değerini giriniz :"); sicaklik = sc.nextDouble();
        if(sicaklik < 5){
            System.out.println("Hava 'Kayak' için oldukça uygun.");
        } else if (sicaklik >= 5 && sicaklik < 15 ) {
            System.out.println("Hava 'Sinema' için oldukça uygun.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Hava 'Piknik' için oldukça uygun.");
        }else System.out.println("Hava 'Yüzmek' için oldukça uygun.");
    }
}
