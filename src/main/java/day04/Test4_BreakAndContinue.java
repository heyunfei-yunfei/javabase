package day04;

import java.util.Scanner;

public class Test4_BreakAndContinue {
public static void main(String[] args) {
	//ѭ������԰����������ظ�������
	//����forѭ����ִ��100�Σ������û����������
	
	for(int i=1;i<=100;i++){
		System.out.println("������һ������");
		Scanner scanner = new Scanner(System.in);
		int data = scanner.nextInt();
		if(data!=88){
			continue;
			//continue ��break�󲻿���д���룬���ǲ��ɵ���Ĵ���
		}
		if(data==88){
			System.out.println("��ϲ��¶��ˣ�ѭ������");
			break;
		}
	}
	
}
}
