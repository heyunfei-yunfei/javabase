package day5;
//�������ڲ��Է���������
public class Test2_MethodReload {
	public static void main(String[] args) {
		//����:��ͬһ������,�ж��ͬ�������б�(������ͬ/���Ͳ�ͬ)��ͬ�ķ���
		//�����б�ֻ���ǲ���������˳��͸���,�����ǲ�����
		f();
		f(10);
		f("�ɴ���",10);
		/**
		 * ���÷���ʱ���ݷ������Ͳ����б�
		 */
	}

	public static void f(String s, int i) {
		System.out.println(s+"����"+i+"����");
	}

	public static void f() {
		System.out.println("����һ��û�в����ķ���");
	}

	public static void f(int f) {
	
	}
}
