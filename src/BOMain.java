public class BOMain {
    public static void main(String[] args) {
        BOFighter marc = new BOFighter("Marc" , 15 , 100, 90, 0);
        BOFighter alex = new BOFighter("Alex" , 10 , 95, 100, 0);
        BORing r = new BORing(marc,alex , 90 , 100);
        r.run();
    }

}
