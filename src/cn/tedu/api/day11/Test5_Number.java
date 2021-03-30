package cn.tedu.api.day11;
//本类用于测试包装类
public class Test5_Number {

    public static void main(String[] args) {
       //Integer包装类的默认值是null
        //创建基本类型int对应的包装类Integer的对象--方式1
        Integer i1 = new Integer(5);
        /*Integer有一个高效的效果,范围是(-128~127)
        * 由于valueOf()静态,在范围内相同的数据只会存一次,后续使用的是已经存过的数据*/
        Integer i2 = Integer.valueOf(127);
        Integer i3 =  Integer.valueOf(127);

        Integer i4 =  Integer.valueOf(300);
        Integer i5 =  Integer.valueOf(300);
        System.out.println(i1==i2);//false比较的地址
        System.out.println(i2==i3);//true,Integer,(-128~127),相同数据存一次
        //false,Integer,但是不在(-128~127),存了两次,是两个对象
        System.out.println(i4==i5);//false

        //创建Double对象
        Double d1 = new Double(3.4);
        Double d2 = Double.valueOf(3.4);
        System.out.println(d1==d2);//false,只有integer包装类才有高效效果
        //测试常用
        //把Integer类型的"8000"转换成int类型
        System.out.println(i1.parseInt("8000")+10);//8010,做加法
        //把Integer类型的"8000"转换成double类型
        System.out.println(d1.parseDouble("2.2")+1);//3.2做加法


    }
}
