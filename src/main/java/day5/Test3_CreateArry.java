package day5;

import java.util.Arrays;

public class Test3_CreateArry {
public static void main(String[] args) {
	//��������
	//��̬����--�Ѿ�֪���������еľ�������
	char[] c1 = {'h','e','1','1','o'};
	char [] c2 = new char[5];
	//��̬����--֪������ĳ���,�����ڶ�̬�Ĵ�����
	char[] c3 = new char[5];//���ڴ��п���һ�������Ŀռ�,
	//ͨ�������±�,���������е�ÿ��Ԫ��,������Ԫ�ظ�ֵ
	//�����±��0��ʼ,���������±��������ĳ���-1
	c3[0]='h';//������ĵ�һ��Ԫ�ظ�ֵ
	System.out.println(c3.toString());
	//char���͵ײ����˴���,����ֱ�Ӵ�ӡ�����е�����
    /*
     * ����char�������������������Ҫ�鿴�����еľ���Ԫ��
     * ��Ҫʹ������Ĺ�����Arrays��toString(������)����*/
	String[] s = {"a","b","c"};
	for(int i = 0;i<s.length;i++){
		System.out.println(Arrays.toString(s));
	}
}
}
