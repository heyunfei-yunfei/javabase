package cn.tedu.game;
//本类用于进行士兵类的测试
public class Test1 {
    //创建main方法
    public static void main(String[] args) {

        //创建士兵类对象
        //s1是引用类型变量,引用的是第一个士兵对象
        Soldier s1 = new Soldier();
        s1.id = 8888;
       // s1.go();
        //s2是引用类型变量,引用的是第二个士兵对象
        Soldier s2 = new Soldier();
        s2.id = 8889;
//        s2.attack();
        s1.a = new AK47();
        s2.a = new AK47();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();
        s2.attack();

    }
}
