package cn.tedu.game;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Get {
    @Test
    public void FanShe(){
        try {
            Class<?> clazz = Class.forName("cn.tedu.game.Apple");
            Field p = clazz.getDeclaredField("p");
            Object obj = clazz.newInstance();
            p.setAccessible(true);

            System.out.println(p.get(obj));
            Constructor<?> c = clazz.getConstructor(int.class, String.class);
            Object xu = c.newInstance(100, "徐峥");
            Apple xu1 = (Apple) xu;
            System.out.println(xu1.s);
            xu1.eat();
            Method eat = clazz.getMethod("eat");
            System.out.println("*****");
            eat.invoke(obj);
            System.out.println("*****");
            Method me = clazz.getDeclaredMethod("go", int.class, String.class);
            me.setAccessible(true);
            me.invoke(obj,888,"成龙");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
