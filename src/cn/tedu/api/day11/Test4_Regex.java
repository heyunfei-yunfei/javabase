package cn.tedu.api.day11;

import java.util.Scanner;

//本类用于测试正则表达式
public class Test4_Regex {
    public static void main(String[] args) {
        //接收用户的身份证号
        System.out.println("请输入身份证号:");
        String input = new Scanner(System.in).nextLine();
        //编辑正则表达式
        //身份证号规律:一般都是18位,前17位是数字,最后
        // 一位可能是数字,也可能是X
        String regex = "[0-9]{17}[0-9X]";
        //判断,是否符合正则表达式的规则(也就是输入的是正确的身份证号)
        if (input.matches(regex)){//matches()是String提供的功能,用来判断字符串是否符合正则表达式的要求
            System.out.println("输入正确!");
        }else {
            System.out.println("输入错误");
        }
    }
}
