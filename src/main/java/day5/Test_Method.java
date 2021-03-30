package day5;



//本类用于测试方法的基本知识
public class Test_Method {
	public static void main(String[] args) {
		System.out.println(1);
		
		method1();
		method2(10);
		method3("海绵宝宝",3);
		int result = method4(1,2);
		System.out.println(2);
	}
	public static int method4(int i, int j) {
		return i+j;
	}
	public static void method3(String s, int i) {
		System.out.println(s+"今年"+i+"岁了");
	}
	public static void method2(int num) {
		System.out.println(num*num);
	}
	//创建了method1方法
	public static void method1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}


}
