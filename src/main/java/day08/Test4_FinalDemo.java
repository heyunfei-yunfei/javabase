package day08;
//本类用于测试final的入门案例
public  class Test4_FinalDemo {
    public static void main(String[] args) {
        //创建子类对象进行测试i
        Son4 s = new Son4();
        System.out.println(s.name);;
        s.work();

        //s.name = "干饭人";报错,常量的值不能被修改
    }
}
//创建父类
//final便是最终,可以用来修饰类,但是被final修饰的类无法被继承
//也就是没有子类,他自己就是最终类
//final class  Father4{//报错:Son4类不能是final修饰的Father4的子类
class  Father4{
    //创建成员变量并赋值
    //final可以修饰成员变量,被final修饰的变量不可以被修改--常量
    final String name="打工人";
    //final可以用来修饰方法,但是被final修饰的方法时最终实现,子类无法重写
    final public void work(){
        System.out.println("Father4....打工人,打工魂");
    }
}
//创建子类
class Son4 extends Father4{
  //子类重写父类的work方法
    //@Override
    //public void work() {
      //  System.out.println("打工人要用计算机打工");
    //}
}
