package day06;
//�������ڲ��Է�װ
public class Test2_Private {
	public static void main(String[] args) {
		//����ѧ�������--ͨ��new�ؼ��ִ���ѧ�������
		Student st = new Student();
		st.setSubject("java����");
		System.out.println(st.getStubject());
		//��������Student�����s
		System.out.println(st.name);//����ͨ��"."�����ö��������ֵ
		System.out.println("0000000");
		st.eat();//����ͨ��"."�����ö����study����
	}
	
}
//1.ͨ��class�ؼ��ִ���ѧ����--����ѧ����һ����--����+����
class Student{
	//2.��������--��Ա����--���ڷ�����--�����ֶ���ʼ��
	String name;//����
	int sno;//ѧ��
	//
	private String subject;//��Ŀ
	//�����ṩ����������ֵ���÷�ʽ
	public void setSubject(String s){
		subject = s;
	}
	//�����ṩ����������ֵ�鿴��ʽ
	public String getStubject(){
		return "java����";
	}
	//������Ϊ
	
	private void study(){
		System.out.println("����ѧϰJAVA");
	}
	
	public void eat(){
		//���ǿ����ڹ����ķ��������˽�еķ���
		study();
		System.out.println("�������ҵķ����");
	}
	
	
}
