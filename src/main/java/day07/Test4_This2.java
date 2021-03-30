package day07;
//本类用于this的测试
public class Test4_This2 {
public static void main(String[] args) {
	Dog d = new Dog();
	Dog d1 = new Dog("旺财");
}
}
/**
 * this可以用来进行构造方法中之间的调用
 * 但是注意! 调用是单向的,不能双向来回调用,会死循环
 */
//创建小狗类
class Dog{
	//定义属性
	String name;
	
	//定义构造方法
	
	public Dog(){
		//在无参构造中调用含参构造的功能
		//规定:this必须出现在构造方法中第一行
		this("旺旺");
		System.out.println("无参构造");
	}
	//提供含参构造
	public Dog(String s){
		//在含参构造中调用无参构造的功能
		//规定:this关键字必须在构造方法中的第一行
		//this();
		System.out.println("含参构造"+s);
	}
	public void study(){
		
	}
}
