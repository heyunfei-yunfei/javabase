package day07;
//�������ڲ��Ծֲ��������Ա����
public class Test2_Variable {
public static void main(String[] args) {
	Cat c = new Cat();
	c.eat();
}
}
//����Cat��
class Cat{
	//������Ա����
	//λ��:���﷽����
	//�����ֶ���ʼ��,���Զ������Ӧ���͵�Ĭ��ֵ
	//������:��������,����ʧ��,��Ա�����Ż���ʧ
	static int count;
	int sum = 200;
	//��������
	public void eat(){
		//�����ֲ�����
		//λ��:������/�ֲ��������
		//��������ֶ���ʼ��
		//������:����/�����ִ�й����,�ֲ�������֮�ͷ�
		int sum = 100;
		//������ʹ��ԭ��:�ͽ�ԭ��
		System.out.println(sum);//�ͽ�ԭ��:��ӡ����100
		//Cat this = new Cat();
		System.out.println(this.sum);//��ӡ���ǳ�Ա����
		System.out.println(count);
		for(int i = 0;i<5;i++){//�����˾ֲ�����i
			System.out.println(i);//�ֲ�����iֻ���ھֲ�������ʹ��
		}
		//����forѭ��,����iʧЧ,����ʹ��
		//����:
		//����i��һ�������Ա����õı���
		//System.out.println(i);
	}
}
