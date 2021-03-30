package cn.tedu.thread.day16;

import sun.security.krb5.internal.Ticket;

//多线程案例实践:
//4个售票窗口,总计卖票100张
public class Test4_SaleTickets2 {
    public static void main(String[] args) {
        TicketsRunnable r = new TicketsRunnable();
        Thread t = new Thread(r,"线程捌");
        Thread t1 = new Thread(r,"线程玖");
        Thread t2 = new Thread(r,"线程十");
        Thread t3 = new Thread(r,"线程壹");
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
//创建自定义多线程类
class TicketsRunnable implements Runnable{
    //定义成员变量记录票数
    static int tickets = 100;

    //添加未实现的run()完成业务
    @Override
    public void run() {
        //一直卖
        while (true){
            if (tickets>0){//如果票数大于0就一直卖票
                try {
                    Thread.sleep(10);//增加了
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+tickets--);
            }
            if(tickets<=0)break;//如果票数小于0,结束死循环

        }
    }
}
