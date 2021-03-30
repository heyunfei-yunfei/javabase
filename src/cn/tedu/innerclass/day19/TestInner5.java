package cn.tedu.innerclass.day19;

//本类用于测试匿名内部类
/*匿名内部类没有名字,通常结合着匿名对象一起使用*/
public class TestInner5 {


    public static void main(String[] args) {
        /*接口可以创建/实例化对象?*/
        //new Inner1();//接口不可以创建对象
        /**就相当于创建了一个接口的实现类+重写接口中的所有抽象方法**/
        new Inner1() {//3.1接口的实现类
            @Override
            public void get() {//3.2重写接口中的冲向方法get()
                System.out.println("我是Inner接口中的get()方法");
            }

            @Override
            public void save() {//3.3重写接口中的冲向方法save()
                System.out.println("我是Inner接口中的save()方法");
            }
        }.get();//3.3触发指定的重写后的方法
        /**注意:!!!匿名对象只能干一件事!!!只能调用一个!只能调用一次**/
        //*****************
        ///*相当于创阿金了抽象类的子类,并重写所有的抽象方法,普通方法没有要求*/
        new Inner2() {
            @Override
            public void eat() {
                System.out.println("我是Inner2抽象类中的eat()");
            }
        }.eat();
        System.out.println("***********");
        //创建普通类的匿名对象
        /*没有强制要求普通类生成匿名内部类的重写方法
         * 如果只要干一件事,那么创建匿名内部类对象,直接调用,简单方便*/
        new Inner3().hot();
        //如果想要使用同一个对象,做很多件事,必须给对象名字
        Inner3 i3 = new Inner3();


    }
}

interface Inner1 {
    //2定义接口中的抽象方法
    void get();

    void save();

    //JDK8以后可以提供普通方法
    public default void save2() {
    }

    public static void stave3() {
    }
}

//创建抽象类Inner2
abstract class Inner2 {
    abstract public void eat();

    public void play() {
        System.out.println("我是Inner2抽象类中的普通方法play()");
    }

}

class Inner3 {
    public void hot() {
        System.out.println("这么多主机,热死我了");
    }

    public void sleep() {
        System.out.println("睡什么睡,起来学习~");
    }
}