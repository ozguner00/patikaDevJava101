public class OBSCourse {
    OBSTeacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu; // Yeni özelliğimiz
    double notOrtalamasi; // Sözlü notu eklendiği için her dersin ortalaması note*0.8 + sözlü notu *0.2 olarak değişti.

    public OBSCourse(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNotu = 0;
        this.notOrtalamasi = 0;
    }

    public void addTeacher(OBSTeacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
