package cn.tedu.innerclass.day19;
//本类用于测试成员内部类被static修饰后的效果
public class TestInner3 {
    public static void main(String[] args) {
        //按照之前的方式,创建内部类对象调用play()
        //Outer3.Inner3 in3 = new Outer3().new Inner3();
        //in3.play();
        //方式二:创建匿名内部类对象访问play()
        //new Outer3().new Inner3().play();
        /**现象:当内部类被static修饰以后,上面的创建对象报错了,注释掉.
         * 6.所以通过外部类的类名来创建内部类对象**/
          Outer3.Inner3 oi3 = new Outer3.Inner3();
          oi3.play();
          //通过内部类的匿名对象调用play()
          new Outer3.Inner3().play();
          //9.访问静态内部类中的静态资源--链式加载
        Outer3.Inner3.play2();

    }
}
//1.创建外部类
class Outer3{
    //创建内部类Inner3
    //5.成员内部类被static修饰--(并不常用!!!!--浪费内存)
     static class Inner3{
        //3创建内部类普通成员方法
        public void play(){
            System.out.println("Inner3...春天应该玩代码");
        }
        //8.创建静态方法play2()
        static public void play2(){
            System.out.println("Inner3....成天应该玩代码");
        }
    }
}
