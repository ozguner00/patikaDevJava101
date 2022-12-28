//https://app.patika.dev/courses/java101/pratik-obs
public class OBSMain {
    public static void main(String[] args) {
        OBSCourse mat = new OBSCourse("Matematik", "MAT101", "MAT");
        OBSCourse fizik = new OBSCourse("Fizik", "FZK101", "FZK");
        OBSCourse kimya = new OBSCourse("Kimya", "KMY101", "KMY");

        OBSTeacher t1 = new OBSTeacher("Mahmut Hoca", "90550000000", "MAT");
        OBSTeacher t2 = new OBSTeacher("Fatma Ayşe", "90550000001", "FZK");
        OBSTeacher t3 = new OBSTeacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        OBSStudent s1 = new OBSStudent("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        OBSStudent s2 = new OBSStudent("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        OBSStudent s3 = new OBSStudent("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

        OBSStudent s4 = new OBSStudent("Özgür güner", 4,"181818",mat,kimya,fizik);
        s4.addBulkExamNote(80,80,25);
        s4.addBulkSozluNote(20,35,50);
        s4.isPass();

    }
}
