package day08;

/**
 * 代码之间的执行顺序;
 * 静态代码块-->构造代码块-->构造方法-->局部代码块-->普通方法
 * 为什么是这样的顺序:
 * 内存原因:静态资源
 * 作用:
 */
//静态代码块要优先与对象进行加载是随着类的加载而加载到内存中的
    //只加载一次,并且一直存在,直到类消失,他才会小时

//本类用于测试代码块之间的关系
public class Test3_Blook {
    //随着类的加载而加载
    static{
        System.out.println("我是公共类的静态代码块");
    }
    public static void main(String[] args) {
        //创建对象测试
        /**
         * 1.在创建对象之前,会自动执行静态代码块,而且此代码块只加载一次
         * 在创建对象时,会自动调用构造代码块和构造方法,构造代码块先执行
         */
        Person p = new Person();
        //当通过对象调用方法时,若方法里有局部代码块,局部代码块才会执行
        p.study();
        System.out.println("---------");
        //再创建一次对象进行测试
        Person p2 = new Person();

    }
}
//创建Person类
class Person{
    //创建静态代码块
    //位置:类里方法外+触发节点:随着类的加载而加载,只加载一次
    static {
        System.out.println("我是静态代码块");
    }
    //创建构造代码块
    //构造代码块:
    //位置:类里方法外+触发节点:创建对象时立即执行
    {
        System.out.println("我是构造代码块");
    }
    //构造方法
    public Person(){
        System.out.println("我是构造方法");
    }
    public void study(){
        System.out.println("我是普通方法");
        //创建局部代码块
        {
            System.out.println("我是局部代码块");
        }
    }
}
