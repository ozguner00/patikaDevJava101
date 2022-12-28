public class DizidekiElemanlarinFrekansi {
    //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
    //Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
    public static void main(String[] args) {
        int numbers[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int frekans[][] = new int[numbers.length][2];

        for(int i=0; i<numbers.length; i++){
            int count = 0;
            for (int j=0; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                }
                frekans[i][0] = numbers[i];
                frekans[i][1] = count;
            }
        }
        //matrisYazdir(frekans); //test amaçlı

        for(int i = 0; i<numbers.length; i++){
            if(i == numbers.length-1){ // son eleman kontrolü --> j=i+1 olduğu için son elemanı özel bir kontrol ile yazdırdık.
                System.out.println(frekans[i][0] + " sayısı " + frekans[i][1] + " kere tekrar etmiştir.");
                break;
            }
            for (int j=i+1; j < numbers.length; j++){ //kendinden sonra tekrar eden var mı diye kontrol eden döngü j=i+1 olduğu için son elemanı özel bir kontrol ile yazdırdık.
                if(numbers[i] == numbers[j]){
                    break;
                }
                if(numbers[i] != numbers[j] && j == numbers.length-1){
                    System.out.println(frekans[i][0] + " sayısı " + frekans[i][1] + " kere tekrar etmiştir.");
                }
            }
        }

    }

    public static void matrisYazdir(int str[][]){ //matris test
        for (int i[]: str){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
