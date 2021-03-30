package cn.tedu.api.day13;

import java.io.*;
import java.util.Scanner;

//本类用于测试IO流复制案例
public class Test3_CopyFile {
    public static void main(String[] args) {
        System.out.println("请输入要复制的文件");
        Scanner scanner = new Scanner(System.in);
        String fileIn = scanner.nextLine();//D:\\ready\\7.jpg
        System.out.println("请输入复制到哪个文件");
        String fileOut = scanner.nextLine();//D:\\ready\\8.jpg
        File from = new File(fileIn);
        File to = new File(fileOut);
        //copyinzf(from, to);
        copyinzj(from, to);

    }

    public static void copyinzj(File from, File to) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(from));
            out = new BufferedOutputStream(new FileOutputStream(to,true));
            int d;
            //需求:想要实现批量读取,使用的是重载的read(byte[] data)
            //可以传输数组参数,批量度,数组需要自定义
            //长度:建议与源码保持一致,8*1024=8192
            byte[] data = new byte[1024 * 10];
            long a = System.currentTimeMillis();
            while ((d = in.read(data)) != -1) {
                out.write(data, 0, d);
            }
            long b = System.currentTimeMillis();
            System.out.println((b-a)+"ms");
            System.out.println("复制完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void copyinzf(File from, File to) {
        Reader in = null;
        Writer out = null;
        try {
            //创建高效字符输入流
            in = new BufferedReader(new FileReader(from));
            //创建高效字符输出流
            out = new BufferedWriter(new FileWriter(to,true));
            //开始复制操作
            //定义变量用来保存读到的数据
            //边度边写
            int b;
            while ((b = in.read()) != -1) {//while循环边度边写
                out.write(b);//把当前循环读到的数据写到目标文件中
            }
            System.out.println("恭喜您,文件复制完成");
        } catch (IOException e) {
            System.out.println("很抱歉,文件复制失败");
            e.printStackTrace();
        } finally {
            /*流资源必须释放,释放的是之前使用过程中的所有流对象
             * 关闭流是有顺序的,注意,后面出现的流先释放,为了不影响代码*/
            try {
                //释放资源
                /**/
                out.close();//用来关闭字符输出流
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();//用来关闭字符输入流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
