package cn.tedu.api.day14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//本类用来测试编码转换流
/*编写(保存)时的编码与查看时的编码一致才不会乱码*/
public class Test2_Encode {
    public static void main(String[] args) {
        //创建流对象
        OutputStreamWriter out = null;//局部变量需要初始化,默认值null
        try {
            //"参数:1.txt不是磁盘路径,而是直接生成在项目下的和src同级别的文件,需要刷新多次F5 "(Eclipse软件需要)
            out = new OutputStreamWriter(new FileOutputStream("1.txt",true),"utf-8");
            out.write("我们可以的~马上要干饭了!");
            out.write("成都,赵雷");
            System.out.println("恭喜你,输出成功");
        } catch (IOException e) {
            System.out.println("对不起,输出失败了");
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
