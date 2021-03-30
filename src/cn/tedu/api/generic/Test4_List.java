package cn.tedu.api.generic;

import java.util.*;

//本类用于测试List接口
public class Test4_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //测试继承自Collection接口中的方法
        list.add("大娃");//向集合中添加数据
        list.add("二娃");//向集合中添加数据
        list.add("三娃");//向集合中添加数据
        list.add("四娃");//向集合中添加数据
        list.add("五娃");//向集合中添加数据
        list.add("六娃");//向集合中添加数据
        list.add("七娃");//向集合中添加数据
        System.out.println(list);//直接打印查看集合中的所有元素
        //list.clear();//清空集合
        System.out.println(list.contains("蝎子精"));//判断集合中是否包含蝎子精元素
        System.out.println(list.equals("大娃"));//false
        System.out.println(list.hashCode());//随机生成一段哈希值
        System.out.println(list.isEmpty());//判断集合是否为空
        System.out.println(list.size());//判断集合有几个元素
        System.out.println(list.remove("大娃"));//把集合中的大娃元素移出
        System.out.println(list);
        System.out.println(Arrays.toString(list.toArray()));//把集合转成数组然后输出
        //测试List接口中的特有方法--都是可以根据索引操作的方式
        list.add("爷爷");//追加在最后
        System.out.println(list);
        list.add(1,"小蝴蝶");//在指定索引处添加元素
        System.out.println(list);
        System.out.println(list.get(2));//根据索引获取对应的元素
        list.add(3,"小蝴蝶");//在指定缩影出天价元素--可以重复添加
        System.out.println(list);
        System.out.println(list.indexOf("小蝴蝶"));//获取指定元素第一次出现的下标
        System.out.println(list.lastIndexOf("小蝴蝶"));//获取元素最后一次出现的下标
        System.out.println(list.set(1,"美女蛇"));//小蝴蝶      修改对应索引出的元素,返回值是即将被覆盖的元素
        System.out.println(list);
        System.out.println(list.remove(5));//删除指定索引处的元素,返回所删除的元素
        System.out.println(list);
        System.out.println(list.subList(1,3));//截取子集合,含头不含尾,不改变原集合
        System.out.println(list);
        //addAll()把小集合添加到到集合当中
        //containsAll
        //removeAll
        /*用于List集合是有下标的,所以可以根据下标进行遍历
        * 开始  结束  变化*/
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String a = it.next();
        }
        for (String s:list) {
            System.out.print(s);
        }

        System.out.println("下面的是老师的方法");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("分割线****************");
        //高效for训话
        for (String e:list) {
            System.out.println(e);
        }
        /*获取继成自Collection的, 属于此list集合的迭代器,*/
        Iterator<String> itt = list.iterator();
        while (itt.hasNext()) {//由于我们不清楚集合中有多少元素,所以使用while循环
            System.out.println(itt.next());//打印本次循环获取到的对应元素
        }
        //方式4测试list自己的迭代器listIterator
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
