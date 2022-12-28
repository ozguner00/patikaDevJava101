public class OBSStudent {
    String name,stuNo;
    int classes;
    OBSCourse mat;
    OBSCourse fizik;
    OBSCourse kimya;
    double avarage;
    boolean isPass;


    OBSStudent(String name, int classes, String stuNo, OBSCourse mat,OBSCourse fizik,OBSCourse kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkSozluNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.sozluNotu = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozluNotu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozluNotu = kimya;
        }

    }
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void dersCalcAvarage() { // ders ortalamasını bulduk tek tek.
        this.mat.notOrtalamasi = mat.note*0.8+ mat.sozluNotu*0.2;
        this.fizik.notOrtalamasi = fizik.note*0.8+ fizik.sozluNotu*0.2;
        this.kimya.notOrtalamasi = kimya.note*0.8+ kimya.sozluNotu*0.2;
    }
    public void calcAvarage() { // Genel ortalamayı bulmak için not yarine not ortalaması kullandık.
        this.avarage = (this.fizik.notOrtalamasi+this.kimya.notOrtalamasi+this.mat.notOrtalamasi)/3;
    }

    public boolean isCheckPass() {
        dersCalcAvarage(); // calc Avarege çalışmadan önce not her dersin ortalamasını hesaplamalıyız.
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){ //öğrenci notunu artık not*0.8+sözlü notu*0.2 olarak not ortalamsı değişkeninde tutuyoruz.
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.notOrtalamasi);
        System.out.println("Fizik Notu : " + this.fizik.notOrtalamasi);
        System.out.println("Kimya Notu : " + this.kimya.notOrtalamasi);
    }
}
