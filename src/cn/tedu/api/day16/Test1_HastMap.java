package cn.tedu.api.day16;

import java.util.HashMap;
import java.util.Map;

//本类用与测试HashMap
public class Test1_HastMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        /*初始容量是16-->1<<4=1*2^4
        * 加载因子:0.75f
        * 如果容量达到了提到的初始容量与加载因子的乘积,需要扩容
        * 扩容会重新开辟空间,重新计算所有元素的位置,也叫rehash
        * 所以我们在设计初始容量与加载因子的时候要相对平衡
        * 如果加载因子过低,则rehash过于频繁,影响性能
        * 如果加载因子过高或者是初始容量设置的太高,会影响查询效率*/
            int a=1;
            int c = 1+a++;
            int d=a;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}
