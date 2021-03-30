package cn.tedu.api.generic;

import java.util.ArrayList;
import java.util.List;

//本类用于测试泛型的优点
public class Test1_Generic {
    public static void main(String[] args) {
        //泛型是怎么来的?
        //创建一个String类型的数组,长度为5
        //数组的好处:在编译时期检查数据,如果不是定义的类型就报错
        String[] arr = new String[5];
        arr[0] = "皮皮虾";
        arr[4] = "杜海涛";
       //泛型一般和集合一起使用,
        ArrayList list = new ArrayList();//注意导包,java.util....
        list.add("下午好");
        list.add(1);
        list.add('c');
        System.out.println(list);//通过打印查看集合中的元素
        /*引入泛型--通过泛型来约束集合中的元素类型*/
        /*泛型的好处:可以把报错的时机提前,在编译期就报错
        * 而不是运行后才抛出异常,向集合中添加元素时,会先检查元素的数据类型,
        * 不是要求的类型就编译失败*/
        /*<type>--type的值应该如何写?
        * 需要存放什么类型,就定义什么类型,但不能是基本类型,必须是引用类型*/
        //注意泛型需要写在前面,否则无法正常类型检查,后面的泛型可以省略,也可以前后都写
        ArrayList<Integer>list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        //list2.add("a");
        System.out.println(list2);
    }
}
