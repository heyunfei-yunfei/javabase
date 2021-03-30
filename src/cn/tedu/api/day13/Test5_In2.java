package cn.tedu.api.day13;

import java.io.*;

//此类用于测试字符流的读取
public class Test5_In2 {
    public static void main(String[] args) {
        //method();//普通字符流的读取
        method2();//高效字符流的读取
    }

    //用于普通字符流的读取
    public static void method() {
        //创建用来读取的普通字符流对象
        //Reader是字符读取流的抽象父类,抽象类不可以创建对象
        Reader r = null;
        try {
            r = new FileReader("D:\\ready\\4.txt");
            int d;
            while ((d = r.read()) != -1) {
                System.out.println(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //用于高效字符流的读取
    public static void method2() {
        Reader r = null;
        try {
            //BufferedReader是高效字符读取流
            //底层维护了一个char[],数组的长度是8*1024=8192字节 8k
            r = new BufferedReader(new FileReader("D:\\ready\\4.txt"));
            int d;
            while ((d = r.read()) != -1) {
                System.out.println(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
