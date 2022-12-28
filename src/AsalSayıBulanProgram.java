import java.util.Scanner;

public class AsalSayıBulanProgram {
    //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.print("Lütfen bir sayı giriniz :"); int sayi = sc.nextInt();
        final int bolen = 2;

        if (asalSayi(sayi,bolen)){
            System.out.println(sayi + " Asal sayıdır");
        }else {
            System.out.println(sayi + " Asal sayı değildir.");
        }
    }
    static boolean asalSayi(int n,int x){
        if (n < 2){
            return false;
        }
        if(n%x != 0 && x>=n/2){
            return true;
        }else {
            if (n%x == 0 ){
                return false;
            }else {
                return asalSayi(n,x+1);
            }
        }
    }
}

