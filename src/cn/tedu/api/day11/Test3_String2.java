package cn.tedu.api.day11;

public class Test3_String2 {
    public static void main(String[] args) {
        //method1();//测试通过+进行拼接
        method2();//测试优化后的拼接
    }

    public static void method2() {
        //定义要拼接的字符串
        String s = "abcdefghijklmnopqrstuvwxyz";
        //定义变量用来保存最终拼接的结果

        /*优化1:String-->StringBuffer/StringBuilder*/
        StringBuffer sb = new StringBuffer();//创建工具类对象1
        StringBuilder sb2 = new StringBuilder();//创建工具类对象2

        //拼接10000次
        //给程序添加一个计时的功能
        //获取系统当前时间作为开始时间
        long t1 = System.currentTimeMillis();//ms
        for(int i=0;i<10000;i++){
            //优化2:+-->append()
            sb.append(s);
        }
        //过去系统当前时间作为结束时间
        long t2 = System.currentTimeMillis();
        //打印拼接的效果
        System.out.println(sb.toString());
        //打印拼接花费的总时间
        System.out.println(t2-t1);
    }

    //创建方法用来测试+拼接
    public static void method1() {
        //定义要拼接的字符串
        String s = "abcdefghijklmnopqrstuvwxyz";
        //定义变量用来保存最终拼接的结果
        String result="";
        //拼接10000次
        //给程序添加一个计时的功能
        //获取系统当前时间作为开始时间
        long t1 = System.currentTimeMillis();//ms
        for(int i=0;i<10000;i++){
            result = result+s;
        }
        //过去系统当前时间作为结束时间
        long t2 = System.currentTimeMillis();
        //打印拼接的效果
        System.out.println(result);
        //打印拼接花费的总时间
        System.out.println(t2-t1);
    }

}
