/**
 * ClassName: Course
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/5/2023 2:59 PM
 * @Version 1.0
 */
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("ogretmen ve ders bolumu eslesmedi!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}