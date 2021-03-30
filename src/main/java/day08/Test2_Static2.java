package day08;
//本类用于测试静态的调用关系
//总结:1.静态资源只能调用静态资源
// 2.非静态资源既可以调用静态资源,也可以调用费静态资源
public class Test2_Static2 {
}
//创建Teacher类
class Teacher{
    //定义普通资源
    //定义普通属性
    String name;
    //定义普通方法
    public void teach(){
        //普通资源能否调用静态资源:可以
        System.out.println("正在教学ing...");
        System.out.println(age);//普通资源可以调用静态属性
        sleep();//普通资源可以调用静态方法
    }
    //定义静态资源
    //定义静态属性
    static int age;
    //定义静态方法
    public static void eat(){
        System.out.println("扶朕起来,还能干饭");
    }
    public static void sleep(){
        //静态资源能否调用普通资源:不可以
        //System.out.println(name);
        //teach();
        //静态资源能否调用静态资源:可以
        eat();//静态资源可以调用静态属性
        System.out.println(age);//静态资源可以的调用静态方法
        System.out.println("再累也要好好休息哦~~~");
    }
}
