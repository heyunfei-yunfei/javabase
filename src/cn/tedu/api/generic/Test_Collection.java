package cn.tedu.api.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//本类用与测试Collection接口
public class Test_Collection {
    public static void main(String[] args) {
        //Collection接口相关的对象
        //Collection c = new Collection();//报错,因为Collection是接口不能实例化
        /*Integer是泛型,用来约束集合中的元素类型
        * 只能写引用类型,不可以是基本类型*/
        Collection<Integer> c = new ArrayList<>();

        //测试常用方法--针对单个集合的方法
        c.add(100);//向集合中添加元素
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);//直接打印查看集合中的元素
        //c.clear();
        //System.out.println(c);//清空集合中的所有元素
        System.out.println(c.hashCode());//返回 127240651 此集合对象的哈希码值
        System.out.println(c.isEmpty());//false判断此集合是否为空
        System.out.println(c.size());//5 返回集合中的元素个数
        System.out.println(c.equals(200));//false判断c是否与200相等.
        System.out.println(c.contains(200));//判断c是否包含元素200
        //System.out.println(c.remove(100));//移出集合中的元素100
        //把集合中的元素放入数组
        Object[] a = c.toArray();//接返回值类型的快捷键是ctrl+alt+v
        System.out.println(Arrays.toString(a));
        //测试常用方法--集合之间的操作
        Collection<Integer> b = new ArrayList<>();
        b.add(100);
        b.add(200);
        b.add(300);
        b.add(3);
        c.addAll(b);//把b集合添加到c集合中,追加操作
        System.out.println(c);
        System.out.println(c.contains(b));//false,c集合中没有c2元素
        System.out.println(c.containsAll(b));// true 判断集合c是否包含b集合的所有数据,集合之间的操作要用All

        System.out.println(c.retainAll(b));//取两个集合的公共元素,直接修改集合
        System.out.println(c);
        System.out.println(c.removeAll(b));//删除c集合中属于b集合的数据
        System.out.println(c);

        //2.3遍历/迭代集合元素iterator<E>iterator()
        /*1.如何获取迭代器 c.iterator()
        * 2.判断集合中是否有下个元素,it.hasNest()
        * 如果有就获取当前迭代到的元素it.next()*/
        Iterator<Integer> it = c.iterator();
        //通过集合迭代器,循环获取集合中的每个元素
        //判断集合当中是否有下个元素,有就返回true,继续循环
        while (it.hasNext()){//hasNext()判断集合中是否有下个元素,有就返回true,继续循环
            Integer num = it.next();//next()用于获取本次遍历到的元素
            System.out.println(num);
        }
    }
}
