package day03;

public class Test5_Switch {
/**
 * ִ�е�˳��
 * ���õ����ʽ��ֵ
 * ��Ȼ��a��ֵ��case��ֵ���ν���ƥ��
 * ���ɹ�ƥ�䵽case��ֵ�󣬻�ִ��case��Ĵ���
 * �жϴ��д����Ƿ���break������У�����ִ�У����û�У���������͸����case������default
 * ����ж�
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("������");
		/**
		 * �ܽ᣺a����֧��5���������ͣ�byte short char int
		 * JDK1.5֮��֧��String
		 */
		switch(1){
		case 1:System.out.println(1);break;
		case 2:System.out.println(2);break;
		case 3:System.out.println(3);break;
		//�ܽ᣺default�Ǳ���ѡ��ɼӿɲ���
		//�����default֮ǰ������break��default����ִ��
		default:System.out.println(0);break;

		
		}

	}

}
