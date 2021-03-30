package cn.tedu.api.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//本类用于测试Set接口
public class Test1_Set {
    public static void main(String[] args) {
        //创建对象
        Set<String> set = new HashSet<>();
        //存放数据用于测试
        set.add("蟹黄包");//向set集合添加数据
        set.add("小笼包");
        set.add("奶黄包");
        set.add("奶黄包");
        set.add("奶黄包");
        set.add("null");//存String类型的null
        set.add(null);//存null值
        System.out.println(set);
         /*1.set集合中的元素都是无序的
         2.set集合中的元素不能重复
         3.set集合中允许存放null值,但是是0-1个,也不可重复*/
         //测试常用方法
        //set.clear();清空集合
        System.out.println(set.contains("灌汤包"));//false    判断集合是否包含该元素
        System.out.println(set.equals("奶黄包"));//false   集合和单个元素相比较,是错误的
        System.out.println(set.hashCode());//获得指定对象的哈希码值
        System.out.println(set.isEmpty());//false判断集合是否为空
        System.out.println(set.remove(null));//移出集合中指定元素,成功返回true
        System.out.println(set.size());//获取集合元素个数
        System.out.println(Arrays.toString(set.toArray()));//把set集合元素取出,存入数组中
        /*4.集合间的操作*/
        Set<String> set1 = new HashSet<>();
        set1.add("小狮子");//向set2集合中添加元素
        set1.add("小海豚");
        set1.add("小脑斧");
        set1.add("小兔纸");
        System.out.println(set1);//打印查看集合元素
        System.out.println(set.addAll(set1));//将set1集合中的所有元素存入set集合
        System.out.println(set);
        System.out.println(set.containsAll(set1));//判断set集合中是否包含set1集合
        System.out.println(set.removeAll(set1));//移出set集合找那个属于set1集合的所有元素
        System.out.println(set.containsAll(set1));//判断set集合中是否包含set1集合

        //retainAll()方法时取两个集合之间的公共部分,谁调用,影响谁
        set.add("花蝴蝶");
        set1.add("花蝴蝶");
        System.out.println(set);
        System.out.println(set1);
        System.out.println(set.retainAll(set));//set没变
        System.out.println(set1.retainAll(set1));//set1没变
        System.out.println(set.retainAll(set1));//返回值为trues
        System.out.println(set);//set集合只剩交接元素
        System.out.println(set1);
        //集合的迭代
        Iterator<String> it = set1.iterator();
        while (it.hasNext()){//判断集合中是否还有元素,有,返回true,循环继续
            String s = it.next();
            System.out.println(s);
        }
    }
}
