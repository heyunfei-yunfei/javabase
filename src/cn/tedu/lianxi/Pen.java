package cn.tedu.lianxi;

import java.util.Scanner;

public class Pen {
    public static void main(String[] args) {
        System.out.println("请输入你的钱数");
        Scanner scanner  = new Scanner(System.in);
        double money =scanner.nextDouble();
        System.out.println("请输入你要买的个数");
        double d = scanner.nextDouble();
        method(d,money);
        System.out.println("你的笔每只"+method(d,money)+"");
    }
    public static double method(double d, double money){
        if (true){
            double c = money/d;
            return c;
        }
        return 0;
    }
}
