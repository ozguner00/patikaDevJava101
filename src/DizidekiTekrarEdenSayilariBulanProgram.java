public class DizidekiTekrarEdenSayilariBulanProgram {
    //Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.

    public static void main(String[] args) {
        int list [] = {0,1,2,3,4,5,0,6,7,8,0,8,8,2,2,2,3,3,0,3};
        int dup [] = new int[list.length];
        int index = 0;
        boolean isZero = false;

        for (int i = 0; i<list.length; i++){
            for (int j = i+1; j<list.length; j++){
                if(list[i] == list[j]){
                    if(list[i] == 0){
                        isZero = true;
                    }
                    for (int k = 0; k<dup.length; k++){
                        if(dup[k] == list[i]){
                            break;
                        }else if (k == dup.length-1){
                            dup[index] = list[i];
                            index++;
                        }
                    }
                }
            }
        }

        if(isZero){
            System.out.print("0 ");
        }
        for(int i : dup){
            if(i!=0 && i%2 == 0)  System.out.print(i + " " );
        }

    }


}
