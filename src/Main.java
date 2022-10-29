public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT",30);
        Course fizik = new Course("Fizik", "FZK101", "FZK",20);
        Course kimya = new Course("Kimya", "KMY101", "KMY",40);

        Teacher t1 = new Teacher("Mahmut Emiroğlu", "90550000000", "MAT");
        Teacher t2 = new Teacher("Burak Kemal", "90550000001", "FZK");
        Teacher t3 = new Teacher("Selim Sayın", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali Demir", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,60,40);
        s1.addBulkVerbalNote(60,90,40);
        s1.isPass();

        Student s2 = new Student("İlkay Metin", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkVerbalNote(60,40,80);
        s2.isPass();

        Student s3 = new Student("Başak Köse", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkVerbalNote(70,40,30);
        s3.isPass();

        Student s4 = new Student("Nedim Ertit",4,"12321323",mat,fizik,kimya);

        s4.addBulkExamNote(70,80,64);
        s4.addBulkVerbalNote(40,50,80);
        s4.isPass();


    }
}
