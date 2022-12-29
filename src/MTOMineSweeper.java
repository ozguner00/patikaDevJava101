import java.util.Scanner;

public class MTOMineSweeper {
    int satirSay,sutunSay,mayinSayisi ;
    int tarla[][];
    String kullaniciArayuz[][];

    public MTOMineSweeper(int satirSay, int sutunSay) {
        this.satirSay = satirSay;
        this.sutunSay = sutunSay;
    }
    public MTOMineSweeper() {
    }

    public void satirSayAl(){
        System.out.println("Satır sayısınız giriniz :");
        Scanner sc = new Scanner(System.in);
        this.satirSay = sc.nextInt();
    }
    public void sutunSayAl(){
        System.out.println("Sutun sayısınız giriniz :");
        Scanner sc = new Scanner(System.in);
        this.sutunSay = sc.nextInt();

    }

    public void run(){
        kuralYazdir();
        satirSayAl();
        sutunSayAl();
        tarlaOlustur();
        mayinYerlestir();
        //tarlaYazdir(); //kontrol amaçlı mayınları görmek için
        //System.out.println("-----------------------------");
        sayilariYerlestir();
        //tarlaYazdir(); //kontrol amaçlı tarlanın oyun önceki hali
        oyna();
    }

    public void kuralYazdir(){ // Oyun kuralları yazılacak.
        System.out.println("Hoşgeldiniz.");
        System.out.println("Kuralllar;"
                        +"\nSatır ve sütun değerleri girip mayına yakalanmamalısınız.");
    }

    public void tarlaOlustur(){ //boş oyun tarlası oluşturur.
        this.tarla = new int[this.satirSay][this.sutunSay];
        this.kullaniciArayuz = new String[this.satirSay][this.sutunSay];
        for (int i = 0; i < this.kullaniciArayuz.length; i++){
            for(int j = 0; j < this.kullaniciArayuz[0].length; j++ ){
                kullaniciArayuz[i][j] = "_";
            }
        }
    }

    public void mayinYerlestir(){ //mayınları rastgele yerleştirir.
        this.mayinSayisi = (this.satirSay*this.sutunSay) /4;
        int temp = this.mayinSayisi;

        while (temp>0){
            int r = (int) (Math.random() * (satirSay*sutunSay)) ;
            for (int i = 0; i < this.tarla.length; i++){
                for(int j = 0; j < this.tarla[0].length; j++ ){
                    r--;
                    if(r==0 && tarla[i][j] != 9){
                        tarla[i][j] = 9;
                        temp --;
                    }
                }
            }

        }

    }

    public void sayilariYerlestir(){ //mayın çevresi
        for (int i = 0; i < this.tarla.length; i++){
            for(int j = 0; j < this.tarla[0].length; j++ ){
                if(!isNotMayin(i,j)){
                    ekle(i,j);
                }
            }
        }
    }

    public boolean isRow(int n){ // sınır kontrolü
        if(n >= 0 && n<this.tarla.length) return true;
        else return false;
    }
    public boolean isCol(int n){ // sınır kontrolü
        if(n >= 0 && n<this.tarla[0].length) return true;
        else return false;
    }
    public boolean isNotMayin(int i,int j){
        if(this.tarla[i][j] != 9){
            return true;
        }
        else return false;
    }
    public void ekle(int a, int b){ //mayının çevresine +1 ekler
        for(int i = a-1; i<=a+1; i++){
            for(int j = b-1; j<=b+1; j++){
                if(isRow(i) && isCol(j) && isNotMayin(i,j)){
                    this.tarla[i][j] ++;
                }
            }
        }
    }
    public void tarlaYazdir(){ //kontrol amaçlı tarlanın oynanmadan önceki hali
        for (int str[]: this.tarla){
            for (int j: str){
                if(j == 9) System.out.print("* ");
                else System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void oyna(){
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        while (game){
            yazdirKullaniciArayuz();
            System.out.print("Satır değerini giriniz :"); int i = sc.nextInt();
            System.out.print("Sutun değerini giriniz :"); int j = sc.nextInt();
            if(isRow(i) && isCol(j)){
                if(!isNotMayin(i,j)){
                    System.out.println("Game Over");
                    tarlaYazdir();
                    break;
                }
                else {
                    this.kullaniciArayuz[i][j] = Integer.toString(this.tarla[i][j]) ;
                    if(isWin()){
                        System.out.println("Tebrikler kazandınız.");
                        tarlaYazdir();
                        break;
                    }
                }
            }
            else {
                System.out.println("Oyun sınırları dışına çıktınız lütfen tekrar giriniz.");
            }
        }

    }

    public boolean isWin(){
        int count = 0;
        for(String[] str : kullaniciArayuz){
            for (String s : str){
                if(s == "_"){
                    count ++;
                }
            }
        }
        if (count == mayinSayisi){
            return true;
        }else return false;
    }
    public void yazdirKullaniciArayuz(){
        for (String str[]: this.kullaniciArayuz){
            for (String j: str){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
