package day5;



//�������ڲ��Է����Ļ���֪ʶ
public class Test_Method {
	public static void main(String[] args) {
		System.out.println(1);
		
		method1();
		method2(10);
		method3("���౦��",3);
		int result = method4(1,2);
		System.out.println(2);
	}
	public static int method4(int i, int j) {
		return i+j;
	}
	public static void method3(String s, int i) {
		System.out.println(s+"����"+i+"����");
	}
	public static void method2(int num) {
		System.out.println(num*num);
	}
	//������method1����
	public static void method1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}


}
