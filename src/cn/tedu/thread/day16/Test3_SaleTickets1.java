package cn.tedu.thread.day16;
/*多线程案例实践:
* 4个售票窗口,总计卖票100张*/
public class Test3_SaleTickets1 {
    public static void main(String[] args) {
        TicketThread t = new TicketThread();
        TicketThread t1 = new TicketThread();
        TicketThread t2= new TicketThread();
        TicketThread t3= new TicketThread();
        TicketThread t4= new TicketThread();
        //以多线程的方式启动
        t.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
//创建自定义线程类,并继承Thread
class TicketThread  extends Thread{
    //定义变量用来保存票数
    /**问题一:我们想让程序卖100张票,但是4个线程卖了400张?
     * 解决办法:我们需要将成员变量tickets设置成静态的,可以被多个对象共享*/
     static int tickets = 100;//成员变量
    //把业务写在run()里
    @Override
    public  void run() {
        //一直卖票
        while (true){
            try {
                /**
                 * 问题2:产生超卖现象:超出了票数甚至卖出了0,-1,-2
                 * 问题3:产生了重卖现象,同一张票卖给了多个人
                 */
                //让程序休眠10ms,注意有中断异常,需要try-catch
                Thread.sleep(10);
                //中断异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卖票
            System.out.println(getName()+"="+tickets--);
            //判断是否还有票,如果票没了,退出循环
            if (tickets<=0) break;//一定注意设置死循环的出口


        }
    }
}