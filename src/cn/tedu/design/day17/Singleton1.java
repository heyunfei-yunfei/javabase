package cn.tedu.design.day17;

/*本类用于测试单例设计模式1:饿汉式*/
public class Singleton1 {
    public static void main(String[] args) {
        //通过类名直接调用get()方法
        MySingle single = MySingle.getSingle();
        MySingle single2 = MySingle.getSingle();
        //测试引用类型变量保存的地址值是否一致
        System.out.println(single);
        System.out.println(single2.equals(single));//true
        System.out.println(single2==single);//true

    }
}
//创建自己的单例程序
class MySingle {

    //提供构造方法,并将构造方法私有化
    /*1.构造方法私有化,目的是不让外界随意的实例化对象(new本类对象) */
    private MySingle() {
    }

    //在本类内部创建对象,并把对象私有化
    //本资源也需要调用static修饰,因为静态方法getSingle()只能调用静态资源
    private static MySingle single = new MySingle();

    /**
     * 2.思考:对象已经创建好,并且可以用公共的方式返回,那外界如何调用这个公共的方法呢
     * 之前我们都是创建好本类对象,通过对象进行调用
     * 但是现在无法在外部创建本类对象,解决方案:
     * 我们可以利用静态,被static修饰的资源可以被类名直接调用
     */
    //对外提供一个公共的get()方法,返回对象给调用者
    //用static修饰此方法,后续可以通过类名直接调用
    public static MySingle getSingle() {//get()方法是没有参数的,但是要有返回值.    set()方法才有参数
        //把本类创建好的对象返回
        return single;
    }
}
