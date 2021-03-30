package cn.tedu.oopexec;
//本类用于完成OOP汽车设计综合案例
/**
 * 分析事物,得出他的属性和功能
 * 提取类中的共同点,向上抽取,形成父类
 * 子类继承父类后,就拥有的父类的功能
 * 如果对父类的功能不满意,可以重写
 * 可以封装了某些类的属性,如果封装了,就要提供对应的get()/set()
 */
public class Test7_ExtendsDesignCar {
    public static void main(String[] args) {
        Car r = new Car();
        System.out.println(r.getColor());//null
        r.start();   r.stop();
        BMW b = new BMW();
        System.out.println(b.color);
        b.start();b.stop();
        Bsj j = new Bsj();
        System.out.println(j.getColor());
        j.start(); j.stop();
        Car c = new BMW();

        Car c1 = new Bsj();
    }
}
//创建一个汽车类
class Car{
    //定义Car类的属性
    private String brand;//定义品牌
    private String color;//定义颜色
    //定义Car类的启动与停止方法
    //封装并提供公共的set/get方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start(){
        System.out.println("我的车启动了");
    }
    public void stop(){
        System.out.println("我的车熄火了");
    }
}
//创建一个宝马类
class BMW extends Car{
    String color ="五彩斑斓的黑";
    @Override
    public void start(){
        super.start();
        System.out.println("宝马启动加速度UP UP");
    }
}
//创建一个保时捷类
class Bsj extends Car{
    String color = "黑不拉几的白";

    @Override
    public void stop() {
        super.stop();
        System.out.println("保时捷想停稳点");
    }
}