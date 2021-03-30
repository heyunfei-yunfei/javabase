package day04;
//需求：利用for循环嵌套，打印左直角三角形
public class Test_ForTraingle {
	public static void main(String[] args) {
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		//* * * * * *
			for(int i=0;i<7;i++){
				for(int j=0;j<i+1;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
			
	for(int i=1;i<10;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i+"*"+j+"="+i*j+" ");
		
		}
		
		System.out.println();
		
	}
			
			
			
	}

}
