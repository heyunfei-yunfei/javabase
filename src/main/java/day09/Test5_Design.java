package day09;
//本类用于设计老师类,面向抽象编程
public class Test5_Design {
    public static void main(String[] args) {
        Teacher t = new CGBTeacher();
        t.ready();
        t.teach();
        Teacher s = new SCDTeacher();
        s.teach();
        s.ready();
    }

}
//生活中的事物--类
//特征--属性,行为--方法
abstract class Teacher{
    int id;//工号
    String name;//姓名
    //备课方法,讲课方法
    public abstract void ready();
    public abstract void teach();
}
//属性:姓名 工号
//方法:备课,讲课
/*培优班老师CGB--主打电商项目*/
class CGBTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("正在备课...电商项目");
    }
    @Override
    public void teach() {
        System.out.println("正在授课...电商项目");
    }
}
/*SCD大数据老师--主打Scala语言*/
class SCDTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("正在备课....hadoop");
    }

    @Override
    public void teach() {
        System.out.println("正在授课....Scala语言");
    }
}