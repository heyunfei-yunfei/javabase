package cn.tedu.api.day12;

import java.util.Arrays;

//本类用于复习String类
public class Test0_StringDemo {
    public static void main(String[] args) {
        //创建String对象的两种方式
        char[] value = {'a','b','c'};
        String s = new String(value);
        String s2 = "abc";//存放在常量池中
        //测试常用方法
        System.out.println(s2.charAt(2));
        System.out.println(s2.concat("程序员"));
        System.out.println(s2.endsWith("y"));//false
        String s3 = s2.concat("程序员");
        System.out.println(s3.endsWith("员"));//true
        System.out.println(s.equals(s2));//true
        byte[] b = s2.getBytes();//输出的是地址值
        System.out.println(Arrays.toString(b));//97,98,99
        System.out.println(s2.substring(0,3));
        System.out.println(s2.indexOf("c"));//判断字符所在的下标位置
        System.out.println(s2.lastIndexOf("c"));//判断字符最后一次出现的位置\
        System.out.println(s2.length());//代表String的方法,数组没有(),代表是数组的属性
        System.out.println(s2.startsWith("a"));//代表是以那个字符开始
        s2 = "a b c e";
        String[] c = s2.split("\\t");
        System.out.println(Arrays.toString(c));
        s2 = "       abc";
        System.out.println(s2.trim());//去掉前和后的空格
        s2 = "abcdefg";
        System.out.println(s2.substring(4));
        System.out.println(s2.substring(2,6));
        System.out.println(String.valueOf(10));
        String  a = String.valueOf(10);
        System.out.println(a);
        Double.parseDouble("100");
    }
}

