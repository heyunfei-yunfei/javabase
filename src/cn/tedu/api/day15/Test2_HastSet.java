package cn.tedu.api.day15;

import java.util.HashSet;

//本类用于测试HashSet的用法
public class Test2_HastSet {
    public static void main(String[] args) {
        //创建HashSet对象
        HashSet<Integer> set = new HashSet<>();
        //添加元素
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println(set);
        set.add(200);
        set.add(300);
        //HashSet中的元素时无序且不允许重复的
        System.out.println(set);
        //自行测试继承自collection中的方法
        //单个集合的操作
        //多个集合的操作
        //集合的迭代


    }
}
