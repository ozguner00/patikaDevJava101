public class BORing {
    BOFighter f1;
    BOFighter f2;
    int minWeight;
    int maxWeight;

    public BORing(BOFighter f1, BOFighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if(isF1Attack()){ // f1 mi başlayacak true ise f1 attack önce
                    if (f1Attack()) break;
                    if (f2Attack()) break;
                }else { //false ise f2 attack önce
                    if (f2Attack()) break;
                    if (f1Attack()) break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }

    }
    public boolean isF1Attack(){ // %50 ihtimal ile f1 mi başlayacak.
        if((int)(Math.random()*100)%2 == 1){
            return true;
        }else return false;
    }
    public boolean f1Attack(){ //f1 attack
        f2.health = f1.hit(f2);
        return isWin();
    }
    public boolean f2Attack(){ //f2 attack
        f1.health = f2.hit(f1);
        return isWin();
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
