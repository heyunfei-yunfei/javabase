package cn.tedu.thread.day16;
//本类用于完成多线程编程实现方案二
public class Test2_Thread2 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        //把接口的实现类对象与Thread类进行绑定
        //如果要多线程的方式启动,需要创建多个线程对象
        Thread t = new Thread(r);
        //使用指定的构造函数,修改线程名称Thread(target,name)
        Thread t1 = new Thread(r,"线程2");
        Thread t2 = new Thread(r,"线程3");
        t2.start();
        t.start();
        t1.start();
    }
}
//自定义多线程类,方式2,实现Runnable接口
class MyRunnable implements Runnable{

    //把业务放入run(),实现run()
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //Runnable中没用提供多余的方法,只有run()
            /*Thread.currentThread()--获取当前正在执行业务的线程对象
            * getName()--获取此线程对象的名称*/
            System.out.println("正在执行的线城是="+Thread.currentThread().getName());
        }
    }
}
