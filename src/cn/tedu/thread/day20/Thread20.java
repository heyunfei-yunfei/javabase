package cn.tedu.thread.day20;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

 public class Thread20 {
    public static void main(String[] args) {

    }
    @Test
    public void H(){
        Lion lion = Lion.getL();
        Lion lion2 = Lion.getL();
        System.out.println(lion==lion2);
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
    for (int i =0;i<10;i++){
        System.out.println(i+"="+Thread.currentThread().getName());
    }

    }
}
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface TaGer{

}
class Lion{
    private static Lion l;
    private Lion(){
    }

    public static Lion getL() {
        if (l==null){
            l=new Lion();
        }
        return l;
    }
}



