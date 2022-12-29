import java.util.Scanner;

public class SayiTahminOyunu {
    //Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyıkullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.

    public static void main(String[] args) {
        int sayi = (int) (Math.random() * 100);
        int girisHakki = 10;
        boolean isWin = false;
        System.out.println("Random üretilen sayi :" + sayi); // random sayıyı kontrol ediyoruz.
        System.out.println("Oyunun Kuralları;"
                        +"\n10 tahmin hakkınız bulunmaktadır."
                        +"\nHer yanlış tahmin 10 puan kaybettirir."
                        +"\nMax alabileceğiniz score 100'dür.");
        while (girisHakki > 0){
            if(sayi == tahminEt()){
                isWin = true;
                break;
            }
            girisHakki--;
        }

        if (isWin){
            System.out.println("Tebrikler...\n" + (11-girisHakki) + ". tahmininizde sayıyı tahmin ettiniz.");
            System.out.println("Score :" + girisHakki*10);
        }else {
            System.out.println("Game Over");
            System.out.println("Score :" + girisHakki*10);
        }
    }

    public static int tahminEt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("0-100 arası bir sayi tahmin ediniz :");
        return sc.nextInt();
    }
}
