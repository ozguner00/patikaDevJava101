import java.util.Scanner;

public class PalindromikKelimleriBulanProgram {
    //Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
    //Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
    //Örnek : abba , asa , kavak, kayak

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz :"); String str = sc.nextLine();
        if (isPalidnrom(str)){
            System.out.println(str + "-->Palindromik kelimedir.");
        }else {
            System.out.println(str + "-->Palindromik kelime değildir.");
        }
    }

    public static boolean isPalidnrom(String str){
        String str2 = "";
        for (int i=str.length()-1; i>=0; i--){
            str2 += str.charAt(i);
        }
        for(int i=0; i<str.length(); i++){
            if (str2.charAt(i) == str.charAt(i) && i == str.length()-1){
                return true;
            }
        }
        return false;
    }
}
