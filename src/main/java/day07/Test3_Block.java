package day07;
//本类用来测试构造代码块与局部代码块
public class Test3_Block {
	public static void main(String[] args) {
		Teacher t = new Teacher();//通过调用无参构造创建对象
		Teacher t1 = new Teacher("吐泡泡","java");//通过调用全参构造创建对象
		System.out.println(t1.name);
		System.out.println(t1.subject);
		t.teacher();
		t.study();
	}
}
//定义Teacher类
class Teacher{
	String name;
	String subject;//定义属性
	//构造代码块:1.位置:类里,方法外;
	//作用:用来提取构造方法的共性功能
	//执行时机:在调用构造方法之前调用
	{
		subject = "java培优";
		System.out.println("hahahah");
	}
	//构造方法的定义:修饰符 方法名(参数列表){方法体}
	public Teacher(){
		System.out.println("这是一个无参构造");
	}//定义方法
	public Teacher(String s,String n){
		name = s;
		subject = n;
		System.out.println("这是一个全参构造");
	}//定义方法
	
	public void teacher(){
		System.out.println("正在上课ing");
	}
	public void study(){
		//创建局部代码块
		//位置:方法里   作用:用来控制变量的作用范围(作用范围越小越好,因为越小越小越安全)
		//执行时机:调用本方法时
		{
			subject = "hahsdjflak";
			int i = 10;
			System.out.println(i);
		}
		System.out.println(subject);
		//报错:因为超出了变量i的使用范围
		//System.out.println(i);
		System.out.println("正在备课ing");
	}

}

