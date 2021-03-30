package day10;
//本类用于测试接口的实现类
public class InterTests {
    public static void main(String[] args) {
        //Inter i = new Inter();接口不可以创建对象
        //创建多态对象进行测试
        Inter n = new InterImpl();
        n.eat();
        n.play();
        InterImpl s = new InterImpl();

    }
}
