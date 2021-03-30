package day10;

public class Test2_UserInter {
    public static void main(String[] args) {
        Inter2 i = new Inter2Impl();
        //问题:子类创建对象时默认会调用父类的构造方法
        //目前皆苦实现类的父级是一个接口,而接口没有构造方法
        //那实现类构造方法中的super()调用的是谁?  结论:如果一个类没有明确指定父类,
        // 那么默认继承顶级父类的Object,所以super()会自动调用Object类中的无参构造
        System.out.println(i.age);//接口中的变量实际上都是静态常量,可以通过类名直接调用
        //i.age = 12;接口中的变量是常量,不能修改
    }
}

interface Inter2{
    int age=10;//默认是静态常量,要进行赋值
    final static int weight=100;
    //public Inter2(){}接口不可以有构造器
    public abstract void eat();
    void eat2();//可以简写,会自动拼接public abstract
}

class Inter2Impl implements Inter2{
    public Inter2Impl(){
        super();//顶级父类Object的构造方法
        System.out.println("我是Inter2Impl的无参构造");
    }
    //如果接口中添加了抽象方法,所以实现类要重写方法
    public  void eat(){
        System.out.println("我是Inter2接口实现类的重写方法");
    }

    @Override
    public void eat2() {
        System.out.println("重写方法2");
    }
}