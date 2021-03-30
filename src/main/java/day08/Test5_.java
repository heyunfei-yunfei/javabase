package day08;
//本类用于测试多态
public class Test5_ {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        //a.jump();父类无法使用子类的特有方法
        //创建子类对象进行测试
        Cat c = new Cat();
        c.eat();//小猫Cat爱吃小鱼干.调用的是重写以后的功能
        c.jump();
        //创建多态形式进行测试
        //父类引用 指向子类对象
        //编译(保存)看左边,运行(测试)看右边
        Animal c1 = new Cat();
        c1.eat();//使用的是父类的声明,但是用的是子类的实例
        /**
         * 多态的出现是为了统一标准,向父类看齐
         * 父类提供的功能才能用,子类特有的功能用不了
         */
    }
}
class Animal{
    //创建父类中的普通发发eat
    public void eat(){
        System.out.println("小动物Animal吃啥都行~~");
    }
}
class Cat extends Animal{
    @Override
    //重写父类中的方法--对父类的代码功能修改
    //重写:方法签名保持一致(返回值类型 方法名(参数列表))
    public void eat() {
        System.out.println("小猫Cat爱吃小鱼干 ");
    }
    public void jump(){
        System.out.println("小猫Cat跳的老高了");
    }
}
