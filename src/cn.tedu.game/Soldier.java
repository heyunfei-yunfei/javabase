package cn.tedu.game;

import java.util.Random;

/*本类用于封装士兵相关的属性和方法
* 封装成一个"类"组件*/
public class Soldier {
    //定义属性--成员变量--可以不用初始化,默认值时0
    int id;//定义编号
     int blood=100;//定义血量
    AK47 a;//默认值null
    //定义成员方法
    public void go(){
        //this是一个特殊的引用,引用的就是"当前对象"的地址,代表的就是本类的对象
        System.out.println(this.id+"士兵在前进");
    }
    public void attack(){
        if (blood==0){
            System.out.println("这是"+id+"号士兵的尸体!");
            return;
        }
        System.out.println(this.id+"号士兵在进攻");
        //模拟进攻掉血
        int d = new Random().nextInt(10);//[0>d<10)
        //当前血量
        blood = -d;
        if(blood<0){//不能出现负数的情况
           blood=0;//如果血量变成了负数,归零
        }
        System.out.println("当前血量:"+blood);
        if (blood==0){
            System.out.println(this.id+"士兵阵亡了");
        }

    }
}
