package cn.tedu.innerclass.day19;
//本类用于测试成员内部类被private修饰的现象
public class TestInner2 {
    public static void main(String[] args) {
        //怎么使用内部类Inner2的资源?
        //创建内部类Inner2的对象进行资源访问
        //Outer2.Inner2 in2 = new Outer2().new Inner2();
        //in2.study();
        //如果成员内部类被private修饰,如何用它的功能?
        //曲线救国,可以先创建外部类对象,调用getInner2()
        /*创建外部类对象间接访问私有内部类中的资源*/
        new Outer2().getInner2();

    }
}
//创建外部类Outer2

class Outer2{
    //6.提供外部类公共的方法,在此方法内部创建爱Inner2内部类对象

    public void getInner2(){
        //6.1必须先创建内部类对象
        Inner2 i2 = new Inner2();
        i2.study();
    }

    //2.创建成员内部类Inner2
    //成员内部类的位置:类内方法外,与成员变量相同
    //5.抵用private修饰成员内部类,私有化,无法被外界直接访问
    private class Inner2{
        //3.创建成员内部类普通方法
        public void study(){
            System.out.println("Inner2....1阶段倒计时2天");
        }
    }
}
