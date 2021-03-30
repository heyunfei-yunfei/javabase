package cn.tedu.design.day17;
/**
 * 本类用于测试DEBUG--断点调试
 * 断点:就是一个标记
 * 1.打断点:在代码区域左边的空白处点击即可,再次点击,取消断点
 * 在哪加断点?想看那个语句执行的结果,就在那个语句前加,但不能加在结构代码上
 * 2.怎么运行打断点以后的程序?
 * 方式一:右键-->Debug As
 */
public class OOPTest {
    public static void main(String[] args) {
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//        }
        /**测试材料2:递归*/
      //  f(10);
        /**
         * 测试材料3:查看不同元素的执行顺序
         */
        B b = new B();
    }
    //测试材料2:递归求数字阶乘
    public static  int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }

}

class A{
    static {
        System.out.println("我是父类的静态代码块");
    }
    {
        System.out.println("我是父类的构造代码块");
    }

    public A() {
        System.out.println("我是父类的构造方法");
    }
    public void eat(){
        System.out.println("我是父类的普通方法");
        {
            System.out.println("我是父类的局部代码块");
        }
    }
}
class B extends A{
    static {
        System.out.println("我是子类的静态代码块");
    }
    {
        System.out.println("我是子类的构造代码块");
    }

    public B() {
        System.out.println("我是子类的构造方法");
    }
    public void eat(){
        System.out.println("我是子类的普通方法");
        {
            System.out.println("我是子类的局部代码块");
        }
    }
}
