package cn.tedu.innerclass.day19;

//本类用于测试内部类-内部类入门案例
public class TestInner1 {
    public static void main(String[] args) {
        //3.创建内部类对象,使用内部类的资源
        /*外部类名.内部类名,变量名=外部类对象.内部类对象*/
        Outer.Inner oi = new Outer().new Inner();

        //3.2调用方法与使用属性
        oi.get();
        System.out.println(oi.count);
        //3.3外部类使用与之前一样,直接创建对象调用即可
        new Outer().find();//创建匿名对象,调用外部类find();

    }
}

//1.创建外部类
class Outer {
    //定义外部类属性
    String name;
    private int age;

    //定义外部类成员方法
    public void find() {
        System.out.println("Outer.....find()....");
        //5.外部类中可以使用内部类的资源吗?
        /*外部类如果想要使用内部类的资源
        * 必须先创建内部类的对象,通过内部类对象进行访问*/
        Inner in = new Inner();//创建内部类对象
        System.out.println(in.count);
        in.get();
        //System.out.println(count);
        //get();
    }

    //2.创建成员内部类--可以理解成外部类的特殊成员
    /*内部类根据位置的不同和,分为两种:
     * 1.成员内部类(类里方法外)
     * 2.局部内部类(方法里)*/
    class Inner {
        //2.1定义内部类属性
        int count = 10;

        //2.2定义内部类方法
        public void get() {
            System.out.println("Inner...get()...");
            //4.内部类可使用外部类的资源吗?
            /*内部类可以使用外部类的资源,包括私有资源*/
            System.out.println(name);
            System.out.println(age);
            //find();
        }

    }
}