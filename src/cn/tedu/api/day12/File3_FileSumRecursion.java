package cn.tedu.api.day12;

import java.io.File;

//本类用于递归文件夹总大小
public class File3_FileSumRecursion {
    public static void main(String[] args) {
        //注意:指定的目录是真实存在的,如果文件夹不存在,如果是空文件夹大小为0
        //指定要求哪个目录的总大小
        File f = new File("D:\\ready");
       long total = size(f);
        System.out.println(total);
        //调用size()求目录大小

        //接收结果,并打印
    }

    public static long size(File f) {
        //列出文件夹的所有资源
        File[] list = f.listFiles();
        //遍历数组,一次处理数组中的每个File对象
        long sum=0;
        for (int i=0;i<list.length;i++){
            //通过下标操作当前遍历到的file元素
            File fs = list[i];
            if (fs.isFile()){
                //是文件,求文件字节量大小,累加就行
                sum=sum+fs.length();
            }else if(fs.isDirectory()){
                //方法的递归:方法内部调方法本身
                sum=sum+size(fs);
            }
        }
        return sum;//把sum记录的总大小返回到main()调用的位置
    }

}
