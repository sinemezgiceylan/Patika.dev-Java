public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacherToCourse(Teacher teacher) {
        if(this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
        } else {
            System.out.println(teacher.name + "academician cannot teach this course!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Academician of " + this.name + " course: " + courseTeacher.name);
        } else {
            System.out.println(this.name + "course has no academician!");
        }
    }
}
