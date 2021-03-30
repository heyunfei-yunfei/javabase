package cn.tedu.api.net;

import java.io.*;

//测试按行读写的工具类
public class TestIo {
    public static void main(String[] args) {
        //读一行
       // method();
       // method2();
        method3();
    }

    private static void method3() {
        BufferedReader in=null;
        PrintWriter out=null;
        try {
            in = new BufferedReader(new FileReader("1.txt"));
            out = new PrintWriter(new FileWriter("2.txt",true),true);
            String s;
            while ((s=in.readLine())!=null){
                out.println(s);
            }
            System.out.println("写出完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            out.close();
        }
    }

    private static void method2() {
        PrintWriter pt = null;
        try {
            pt = new PrintWriter(new FileWriter("2.txt",true));
            pt.print("张三李四王五主流");
            pt.print("张三李四王五主流");
            pt.print("张三李四王五主流");
            pt.print("张三李四王五主流");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            pt.close();
        }

    }

    //读一行
    private static void method() {
        //1创建对象
        //2调用方法读一行
        try {
            BufferedReader in = new BufferedReader(new FileReader("1.txt"));
            String data;
            while ((data=in.readLine())!=null) {
                System.out.println(data);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
