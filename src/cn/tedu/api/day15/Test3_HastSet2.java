package cn.tedu.api.day15;

import java.util.HashSet;
import java.util.Set;

//本类用于自定义对象去重测试
public class Test3_HastSet2 {
    public static void main(String[] args) {
        //创建set集合对象
        Set<Student> set = new HashSet<>();
        //后面部分的<>类型均可省略,3中创建方式都可以
        Student s1 =new Student("jack",18,"船下");
        Student s2=new Student("Rose",16,"船上");
        Student s3=new Student("tom",12,"海上");
        //创建相同的自定义对象
        Student s4=new Student("Rose",16,"船上");
        Student s5=new Student("tom",12,"海上");
        //查看两个对象的哈希码值
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());
        //将创建的对象放到set集合中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        System.out.println(set);
        /*总结:重复的给set集合中添加来的属性相同的对象,为什么没有像之前那样去重呢?
        * 翻阅源码,我们得知需要保证两个条件:
        * 1.保证对象拥有相同的哈希码值
        * --底层默认使用的是Object提供的hashCode()来计算哈希码值,每次new对象,
        * 默认的哈希码值都是不同的
        * 解决方案:如果两个对象类型与属性值完全相同,生成一样的哈希值
        * 就需要重写hashCode()
        * 2.保证两个对象的equals()返回true
        * --底层默认使用Object提供的逻辑,使用==进行值的比较
        * 地址相同时才返回true,所以解决方案是重写equals()*/

    }
}
