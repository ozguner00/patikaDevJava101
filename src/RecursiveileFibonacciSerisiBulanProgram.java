import java.util.Scanner;

public class RecursiveileFibonacciSerisiBulanProgram {
    //Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
    //1 1 2 3 5 8 13 21 f(1) = 1 f(2) = 1 f(3) = f(2) + f(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String errorMes = "Pozitif bir tamsayi girmediğniiz için sistemden çıkış yapılıyor..";
        int sayi;
        System.out.println("Hoşgeldiniz..");
        System.out.print("Fibonacci serisindeki kaçıncı elemanı öğrenmek istiyorsanız giriniz :"); sayi = sc.nextInt();
        if(sayi <= 0) System.out.println(errorMes);
        else {
            System.out.println("Fibonacci Serisindeki " + sayi +".elaman :" + fibonacci(sayi) );
        }
    }

    static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
