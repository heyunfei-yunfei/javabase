package day04;
//本类用于嵌套for循环
public class Test1_ForDemo {
		//创建程序的入口函数main--Alt+/补全代码
	public static void main(String[] args) {
		//在控制天上打印1234
		for(int i=1;i<3;i++){
				System.out.print(i);
			for(int j=1;j<5;j++){
				System.out.println(j);
			}	
		}
		for(int j=1;j<5;j++){
		for(int i=1;i<4;i++){
			System.out.print("*");
		}
		System.out.println();
		}
		
	}

}
