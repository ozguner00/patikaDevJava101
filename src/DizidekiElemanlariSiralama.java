import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
    // Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz :"); int n = sc.nextInt();
        int str[] = new int[n];
        elamanlariAl(n,str);
        sirala(str);
        yazdir(str);


    }

    public static void elamanlariAl(int n,int dizi[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<n; i++){
            System.out.print( (i+1) + ". elemanı giriniz :"); dizi[i] = sc.nextInt();
        }

    }
    public static void sirala(int dizi[]){
        int temp;
        for(int i=0; i< dizi.length; i++){
            for (int j = i; j< dizi.length; j++){
                if(dizi[i] > dizi[j]){
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
    }

    public static void yazdir(int dizi[]){
        for (int i : dizi) {
            System.out.print(i + " ");
        }
    }
}
