package day07;
//��������this�Ĳ���
public class Test4_This2 {
public static void main(String[] args) {
	Dog d = new Dog();
	Dog d1 = new Dog("����");
}
}
/**
 * this�����������й��췽����֮��ĵ���
 * ����ע��! �����ǵ����,����˫�����ص���,����ѭ��
 */
//����С����
class Dog{
	//��������
	String name;
	
	//���幹�췽��
	
	public Dog(){
		//���޲ι����е��ú��ι���Ĺ���
		//�涨:this��������ڹ��췽���е�һ��
		this("����");
		System.out.println("�޲ι���");
	}
	//�ṩ���ι���
	public Dog(String s){
		//�ں��ι����е����޲ι���Ĺ���
		//�涨:this�ؼ��ֱ����ڹ��췽���еĵ�һ��
		//this();
		System.out.println("���ι���"+s);
	}
	public void study(){
		
	}
}
