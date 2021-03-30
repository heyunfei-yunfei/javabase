package day09;
//本类用于测试抽象类当中的成员
public class Test4_Abstract3 {
    public static void main(String[] args) {
        //创建多态对象进行测试
        Fruit f = new Apple();
        System.out.println(f.name);
        System.out.println(f.sum);
        //f.name = " ";常量的值不可以被修改The final field Fruit.name cannot
        f.eat();
        f.clean();;
        f.eat2();//子类重写(实现)的功能
    }
}
//创建抽象类父类--水果类
abstract class Fruit{
   //抽象类中可以有成员变量吗-->可以;
    //创建抽象父类的成员变量
   int sum=10;
   //抽象类中可以有成员常量;
    //创建抽向父类的成员常量,注意初始化
   final String name="banana";
   //抽向父类中可以创建普通方法
    //抽象类中可以都是普通方法,是可以的
    //如果一个类中的都是普通方法,为啥还要被声明成抽象类?
    //原因:抽象类不可以创建对象
    //如果不想让外界创建本类对象,可以把普通类声明成抽象类
   public void eat(){
       System.out.println("吃啥都行");
   }
   // 抽象类中可以有抽象方法,一旦类中有抽象方法,这个类必须声明成一个抽象类
   public abstract void clean();
    public abstract void eat2();
}
//创建子类苹果类
//当一个类继承了父类,父类是一个抽向父类时,子类要么变成一个抽象子类,要么实重写(实现)父类的所有抽象方法
class Apple extends Fruit{
    @Override
    public void eat2(){
        System.out.println("水果中最爱吃苹果");
    }
    @Override
    public void clean(){

        System.out.println("苹果还是要洗洗才能吃");
    }
}