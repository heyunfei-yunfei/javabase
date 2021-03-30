package day03;

public class Test5_Switch {
/**
 * 执行的顺序
 * 先拿到表达式的值
 * ，然后将a的值与case的值依次进行匹配
 * 当成功匹配到case的值后，会执行case后的代码
 * 判断此行代码是否有break，如果有，结束执行，如果没有，汇聚徐向后穿透所有case，包括default
 * 如果判断
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("输出语句");
		/**
		 * 总结：a可以支持5种数据类型：byte short char int
		 * JDK1.5之后支持String
		 */
		switch(1){
		case 1:System.out.println(1);break;
		case 2:System.out.println(2);break;
		case 3:System.out.println(3);break;
		//总结：default是保底选项，可加可不加
		//如果在default之前遇到了break，default不会执行
		default:System.out.println(0);break;

		
		}

	}

}
