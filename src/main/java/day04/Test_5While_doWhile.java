package day04;

import java.util.Random;
import java.util.Scanner;

//����������ϰwhileѭ����do-whileѭ��
//����:����һ�������,���û�������������Ƚ�,ֱ���û��¶�Ϊֹ
public class Test_5While_doWhile {
public static void main(String[] args) {
	//1.�ó������һ�������,ʹ�õĹ�����Random,��Ҫ����;
	//.nextInt(100)�е�100���Զ����,��ʱ
	//���ɵ�������ķ�Χ��[]���ڵ�����
	int random = new Random().nextInt(100);//
	System.out.println(random);
	//2дһ��whileѭ��-��ѭ��
	while(true){
		Scanner scaner = new Scanner(System.in);
		 int data = scaner.nextInt();
		 if(random!=data){
			 continue;
		 }
		if(data==random){
			System.out.println("��ϲ������");
			break;
		}
	}
}
}
