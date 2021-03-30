package cn.tedu.thread.day17;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//*本类用于改造售票案例,用于解决多线程编程安全问题
// 需求:4个线程同时卖票,攻击卖票100张
// 问题1:重买:一张票卖给了过个人
// 问题2:超卖:卖出了0 -1 -2张票*/
public class TestSaleTicketsV2 {
    public static void main(String[] args) {
        //创建接口实现类对象作为目标业务对象(就是业务卖票)
        SaleTicketsV2 s = new SaleTicketsV2();
        //将目标业务对象与Thread做绑定
       // Thread t = new Thread(s);//对应的是新建状态
       // Thread t1 = new Thread(s);
       // Thread t2 = new Thread(s);
        //Thread t3= new Thread(s);
        /*启动多线程编程的效果
        * 1.如果只创建一个线程对象,是单线程效果,不会出现数据问题*/
        // t.start();//由新建装填转为就绪状态等待调用,等待CPU调用不会立即执行
        //t1.start();
        // t2.start();
        // t3.start();
        /*线程池ExecutorService:用来存放线程的池子,新建线程,启动线程,销毁线程....*/
        /*用来造池子的工具Executors:用来创建线程线程池对象*/
        ExecutorService pool = Executors.newFixedThreadPool(5);//这个方法是用来创建一个指定线程数目的线程池
            for (int i=0;i<5;i++){
                //execute()让线程池中的线程来执行目标业务,每次调用,启动一个线程
                pool.execute(s);//本方法的参数是执行的业务,也就是实现类的目标对象
            }
    }
}
/*多线程数据出现数据不安全问题的前提:
* 1.多线程程序,有共享数据,多条语句操作共享数据资源*/
/*3.同步锁:相当于把容易出现问题的代码锁起来
* 加锁范围:不能太大,也不能太小,太大,干啥都要排队,效率低  .
* 太小:,锁不住,还是有安全隐患*/
//自定义线程类,通过实现Runnable接口的方式来完成
class SaleTicketsV2 implements  Runnable{
    //定义成员变量,用来保存票数
    static int tickets = 100;
    //创建一个唯一的锁对象,之后不论哪个线程进入同步代码块使用的都是这个对象,唯一很重要
    Object o = new Object();
    //添加未实现的方法run()--写业务
    @Override
    ///*如果一个方法中的代码都被同步了,我们可以把这个方法改为同步方法
    // 同步方法使用的锁对象是this
    // 同步代码块使用的锁对象可以任意,只要是同一个锁对象就可以*/
   //synchronized public  void  run() {
   synchronized public  void  run() {
        //通过循环的方式卖票
        while (true){
            /*4.同步代码块synchronized(锁对象){}
            是指同一时间这个代码块只能被一个线程享有
             */
            //这种写法不对,相当于每次进来都new一个对象,不是唯一的锁对象
            //synchronized (new Object()){}
            synchronized (o) {
                //通过if判断卖票的具体情况
                if (tickets > 0) {
                    try {
                        //手动添加休眠方法,创建延迟效果
                        Thread.sleep(10);//可能会出现中断异常,所以要捕获
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //打印当前售票线程名以及票数,Thread在lang包下,不用导包
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                }
                //如果if后面只有一句执行语句,可以不用写大括号
                if (tickets <= 0) break;
            }
        }
    }
}
