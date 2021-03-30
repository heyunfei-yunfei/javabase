package day06;
//本类用于测试封装
public class Test2_Private {
	public static void main(String[] args) {
		//创建学生类对象--通过new关键字创建学生类对象
		Student st = new Student();
		st.setSubject("java培优");
		System.out.println(st.getStubject());
		//初步测试Student类对象s
		System.out.println(st.name);//可以通过"."来调用对象的属性值
		System.out.println("0000000");
		st.eat();//可以通过"."来调用对象的study（）
	}
	
}
//1.通过class关键字创建学生类--描述学生这一类型--属性+方法
class Student{
	//2.定义属性--成员变量--类内方法外--无需手动初始化
	String name;//姓名
	int sno;//学号
	//
	private String subject;//科目
	//对外提供公共的属性值设置方式
	public void setSubject(String s){
		subject = s;
	}
	//对外提供公共的属性值查看方式
	public String getStubject(){
		return "java培优";
	}
	//定义行为
	
	private void study(){
		System.out.println("正在学习JAVA");
	}
	
	public void eat(){
		//我们可以在公共的方法里调用私有的方法
		study();
		System.out.println("端起了我的饭盆儿");
	}
	
	
}
