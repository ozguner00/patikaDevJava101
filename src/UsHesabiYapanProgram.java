import java.util.Scanner;

public class UsHesabiYapanProgram {
    //Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi,sayi2;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen sayiyi giriniz :"); sayi = sc.nextInt();
        System.out.print("Lütfen üstü giriniz :"); sayi2 = sc.nextInt();
        if(sayi == 0 && sayi2 == 0){
            System.out.println(sayi + " nın " + sayi2 + " nci kuvveti : Belirsizdir.");
        } else if(sayi2 >= 0){
            System.out.println(ustHesabiP(sayi,sayi2));
        } else {
            System.out.println(ustHesabiN(sayi,sayi2));
        }
    }
    static int ustHesabiP(int n,int ust){
        if(ust == 0){
            return 1;
        }else {
            return n * ustHesabiP(n,ust-1);
        }
    }

    static double ustHesabiN(int n,int ust){
        if(ust == 0){
            return 1;
        }else {
            return (1.0/n)*(ustHesabiN(n,ust+1)) ;
        }
    }
}
