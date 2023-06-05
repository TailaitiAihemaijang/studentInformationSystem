/**
 * ClassName: Mian
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/5/2023 2:46 PM
 * @Version 1.0
 */
public class Mian {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "533646464");
        Teacher t2 = new Teacher("Mehmet","FZK","555111222");
        Teacher t3 = new Teacher("Mevlan","MUS","7778844");
        Course tarih = new Course("Tarik", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course music = new Course("Music","103","MUS");
        music.addTeacher(t3);
        Student s1 = new Student("Ahmed","000","4",tarih,fizik,music);
        s1.addBulkExamNote(100,74,95);
        s1.isPass();
    }
}