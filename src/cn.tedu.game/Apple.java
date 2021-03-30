package cn.tedu.game;

public class Apple {
    private int p =10;
    String s = "tome";

    public Apple() {
        System.out.println("我是Apple类的无参构造");
    }
    public Apple(int a,String str){
        System.out.println("我是Apple类的有参构造");
    }
    public void eat(){
        System.out.println("我是一个吃苹果的方法");
    }
    private void go(int b,String l){
        System.out.println("我是一个玩的私有方法");
    }
}


