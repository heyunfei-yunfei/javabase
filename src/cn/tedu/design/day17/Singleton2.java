package cn.tedu.design.day17;
//本类用于测试单例设计模式2-懒汉式-面试重点
/*总结:
* 1.延迟加载的思想:是指不会在第一时间为你加载资源(创建对象)
* 而是等到你需要的时候,再帮你取加载资源(创建对象)
* 2.线程安全问题:多线程场景+共享数据+多条语句操作此共享数据
* 解决方案:加锁(同步代码块/同步方法)
* 3.饿汉式和懒汉式的区别:
* 饿汉式:是不管你需不需要本类对象,先帮你创建出来
* 懒汉式:先不给你创建这个类的对象,等到你需要的时候在创建--延迟加载的思想*/
public class Singleton2 {
    public static void main(String[] args) {
        //测试单例实现方式2
        MySingle2 single2 = MySingle2.getSingle2();
        MySingle2 single3 = MySingle2.getSingle2();
        System.out.println(single2==single3);
    }
}
class MySingle2{

    private MySingle2() {
    }
    /**
     *问题:程序中有共享资源single并且有多条语句操作了共享资源
     * 此时共享资源single会出现多线程数据安全隐患
     * 解决方案:加锁--同步代码块的方式--同步方法(如果本方法中所有代码都被同步了,可以把方法修饰成同步方法
     * 锁的位置:包裹所有操作共享资源的语句
     * 锁对象:外部创建的Object对象是静态的&静态区域中不可以使用this
     */
    //在类的内部创建一个引用类型变量--注意私有化--延迟加载
    //本类资源也需要使用静态资源修饰,因为静态资源只能调用静态
    private static MySingle2 single;
    //定义锁对象,
     static Object o = new Object();
    //对外提供全局访问点--对外提供公共的get(),返回本类对象
    //当用户调用此方法时,才说明需要本类对象了,再返回
    //本方法使用静态修饰,方便通过类名直接调用
    public static MySingle2 getSingle2() {
        /**
         * 静态区域内,不能使用this关键字,因为静态资源优先于对象进行加载
         * 静态资源属于类资源,随着类的加载而加载,而this代指本类对象
         */
        //synchronized (this){//报错:cannot use this in static context
        synchronized (o){
            //判断本方法是不是第一次调用(single有没有创建过)
            if (single==null){//如果是null,说明之前没创建过
                //创建对象,把地址只交给引用类型变量single保存
                single = new MySingle2();
            }
            //将本类对象返回
            return single;
        }
    }
}