package cn.tedu.design.day17;
//本类用于练习
public class SingletonTest {
    public static void main(String[] args) {
        Teacher t = Teacher.getT();
        Teacher t2 = Teacher.getT();
        System.out.println(t==t2);
    }
}
class Teacher{
    private Teacher() {
    }
    private static Teacher t = new Teacher();
    public static Teacher getT(){
        return t;
    }
}
class Student{
    private Student() {
    }
    private Student s;
    public Student getS(){
        if (s==null){
            s = new Student();
        }
        return s;
    }
}
