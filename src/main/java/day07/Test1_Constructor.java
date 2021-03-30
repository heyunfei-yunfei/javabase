package day07;
//本类用于测试构造方法
public class Test1_Constructor {
	public static void main(String[] args) {
		//创建Person类测试
		Person p = new Person("beautiful");
		Person p1 = new Person("关羽",15,"荆州");
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.address);
		p.study();
	}
	
}
class Person{
	//定义竖向成员变量
	String name;
	int age;
	String address;
	//默认存在无参构造,当new Person()会自动触发无参构造
	//构造方法也存在重载的现象
	//重载:在同一个类中存在方法名相同,且参数列表不同的方法
	public Person() {
		System.out.println("我是Person类的无参构造方法");
	}
	//创建含有1个有参数的构造方法
	public Person(String s) {
		System.out.println("我是Person类的1个参数的构造方法"+s);
	}
	
	//创建一个Person类的全参构造
	public Person(String n,int a,String addr) {
		this.name = n;
		this.age = a;
		this.address = addr;
		System.out.println("我是Person类的3个参数的构造方法"+n+a+addr);
	}

	//定义行为
	public void study(){
		System.out.println("又是美好的一周~~奥利给~~");
	}
}