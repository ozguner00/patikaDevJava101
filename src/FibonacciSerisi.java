import java.util.Scanner;

public class FibonacciSerisi {
    //Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğiniz için sistemden çıkış yapılıyor..";
        int sayi,temp = 0,temp2 = 0,k;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Lütfen pozitif bir tam sayi giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0) System.out.println(errorMes);
        else {
            for (int i=0; i<sayi; i++){
                if(i==0){
                    temp = 0;
                    temp2 = 1;
                    System.out.print(temp + " ");
                }else {
                    k = temp2;
                    temp2 = temp + temp2;
                    temp = k;
                    System.out.print(temp + " ");
                }
            }
        }
    }
}
