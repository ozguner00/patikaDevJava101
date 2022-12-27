public class Biri100ArasindakiAsalSayilariBulanProgram {
    //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
    public static void main(String[] args) {
        boolean isAsal = true;
        for (int i=2; i<100; i++){
            isAsal = true;
            for (int j=2; j<i/2+1; j++){
                if (i%j == 0){
                    isAsal = false;
                    break;
                }
            }
            if (isAsal){
                System.out.print(i + " ");
            }
        }
    }
}
