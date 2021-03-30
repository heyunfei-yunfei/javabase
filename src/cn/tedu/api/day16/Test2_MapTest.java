package cn.tedu.api.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//需求:接收用户输入的一串字符串,并统计每个字符出现的次数
public class Test2_MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一段字符串");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //创建map用来存放数据,格式:{a=3,b=5,c=9}
        /*统计的是每个字符出现的次数,所以字符是char类型,次数时int类型
        * 但由于泛型不可以使用基本类型,所以需要使用对应的包装类*/
        Map<Character,Integer> map = new HashMap<>();
        //String底层维护的是char[],所以从0开始遍历
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);//获取一串字符中指定位置上的字符
            //统计每个字符出现的次数,存到map中
            //要先拿着key到map中找是不是有value
            Integer value = map.get(c);
            //根据拿到的value,判断这个字符怎么存
            System.out.print(c);
            if(map.get(c)==null){//如果判断为null,说明之前没有存过这个字符
                map.put(c,1);//把c作为key存如,次数存1
            }else {
                map.put(c, value + 1);//如果不是null,说明之前存过,那么次数加1
            }
        }
        System.out.println(map);
    }
}
