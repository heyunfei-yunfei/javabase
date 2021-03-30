package day08;
//本类用于测试静态的入门案例
public class Test_Static1 {
    public static void main(String[] args) {
        //静态资源可以通过类名直接调用
        //通过类名直接调用静态资源进行测试
        //静态资源是优先于对象进行加载的,随着类的加载而加载
        //比对象先加载进入内存,没对象时也可以被类名直接调用
        System.out.println(Student.name);
        Student.study();
        Student s = new Student();
        //更改并查看name属性的值
        s.name = "黄桃罐头";
        System.out.println(s.name);
        //调用学生类的方法
        s.study();
        s.speak();
        //创建多个对象进行测试
        Student s1 = new Student();
        //静态全局共享
        s1.name = "草莓罐头";
        System.out.println(s1.name);
        System.out.println(Student.name);
    }
}
//封装一个Student类
class Student{
    //可以通过static关键字将普通资源修饰成静态资源
    //static可以用来修饰成员变量和方法,一般写在权限修饰符之后
    //定义属性--成员变量--无需手动初始化
    int sno;
    static String name;
    //定义方法--修饰符 返回值类型 方法名(参数列表){方法体}
    public static void study(){
        System.out.println("别闹学java呢");
    }
    public void speak(){
        System.out.println("大声说出来");
    }
}
