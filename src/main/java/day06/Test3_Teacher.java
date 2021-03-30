package day06;
//本类用于OOP综合练习
public class Test3_Teacher {
public static void main(String[] args) {
	//创建Teacher类的对象
	Teacher t = new Teacher("张三","女",25,8000);
	Teacher t3 = new Teacher();
	System.out.println(t);
	t.setName("玉麒麟卢俊义");
	System.out.println(t.getName());
	
}
}
//1.创建Teacher类
class Teacher{
	//2.1
	private String name;//姓名
	private String gender;//性别
	 private int age;//年龄
	 private double salary;//工资
	 public void teach(){
		 System.out.println("勤恳的打工人");
	 }
	 //添加全参构造（类里的所有属性都是构造方法）
	 /**
	  * 构造方法：与类同名，且没有返回值类型的方法
	  * 构造方法的作用：用来创建对象
	  * 调用时机：创建对象
	  * @param name
	  * @param gender
	  * @param age
	  * @param salary
	  */
	 public Teacher(String name,String gender,int age,double salary){
		 System.out.println("姓名:"+name+" 性别:"+gender+" 年龄:"+age+" 工资:"+salary);
	 }
	 public Teacher(){System.out.println("无参构造");}
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
