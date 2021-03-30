package day07;
//本类测试继承中成员方法的使用
public class Test7_Extends2 {
    public static void main(String[] args) {
        Son2 s = new Son2();
        s.eat();
        Father2 f = new Father2();
        f.eat();
        s.study();
    }


}
class Father2{
public void eat(){
    System.out.println("爸爸爱吃肉");
}
}
//创建子类

class Son2 extends Father2{
public void eat(){
    //重写的规则:和父类的方法签名保持一致
    //返回值类型 方法名 参数列表
    //子类的权限修饰符必须大于等于父类的权限修饰符
    //void eat()一模一样,改的是方法体

    System.out.println("儿子爱吃饺子");
}
        //子类还可以拥有自己特有的功能
    public void study(){
        System.out.println("来学习java");
    }
}