package day07;
//�������ڲ��Թ��췽��
public class Test1_Constructor {
	public static void main(String[] args) {
		//����Person�����
		Person p = new Person("beautiful");
		Person p1 = new Person("����",15,"����");
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.address);
		p.study();
	}
	
}
class Person{
	//���������Ա����
	String name;
	int age;
	String address;
	//Ĭ�ϴ����޲ι���,��new Person()���Զ������޲ι���
	//���췽��Ҳ�������ص�����
	//����:��ͬһ�����д��ڷ�������ͬ,�Ҳ����б�ͬ�ķ���
	public Person() {
		System.out.println("����Person����޲ι��췽��");
	}
	//��������1���в����Ĺ��췽��
	public Person(String s) {
		System.out.println("����Person���1�������Ĺ��췽��"+s);
	}
	
	//����һ��Person���ȫ�ι���
	public Person(String n,int a,String addr) {
		this.name = n;
		this.age = a;
		this.address = addr;
		System.out.println("����Person���3�������Ĺ��췽��"+n+a+addr);
	}

	//������Ϊ
	public void study(){
		System.out.println("�������õ�һ��~~������~~");
	}
}