package day07;
//本类中用于测试继承中构造方法的使用
public class Test8_Extends3 {
    public static void main(String[] args) {
        //创建子类对象进行测试
        Son3 s = new Son3();

    }
}
class Father3{
    public Father3(){
        System.out.println("我是父类的无参构造");
    }
    public Father3(String s){
        System.out.println("我是父类的含参构造");
    }
}
class Son3 extends Father3{
    //构造方法不可以被继承,语法要求,天然就不符合:构造方法需要与类名同名
    public Son3(){
        //子类的构造方法中,默认存在super();
        //所以创建子类对象调用子类的构造方法时,默认先去调用无参构造
        //在子类创建对象时,会自动调用子类的无参构造,但是继承后会先去调用父类的无参构造
        super("刘德华");
        System.out.println("我是子类的无参构造");
    }
}