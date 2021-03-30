package cn.tedu.game;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args
    ) {
        AK47 a = new AK47();
        System.out.println("按回车射击,输入load装载子弹");
        while (true){

            String s = new Scanner(System.in).nextLine();
            if (s.equals("load")){
                a.load();
            }
            a.fire();//如果不是load,就开火
        }
    }
}
