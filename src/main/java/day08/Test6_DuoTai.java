package day08;
//本类用于多态中的元素测试
public class Test6_DuoTai {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.sum);
        d.eat();
        d.play();
        //口诀:父类的引用指向子类对象
        //编译保存看左边,运行测试看右边
        Animal1 a = new Dog();
        //在多态当中成员变量用的都是父类的
        System.out.println(a.sum);
        //多态当中成员方法使用的是父类的声明,子类的实现
        a.eat();
        //多态当中,如果父子类都有静态方法,使用的静态方法是父类;
        a.play();//玩啥都行
    }
}
class Animal1{
    //创建成员变量
    int sum = 10;
    //创建成员方法
    public void eat(){
        System.out.println("吃啥都行");
    }
    public static void play(){
        System.out.println("玩啥都行");
    }
}
class Dog extends Animal1{
    int sum = 20;
    @Override//注解-->标签,这个注解加在方法上,表示这是一个重写的方法
    public void eat() {
        System.out.println("小狗要吃肉骨头");
    }
    //@Override不是重写,不能加这个注解
    public static void play(){
        System.out.println("小狗爱打滚");
    }
}
