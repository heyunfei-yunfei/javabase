package day5;

import java.util.Arrays;

public class Test3_CreateArry {
public static void main(String[] args) {
	//创建数组
	//静态数组--已经知道了数组中的具体数据
	char[] c1 = {'h','e','1','1','o'};
	char [] c2 = new char[5];
	//动态创建--知道数组的长度,后期在动态的存数据
	char[] c3 = new char[5];//在内存中开辟一块连续的空间,
	//通过数组下标,操作数组中的每个元素,给数组元素赋值
	//数组下标从0开始,数组的最大下标就是数组的长度-1
	c3[0]='h';//给数组的第一个元素赋值
	System.out.println(c3.toString());
	//char类型底层做了处理,可以直接打印数组中的内容
    /*
     * 除了char类型以外的所有数组想要查看数组中的具体元素
     * 需要使用数组的工具类Arrays的toString(数组名)方法*/
	String[] s = {"a","b","c"};
	for(int i = 0;i<s.length;i++){
		System.out.println(Arrays.toString(s));
	}
}
}
