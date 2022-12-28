public class DizidekiElemanlarinOrtalamasiniBulanProgram {
    /*Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız. int[] numbers = {1, 2, 3, 4, 5};
      Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi*/
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;

        for (int i = 0; i<numbers.length; i++){
            sum += 1.0/(double)numbers[i];
        }
        System.out.println("Dizinin harmonik ortalaması :" + (double)numbers.length/sum);
    }
}
