package day04;

import java.util.Random;
import java.util.Scanner;

public class Test5_DoWhile {
	public static void main(String[] args) {
		//1.����do-while��ѭ�����ڲ�����
		int random = new Random().nextInt(100);
		System.out.println(random);
		do{
			System.out.println("������һ������������в²�");
			Scanner scanner = new Scanner(System.in);
			int data = scanner.nextInt();
			if(data==random){
				System.out.println("��ϲ������");
				break;
			}
		}
		while(true);
	}
}
