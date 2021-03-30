package day09;
//本类用于测试抽象类入门案例
public class Test2_AbstractDemo {
    public static void main(String[] args) {
        Animal a = new Pig();
        a.eat();//调用抽向父类的普通方法
        a.play();///////
        a.fly();//调用抽象父类的抽象方法,子类干活
        a.fly1();
        //new Animal();抽象类不可以创建对象(实例化):
    }
}
//创建父类
//被关键字abstract修饰的类称为抽象类
//如果一个类中包含抽象方法,那么这个类必须被声明成抽象类
abstract class Animal{
    public void eat(){
        System.out.println("吃啥都行");
    }
    public void play(){
        System.out.println("玩啥都行");
    }
    //没有方法体的方法叫做抽象方法,被关键字abstract修饰
    public abstract void fly();
    public abstract void fly1();
}
//创建子类
//当子类继承了抽象父类后,要么变成一个抽象子类,要么实现父类的所有抽象方法
//class Pig extends Animal{ 抽象子类(方案一)
//方案二:实现抽向父类中的所有抽象方法
class Pig extends Animal{
//    public abstract void fly(){
//        System.out.println("站在风口上的猪,都能飞起来");
//    }
    @Override//注解,相当于标记,标记这是一个重写的方法
    public void fly() {
        System.out.println("我把我爸的债还清了,我家的猪终于能飞了");
    }
    @Override
    public void fly1(){
        System.out.println("要重写,就都重写父类的所有抽象方法");
    }
}