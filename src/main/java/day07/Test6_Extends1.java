package day07;

public class Test6_Extends1 {
    public static void main(String[] args) {
        Son s = new Son();
        s.eat();
    }
}
class Father{
int count = 0;
int sum = 300;
}
class  Son extends Father{
    int sum = 100;
    //创建子类的普通方法
    public void eat(){
        int sum = 10;
        System.out.println(sum);
        System.out.println(this.sum);
        System.out.println(super.sum);
    }
}
