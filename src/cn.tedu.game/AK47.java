package cn.tedu.game;

import java.util.Random;

public class AK47 {

    int bullets = 100;//定义子弹
    public void load(){
        bullets = 100;//重置子弹数为100;
        System.out.println("弹夹已装满");
    }
    public void fire(){//定义开火方法
        if(bullets==0){
            System.out.println("没有子弹啦");
            return;//没有子弹就不能开火
        }
        //随机产生发射子弹的数量
        int r = new Random().nextInt(10);
        //要发射的数量需要比剩下的子弹数多
        if(r>bullets){
            r = bullets;//剩下几棵发几颗
        }
        bullets = bullets-r;
        for (int i=0;i<r;i++){
            System.out.print("xiuxiu");
        }
        System.out.println();
        if (bullets==0){
            System.out.println("弹夹空了");
        }
    }
}
