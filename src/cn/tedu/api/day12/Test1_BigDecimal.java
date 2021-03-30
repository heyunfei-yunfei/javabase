package cn.tedu.api.day12;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1_BigDecimal {
    public static void main(String[] args) {
        System.out.println("请输入要计算的两个小数");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b + "");
        BigDecimal bd3;
        bd3 = bd1.add(bd2);
        System.out.println(bd3);
        bd3 = bd1.multiply(bd2);
        System.out.println(bd3);
        bd3 = bd1.subtract(bd2);
        System.out.println(bd3);
        bd3 = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println(bd3);

    }
}
