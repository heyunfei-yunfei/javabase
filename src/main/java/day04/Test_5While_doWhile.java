package day04;

import java.util.Random;
import java.util.Scanner;

//本类用于练习while循环与do-while循环
//需求:产生一个随机数,与用户输入的数字作比较,直到用户猜对为止
public class Test_5While_doWhile {
public static void main(String[] args) {
	//1.让程序产生一个随机数,使用的工具是Random,需要导包;
	//.nextInt(100)中的100是自定义的,此时
	//生成的随机数的范围是[]以内的整数
	int random = new Random().nextInt(100);//
	System.out.println(random);
	//2写一个while循环-死循环
	while(true){
		Scanner scaner = new Scanner(System.in);
		 int data = scaner.nextInt();
		 if(random!=data){
			 continue;
		 }
		if(data==random){
			System.out.println("恭喜你答对了");
			break;
		}
	}
}
}
