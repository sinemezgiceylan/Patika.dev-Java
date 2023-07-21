public class Main {
    public static void main(String[] args) {

        Course math = new Course("Mathematics", "Math101", "MATH");
        Course physics = new Course("Physics", "Pht101", "PHY");
        Course chemistry = new Course("Chemistry", "Che101", "CHE");

        Teacher teacher1 = new Teacher("Sinem Kara", "0950000000", "MATH");
        Teacher teacher2 = new Teacher("Ahmet ünsal", "0954000000", "PHY");
        Teacher teacher3 = new Teacher("Selen Işık", "0984000000", "CHE");

        math.addTeacherToCourse(teacher1);
        physics.addTeacherToCourse(teacher2);
        chemistry.addTeacherToCourse(teacher3);

        Student student1 = new Student("İlayda Korkmaz", "216205123",
                1, math, physics, chemistry);
        student1.addExamNoteToStudent(50,20,40);
        student1.isPass();

        Student student2 = new Student("Samet Arı", "215423156",
                2, math, physics, chemistry);
        student2.addExamNoteToStudent(100,50,40);
        student2.isPass();

        Student student3 = new Student("Kerem Başer", "216785463",
                3, math , physics, chemistry);
        student3.addExamNoteToStudent(80,80,80);
        student3.isPass();

    }
}