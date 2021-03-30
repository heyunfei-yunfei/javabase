package day10;
//本类用于老师改造设计案例,采用面向接口编程
public class Test3_DesignInter {
    public static void main(String[] args) {
        CGBTeacher ct = new CGBTeacher();
        ct.ready();
        ct.teach();
        Teacher t = new CGBTeacher();
        ct.teach();
        ct.ready();

    }
}
//抽取共性,形成抽象层-体现接口--定义的是规则
//通过interface关键字定义接口
interface Teacher{
    //接口中的方法都是抽象方法,可以简写public abstract
    //定义接口抽象方法
    void ready();
    void teach();
}
//如果实现类想要实现接口的功能,就需要与接口建立实现关系
//创建接口的实现类并添加所有未实现的方法
class  CGBTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("正在上课电商项目");
    }
    @Override
    public void ready() {
        System.out.println("正在备课电商项目");
    }

}
//创建接口的抽象子类
abstract class SCDTeacher implements Teacher{
}
abstract class ACTTeacher implements Teacher{
    @Override
    public void ready() {
        System.out.println("正在备课...基础加强...框架加强...高新技术");
    }
    public abstract void teacher();
}