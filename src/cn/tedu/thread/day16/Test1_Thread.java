package cn.tedu.thread.day16;
//本类用来完成多线程编程实现方案一
public class Test1_Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        //t.run();
        MyThread t1 = new MyThread();
        /*如果只是调用两个线程的run()方法,会按顺序依次执行,没有多线程的效果
        * 所以想要使用多线程效果,必须调用start()才真正把线程加入就绪队列
        * run()方法与start()的本质区别:run()只是当做一个普通单线程方法来运行,并没有多线程的效果
        * 当我们调用start(),底层会自动调用run()执行业务*/
        //线程的随机性:CPU会自动调度线程们,我们无法控制
        //t1.run();
        t.start();//对应的是就绪状态
        t1.start();
        MyThread t2 = new MyThread("乖乖叮叮咚");
        t2.start();
    }
}
//自定义多线程类
/*方式一:继承Thread类*/
class MyThread extends Thread{
   //线程中的业务是写在run()里的
    //重写Thread父类中的run()
    /*如果不满意run()中的内容,可以重写:run()*/
   public MyThread(){
       /*最后:为了修改线程的名称,不再使用系统分配的默认名称
       * 需要提供含参构造,并在构造中调用父类给线程起名的构造函数*/
   }
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        //super()表示父类对象的引用,也就是默认调用Thread类的业务,不用
        //super.run();
        //写业务:输出10次当前正在执行的线程名称
        for (int i=0;i<10;i++){
            //getName()可以获取当前正在执行的线程名称
            /*是从父类中继承的方法,可以直接使用*/
            System.out.println(i+"="+getName());
        }
    }
}