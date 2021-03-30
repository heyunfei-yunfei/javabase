package cn.tedu.api.generic;

//本类用于测试泛型的优点2
public class Test2_Generic2 {
    public static void main(String[] args) {
        //需求:打印数组中的所有元素
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //print(a);
        Double[] b = {6.0, 6.6, 6.666, 6.6666};
        //print(b);
        String[] c = {"大哥", "二哥", "三哥", "四哥", "五哥"};
        print(c);
    }

    //泛型可以实现通用代码的编写,使用E表示元素类型是
    //Element类型--可以理解成神似状态
    /*泛型的语法要求:如果方法上使用泛型,必须两处同时出现
     * 一个是传入参数的类型,一个是返回值前的泛型类型,表示这是一个泛型*/
    public static <E> void print(E[] e) {
        for (E s : e) {
            System.out.println(s);
        }
    }


    //public static void print(String[] c) {
    // for (String i : c) {
    // System.out.print(i);
    // }
    //}

    // public static void print(Double[] b) {
    //for (Double i : b) {
    // System.out.print();
    // }
    // }

    //public static void print(Integer[] a) {
    //普通for循环写法比较复杂,但是可以设置步长
    //增强for循环(高效for循环)--如果只是单纯从头到尾遍历,使用增强for循环
    //好处:语法简单效率高.    坏处:没有办法按照下标进行遍历,只能从头到尾进行遍历
    /*语法:for(1 2: 3)---> 1:位置是每次遍历到的数据类型 .   2:位置 是名字  3:位置是要遍历的数据*/
    // for (Integer i : a) {
    // System.out.print(i);
    // }
    //}
}
