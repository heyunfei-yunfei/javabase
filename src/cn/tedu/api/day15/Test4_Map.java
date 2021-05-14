package cn.tedu.api.day15;

import java.util.*;

//本类用于测试Map接口
public class Test4_Map {
    public static void main(String[] args) {
        //创建Map对象
        //Map中的数据要符合映射规则,一定要同时指定K和V的类型
        //至于K和V指定成什么类型,取决于你的具体需求
        Map<Integer,String> map = new HashMap<>();
        //向map中添加数据
        //添加数据需要同时指定K和V
        map.put(9527,"白骨精");
        map.put(9528,"黑熊精");
        map.put(9529,"者行孙");
        map.put(9529,"孙行者");
        /*1.Map中的数据都是无序的
        * 2.Map中的Key不可以重复,如果重复,此K对应的V会被覆盖
        * 打印结果:{9527=白骨精, 9528=黑熊精, 9529=孙行者}*/
        System.out.println(map);
        //测试常用的放法
        //map.clear();//清空集合
        System.out.println(map);
        System.out.println(map.containsKey(9527));//true,判断集合中是否有该Key
        System.out.println(map.containsValue("土地老儿"));//false,判断集合中是否有指定的value
        System.out.println(map.get(9528));//获取Key所对应的Value值
        System.out.println();
        System.out.println(map.remove(9528));//根据指定的Key 删除对应的Value,删除成功返回被删除的Value
        System.out.println(map.get(9528));//null,没有拿到任何元素
        Collection<String> v = map.values();//把Map中所有的Value放入Collection中
        System.out.println(v);
        //对Map集合进行迭代
        //方式一
        /*想要遍历map中的数据,需要把map集合转换成set集合
        * Set<K>keySet();把map中所有key存到Set集合中*/
        Set<Integer> keySet = map.keySet();
        for (Integer key: keySet) {
            String value = map.get(key);
            System.out.println("{"+key+"="+value+"}");
        }
        System.out.println("***********");
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println("{"+key+"="+value+"}");
        }
        //想要遍历map中的数据,需要先把map集合转换成set集合
        //Set<Entry<Integer,String>>entrySet();
        //把map集合中的一组key&value整体放入set集合中的一个Entry中
        //一组key value,就是一个Entry
        //把map转换成EntrySet

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = entries.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("{"+key+"="+value+"}");
        }

        for (Map.Entry<Integer,String> e: entries) {
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println("{"+key+"="+value+"}");
        }

    }
}
