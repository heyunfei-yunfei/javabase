package cn.tedu.innerclass.day19;

//本类用于测试局部内部类
public class TestInner4 {
    public static void main(String[] args) {
        //如何使用局部内部类的资源呢?
        /*注意:直接调用外部类对象的show()是无法触发内部类功能的
        * 需要在外部类中创建内部类的对象并进行调用,才能触发内部类的功能*/
        //5.创建局部内部类Inner4
        new Outer4().show();

    }
}

//创建外部类Outer4
class Outer4 {


    //创建外部类的方法
    public void show() {

        /**局部内部类的位置:方法里**/
        //创建局部内部类Inner4--不常用!!!
        class Inner4 {
            //4.创建局部内部类的普通属性与方法
            String name;
            int age;

            public void eat() {
                System.out.println("到点了,该吃下午茶了~");
            }
        }
        /*如何使用局部内部类的资源*/
        //6.创建内部类的对象

        Inner4 in = new Inner4();
        System.out.println(in.name);
        System.out.println(in.age);
        in.eat();
    }
}