package cn.tedu.api.day12;

import java.io.*;

//本类用与测试文件的读取
public class Test4_In {
    public static void main(String[] args) {
        method();//字节流的读取
        method5();
    }

    public static void method5() {
        //创建字节流读取的对象
        BufferedInputStream in=null;
        try {
            //new InputStream();抽象父类不能实例化
            //传入的参数是一个File对象
            //BIS是高效的读取流
            in = new BufferedInputStream(new FileInputStream("D:\\ready\\4.txt"));

            //InputStream in = new FileInputStream(new File("D:\\ready"));
            //传入的参数是一个路径

            //开始读取,每次读取一个字节
            int b;
            while ((b=in.read())!=-1) {//返回值为-1的时候表示没数据了,循环结束
                //每次打印读取到的内容
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();//打印错误信息到控制台
        }finally {
            try {
                //释放资源
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void method() {
        //创建字节流读取的对象
        InputStream in=null;
        try {
            //new InputStream();抽象父类不能实例化
            //传入的参数是一个File对象
            //InputStream in = new FileInputStream(new File("D:\\ready"));
            //传入的参数是一个路径
            in = new FileInputStream("D:\\ready\\4.txt");
            //开始读取,每次读取一个字节
            int b;
            while ((b=in.read())!=-1) {//返回值为-1的时候表示没数据了,循环结束
                //每次打印读取到的内容
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();//打印错误信息到控制台
        }finally {
            try {
                //释放资源
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
