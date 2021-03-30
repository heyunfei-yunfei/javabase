package day09;
//本类用于测试抽象类中构造函数的用法
/*
* 总结:
* 抽象类中可以有构造方法
* 父类的构造方法要优先与子类执行
* 抽象类不可以创建对象(实例化)
* 抽象类中存在的构造方法不是为了创建本类对象时调用
* 而是为了创建子类对象时使用*/
public class Test3_Abstract2 {
    public static void main(String[] args) {
        Animal2 a = new Pig2();
        //Animal2 a1 = new Animal2();抽象类不可以创建对象(实例化)

    }
}
abstract class Animal2{
    //抽象父类的构造方法
    public Animal2(){//如果此处传参,默认的无参构造会被覆盖
        System.out.println("我是Animal2的构造方法");
    }
}
class Pig2 extends Animal2{
//创建子类的无参构造,无参构造默认存在
    public Pig2(){
        super();//隐藏着super();,先访问父类的构造方法,再执行自己的
        System.out.println("我是Pig3的构造方法");
    }
}
