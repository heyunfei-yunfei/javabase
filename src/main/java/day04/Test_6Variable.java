package day04;

public class Test_6Variable {
	//3.定义成员变量
	//位置:类里方法外
	//无需手动初始化,会自动赋予对应类型的默认值
	//作用域:在整个类中都生效,类消失,变量才会消失
	//创建入口函数
	static int count;
	//变量的使用原则:就近原则
	static int sum=200;
	
public static void main(String[] args) {
	
	//定义局部变量
	//第一位置:方法里和局部代码块里
	//必须手动初始化
	//作用域:在方法/局部代码块里,对应的代码块执行完毕,局部变量也是放了
	int a;
	int sum = 100;//定义在方法中的局部变量sum
	System.out.println(sum);//变量的就近原则,使用的就是自己附近的变量值100
	System.out.println(count);
}
}
