package cn.tedu.api.day11;

import java.util.Arrays;

//此类是用来测试String类的用法
public class Test2_String {
    public static void main(String[] args) {
        //创建方式一
        //字符串底层维护的是char[],存放在内存的堆中
        char[] data = {'a','b','c'};
        String s1 = new String(data);
        //此种创建方式底层也会new String(),存放在堆的常量池中
        //创建String对象的方式二
        String s2 =  "abc";
        System.out.println(s1==s2);//false
        //测试常用的方法
        System.out.println(s2.charAt(1));//b  ,获取下标为1的char字符
        System.out.println(s2.concat("cxy"));//abccxy   在本串后拼接"cxy"
        System.out.println(s2.endsWith("c"));//true  判断s2是否已c结尾
        System.out.println(s1.equals(s2));//true,String底层重写了,所以相等比较串的内容

        String s3 = s2.concat("cxy");
        System.out.println(s3.endsWith("xy"));
        System.out.println(s2.getBytes());//将字符串转成byte[],打印的是数组的地址值
        System.out.println(s2.indexOf("c"));//获取c在字符串的位置

        s2 = "abcbc";
        System.out.println(s2.lastIndexOf("c"));//4,获取字符c在字符串的位置
        System.out.println(s2.length());//获取字符串的长度

        s2 = "a b c d e";
        System.out.println(s2.split(" "));//按空格拆分为数组,但是打印出来的是数组
        System.out.println(Arrays.toString(s2.split(" ")));
        s2 = "abcde";
        System.out.println(s2.startsWith("a"));//true,判断是否是以a开头
        System.out.println(s2.substring(2));//从下标2开始截取所有字符串
        System.out.println(s2.substring(1,5));//截取[1,5)含头不含尾

        System.out.println(s2.toUpperCase());//把字符串变成全大写
        System.out.println(s2.toLowerCase());//把字符串变成全小写

        s2 = "     abc         ";
        System.out.println(s2.trim());//去掉数据两端多余的空格
        System.out.println(String.valueOf(10));//10把int 10 转成String类型
        System.out.println(String.valueOf(10)+10);//1010 ,不是加法,而是String类型的拼接








    }
}
