package day5;
//本类用于测试方法的重载
public class Test2_MethodReload {
	public static void main(String[] args) {
		//重载:在同一个类中,有多个同名参数列表(个数不同/类型不同)不同的方法
		//参数列表只得是参数的类型顺序和个数,而不是参数名
		f();
		f(10);
		f("派大星",10);
		/**
		 * 调用方法时根据方法名和参数列表
		 */
	}

	public static void f(String s, int i) {
		System.out.println(s+"今年"+i+"岁了");
	}

	public static void f() {
		System.out.println("这是一个没有参数的方法");
	}

	public static void f(int f) {
	
	}
}
