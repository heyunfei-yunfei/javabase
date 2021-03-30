package day04;

import java.util.Scanner;

public class Test4_BreakAndContinue {
public static void main(String[] args) {
	//循环体可以帮助我们做重复的事情
	//创建for循环，执行100次，接收用户输入的数据
	
	for(int i=1;i<=100;i++){
		System.out.println("请输入一次数据");
		Scanner scanner = new Scanner(System.in);
		int data = scanner.nextInt();
		if(data!=88){
			continue;
			//continue 与break后不可以写代码，都是不可到达的代码
		}
		if(data==88){
			System.out.println("恭喜你猜对了，循环结束");
			break;
		}
	}
	
}
}
