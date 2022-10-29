public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double examNotePercentage;
    double verbalNotePercentage;

    public Course(String name, String code, String prefix,double verbalNotePercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        this.verbalNotePercentage = verbalNotePercentage;
        this.examNotePercentage = 100 - verbalNotePercentage;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
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