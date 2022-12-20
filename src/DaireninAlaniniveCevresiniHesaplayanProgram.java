import java.util.Scanner;

public class DaireninAlaniniveCevresiniHesaplayanProgram {
    /*
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz...");
        Scanner sc = new Scanner(System.in);
        double alan,yaricap,aci;
        System.out.print("Lütfen yarıçap uzunluğunu giriniz :");
        yaricap = sc.nextDouble();
        System.out.print("Lütfen \uD835\uDEFC(alfa) açısını giriniz:");
        aci = sc.nextDouble();

        alan = (Math.PI * yaricap * yaricap * (aci/360));
        System.out.println("Girdiğiniz daire diliminin alanı :" + alan);

    }
}
