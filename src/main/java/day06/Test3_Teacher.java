package day06;
//��������OOP�ۺ���ϰ
public class Test3_Teacher {
public static void main(String[] args) {
	//����Teacher��Ķ���
	Teacher t = new Teacher("����","Ů",25,8000);
	Teacher t3 = new Teacher();
	System.out.println(t);
	t.setName("������¬����");
	System.out.println(t.getName());
	
}
}
//1.����Teacher��
class Teacher{
	//2.1
	private String name;//����
	private String gender;//�Ա�
	 private int age;//����
	 private double salary;//����
	 public void teach(){
		 System.out.println("�ڿҵĴ���");
	 }
	 //���ȫ�ι��죨������������Զ��ǹ��췽����
	 /**
	  * ���췽��������ͬ������û�з���ֵ���͵ķ���
	  * ���췽�������ã�������������
	  * ����ʱ������������
	  * @param name
	  * @param gender
	  * @param age
	  * @param salary
	  */
	 public Teacher(String name,String gender,int age,double salary){
		 System.out.println("����:"+name+" �Ա�:"+gender+" ����:"+age+" ����:"+salary);
	 }
	 public Teacher(){System.out.println("�޲ι���");}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
