public class MatrisTranspozunuBulma {
    //Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
    public static void main(String[] args) {
        int[][] matris  = {{2,3},{5,6},{10,11}};
        matrisYazdir(matris);
        int[][] transpoze = new int[matris[0].length][matris.length];

        for (int i=0; i< matris.length; i++){
            for (int j=0; j< matris[0].length; j++){
                transpoze[j][i] = matris[i][j];
            }
        }
        System.out.println("*************************");
        matrisYazdir(transpoze);

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
