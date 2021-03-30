package day09;

import java.util.InputMismatchException;
import java.util.Scanner;

//本类用于测试异常入门案例
public class Test1_ExceptionDemo {
    //创建入口函数main()

    /**
     *如果方法抛出异常,那么谁调用,谁需要解决(继续抛出/捕获解决)
     * 所以main()调用了method2(),如果main()不捕获处理,就也需要抛出
     * 注意:我们一般在main()调用之前捕获解决异常,而不是把问题抛给main()
     * 因为没人解决了
     */
    public static void main(String[] args) throws Exception {
        //method();//调用method方法
        //method1();//异常捕获
        method2();//异常抛出
    }
    //创建method2(),练习BUG解决方案三
    /*
    抛出的语法规则:
    在可能会出现异常的方法上加throws异常类型
    在抛出时也可以使用多态,不管时发生了什么异常,通通被Exception捕获
     */
    public static void method2() throws /*InputMismatchException,ArithmeticException?*/
            Exception {
        System.out.println("请输入要计算的第一个数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入要计算的第二个数字");
        int b = scanner.nextInt();
        System.out.println(a/b);
    }

    //创建method1()方法,练习BUG解决方案一
    public static void method1() {
        /**
         * 捕获的语法规则:
         * try{
         *     可能会出现异常的代码
         * }catch(异常的类型 异常的参数名){
         *     如果捕获到异常的对应解决方案
         * }
         */
        //按照学习的捕获语法编写try-catch结构
        try {//总结:try中放着的是可能会出现异常的代码
            //复写刚刚可能会发生的异常
            System.out.println("请输入要计算的第一个数");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("请输入要计算的第二个数字");
            int b = scanner.nextInt();
            System.out.println(a/b);
        } catch (InputMismatchException e) {//异常捕获1
            //如果发生异常被捕获,就执行此处被匹配到的解决方案
            System.out.println("输入的类型不正确,请输入正确的整数类型");
        }catch(ArithmeticException e){//异常捕获2
            //由于程序当中可能有多种异常,所以catch可以配合多次使用
            System.out.println("除数不能为0");
            //如果还有上述两种异常之外的异常之外的异常,用Exception匹配捕获
            //这个就是多态最为经典的一种方法,我们不关心子类的子类
            //只要是可解决的异常,都是Exception的子类,多态会把这些异常当做父类型来看
            //进而捕获,使用通用异常解决方案来解决
        }catch (Exception e){
            System.out.println("请输入正确的整数");
        }
    }

    //创建method()用来认为的暴露异常
    //因为main是静态方法,所以只能调用静态方法
    public static void method() {
        System.out.println("请输入要计算的第一个数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入要计算的第二个数字");
        int b = scanner.nextInt();
        //输出除法运算的结果
        //输入报错,InputMismatchException[输入不匹配异常]
        //除数输入为0时报错ArithmeticException[算数异常]
        System.out.println(a/b);
        //不要害怕BUG,真正的勇士敢于直面自己写的BUG
        //学会看报错信息的错误提示,确定字即错误的方向
        //学会看报错信息的行号提示,哪里报错点哪里,源码不会错,要看自己写的代码
    }
}
