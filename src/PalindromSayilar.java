import java.util.Scanner;

public class PalindromSayilar {
    //Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
    //Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır. Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğniiz için sistemden çıkış yapılıyor..";
        int sayi;
        double temp;
        boolean isPalindrom = true;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        temp = sayi;
        if(sayi <= 0) System.out.println(errorMes);
        else {
            int k = 0; // k = basamak sayısı
            while (temp >= 1){ //basamak sayısını bulan döngü.
                temp /= 10;
                k++;
            }
            int temp2 = sayi;
            while (k>1){
              isPalindrom = ilkSon(temp2,k);
              if (isPalindrom){
                  temp2 -= (temp2/(int) Math.pow(10,k-1))*((int) Math.pow(10,k-1));
                  temp2 -= temp2%10;
                  temp2 /=10;
                  k-=2;
              }else {
                  break;
              }
            }

            if (isPalindrom){
                System.out.println(sayi + " Palindrom Sayıdır. ");
            } else {
                System.out.println(sayi + " Palindrom Sayı Değildir. ");
            }

            }

        }
    public static boolean ilkSon(int sayi, int basamak) {

        if(sayi%10 == sayi/(int) Math.pow(10,basamak-1)){
            return  true;
        }else {
            return false;
        }
    }
    }


