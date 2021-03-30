package cn.tedu.api.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

//本类用于测试ArrayList的相关内容
public class Test5_ArrayList {
    public static void main(String[] args) {
        //创建ArrayList对象,使用的是无参构造
        //底层会自动帮我们创建数组存放对象,并且数组的初始化容量为10
        ArrayList<Integer> list = new ArrayList<>();
        //存入数据来测试常用方法
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(200);
        list.add(500);
        list.add(300);
        list.get(2);
        System.out.println(list);
        list.add(0,666);//向指定索引处添加元素
        System.out.println(list);

        //list.clear();//清空集合
        System.out.println(list);
        System.out.println(list.contains(200));//判断集合中是否有这个元素
        System.out.println(list.get(0));
        System.out.println(list.indexOf(300));//获取300第一次出现的索引值
        System.out.println(list.lastIndexOf(300));//获取300元素最后一次出现的索引值
        System.out.println(list.isEmpty());//false判断集合是否为空
        System.out.println(list.remove(0));//打印的是被移除指定下标的元素
        System.out.println(list.remove(Integer.valueOf(300)));// true ,移出集合中的指定元素
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        //remove(0)是根据下标删除元素,注意数组下标越界
        //remove(Integer.valueOf(300))是删除指定的元素,出入指定元素类型
        //System.out.println(list.remove(200));
        System.out.println(list.set(2,999));//根据下表修改指定位置上的元素
        System.out.println(list);
        System.out.println(list.size());//获取集合元素数
        System.out.println(Arrays.toString(list.toArray()));//将集合元素存入数组并打印
        Iterator<Integer> it = list.iterator();
        System.out.println("****************");
        while (it.hasNext()){
           Integer num = it.next();
            System.out.println(num);
        }
        System.out.println("****************");
        for (Integer s: list) {
            System.out.println(s);
        }
        System.out.println("****************");
        for (int i=0;i<list.size();i++){
            Integer sum = list.get(i);
            System.out.println(sum);
        }
        System.out.println("****************");
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()){
            Integer num = lit.next();
            System.out.println(num);
        }

    }
}
