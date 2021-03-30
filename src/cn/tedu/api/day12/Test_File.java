package cn.tedu.api.day12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//本类用于测试文件流
public class Test_File {
    public static void main(String[] args) {
        //创建File对象
        //手动在windows中创建文件
        //注意:需要手动创建所用到的文件
        //---\在代码中具有特殊的意义,转义的作用,所以表示这个是一个真正的斜杠需要转一下
        File file = new File("D:\\ready\\1.txt");
        //测试常用的方法
        //文件文件属性
        System.out.println(file.length());//获取指定文件的字节量
        System.out.println(file.exists());//判断文件是否存在
        System.out.println(file.isFile());//判断指定内容是不是文件
        System.out.println(file.isDirectory());//判断指定文件是不是文件夹
        System.out.println(file.getName());//获取文件名
        System.out.println(file.getParent());//获取父级目录
        System.out.println(file.getAbsolutePath());//获取文件绝对路径带盘符
        //创建与删除
        try {
            file = new File("D:\\ready\\2.txt");
            //如果指定创建的文件的文件夹不存在,会抛出异常:java.io.IOException:系统找不到指定的路径
            System.out.println(file.createNewFile());//在win中创建不存在的文件2.txt
            file = new File("D:\\ready\\m");
            System.out.println(file.mkdir());//在windows中创建不存在的单级目录
            file = new File("D:\\ready\\a\\b\\c");
            System.out.println(file.mkdirs());//在windows中创建不存在的多级目录
            //删除文件或者空文件夹,c文件夹被删除
            System.out.println(file.delete());
            file = new File("D:\\ready");
            //查看文件夹下的文件名称,返回值类型是String[]
            String[] list = file.list();
            System.out.println(Arrays.toString(list));
            //列出文件夹中所有的文件 和文件对象,返回值是File[]
            //数组的每个元素都是File对象,可进一步操作
            File[] listFiles = file.listFiles();
            System.out.println(Arrays.toString(listFiles));
            System.out.println(listFiles[0].length());
            int sum = 0;
            for (int i=0;i<listFiles.length;i++){
                File f = listFiles[i];
                if (f.isFile()){

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件列表

    }


}
