package day07;
//�����������Թ���������ֲ������
public class Test3_Block {
	public static void main(String[] args) {
		Teacher t = new Teacher();//ͨ�������޲ι��촴������
		Teacher t1 = new Teacher("������","java");//ͨ������ȫ�ι��촴������
		System.out.println(t1.name);
		System.out.println(t1.subject);
		t.teacher();
		t.study();
	}
}
//����Teacher��
class Teacher{
	String name;
	String subject;//��������
	//��������:1.λ��:����,������;
	//����:������ȡ���췽���Ĺ��Թ���
	//ִ��ʱ��:�ڵ��ù��췽��֮ǰ����
	{
		subject = "java����";
		System.out.println("hahahah");
	}
	//���췽���Ķ���:���η� ������(�����б�){������}
	public Teacher(){
		System.out.println("����һ���޲ι���");
	}//���巽��
	public Teacher(String s,String n){
		name = s;
		subject = n;
		System.out.println("����һ��ȫ�ι���");
	}//���巽��
	
	public void teacher(){
		System.out.println("�����Ͽ�ing");
	}
	public void study(){
		//�����ֲ������
		//λ��:������   ����:�������Ʊ��������÷�Χ(���÷�ΧԽСԽ��,��ΪԽСԽСԽ��ȫ)
		//ִ��ʱ��:���ñ�����ʱ
		{
			subject = "hahsdjflak";
			int i = 10;
			System.out.println(i);
		}
		System.out.println(subject);
		//����:��Ϊ�����˱���i��ʹ�÷�Χ
		//System.out.println(i);
		System.out.println("���ڱ���ing");
	}

}

