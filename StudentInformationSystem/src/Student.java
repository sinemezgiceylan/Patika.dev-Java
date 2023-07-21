import java.util.logging.SocketHandler;

public class Student {

    String name;
    String studentNumber;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    public Student(String name, String studentNumber, int classes, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.isPass = false;
        calculateAverage();

    }

    public void addExamNoteToStudent(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    public  void calculateAverage() {
        this.average = (this.math.note + this.physics.note + this.chemistry.note) / 3;
    }

    public boolean isCheckPass() {
        calculateAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("-----------------------");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.note);
        System.out.println("Physics Note : " + this.physics.note);
        System.out.println("Chemistry Note : " + this.chemistry.note);
    }

    public void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Average " + this.average);
        if (this.isPass) {
            System.out.println("Passed the class!");
        } else {
            System.out.println("Failed the class!");
        }
    }
}
