package cn.tedu.api.day14;

import java.io.*;

//本类用于测试序列化与反序列化
public class Test1_Seri {
    public static void main(String[] args) {
        //method1();//测试序列化
        method2();//测试反序列化
    }
    public static void method2(){
        ObjectInputStream obi = null;
        try {
            obi = new ObjectInputStream(new FileInputStream("D:\\ready\\2.txt"));
            Object o = obi.readObject();
            System.out.println(o);
            System.out.println("反序列化成功");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                obi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void method1() {
        //创建ObjectOutputStream流对象来完成序列化
        ObjectOutputStream obj = null;
        try {
            obj = new ObjectOutputStream(new FileOutputStream("D:\\ready\\2.txt"));
            Student s = new Student("刘德华",60,"男","中国香港");
            obj.writeObject(s);
            System.out.println("序列化成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                obj.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
