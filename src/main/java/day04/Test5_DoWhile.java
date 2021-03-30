package day04;

import java.util.Random;
import java.util.Scanner;

public class Test5_DoWhile {
	public static void main(String[] args) {
		//1.创建do-while死循环用于猜数字
		int random = new Random().nextInt(100);
		System.out.println(random);
		do{
			System.out.println("请输入一个随机数来进行猜测");
			Scanner scanner = new Scanner(System.in);
			int data = scanner.nextInt();
			if(data==random){
				System.out.println("恭喜你答对了");
				break;
			}
		}
		while(true);
	}
}
