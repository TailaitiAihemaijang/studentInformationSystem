/**
 * ClassName: Teacher
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/5/2023 2:48 PM
 * @Version 1.0
 */
public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name,String branch,String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adi : " + this.name);
        System.out.println("Telfunu : " + this.mpno);
        System.out.println("Bolumu : " + this.branch);
    }
}
