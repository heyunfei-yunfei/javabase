package day07;
//本类用于测试局部变量与成员变量
public class Test2_Variable {
public static void main(String[] args) {
	Cat c = new Cat();
	c.eat();
}
}
//创建Cat类
class Cat{
	//创建成员变量
	//位置:类里方法外
	//无需手动初始化,会自动赋予对应类型的默认值
	//作用域:整个类中,类消失了,成员变量才会消失
	static int count;
	int sum = 200;
	//创建方法
	public void eat(){
		//创建局部变量
		//位置:方法里/局部代码块中
		//必须进行手动初始化
		//作用域:方法/代码块执行官完毕,局部变量随之释放
		int sum = 100;
		//变量的使用原则:就近原则
		System.out.println(sum);//就近原则:打印的是100
		//Cat this = new Cat();
		System.out.println(this.sum);//打印的是成员变量
		System.out.println(count);
		for(int i = 0;i<5;i++){//定义了局部变量i
			System.out.println(i);//局部变量i只能在局部变量中使用
		}
		//除了for循环,变量i失效,不能使用
		//报错:
		//变量i是一个不可以被引用的变量
		//System.out.println(i);
	}
}
