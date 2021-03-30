package cn.tedu.api.day13;

import java.io.*;

public class Test2_Writer {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    public static void method2() {
        Writer wr = null;
        try {
            //默认状态是不追加,也就是也就是覆盖原有数据
            wr = new BufferedWriter(new FileWriter("D:\\ready\\out.txt",true));
            wr.write(98);
            wr.write(99);
            wr.write(100);
            wr.write("hello");
            wr.write("io");
            wr.write("创建高效字符输出流对象");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                wr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void method1() {
        Writer wr = null;
        try {
            //需求:保持原有的数据,在不改变原数据的基础上,在它的末尾添加新数据
            /*此构造函数的第二个参数标识,是否覆盖写出文件中的原有数据
            * 默认覆盖,如果不想覆盖,就把这个参数的值设置为true*/
            wr = new FileWriter("D:\\ready\\out.txt",true);
            wr.write(97);
            wr.write(98);
            wr.write(99);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                wr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
