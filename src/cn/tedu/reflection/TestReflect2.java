package cn.tedu.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//本类用于测试暴力反射
public class TestReflect2 {
    @Test
    //定义单元测试方法getField()用来获取属性
    public void getField() throws Exception {
        //获取Person类的字节码对象
        Class<?> clazz = Class.forName("cn.tedu.reflection.Person");
        //3.获取私有属性(猜猜是哪个)
        Field f = clazz.getDeclaredField("name");
        //4.根据获取到的属性对象获取其类型
        System.out.println(f.getType().getName());
        //5.1设置属性的值
        //set(m,n)m--代表的是给那个对象设置的值,n--是要设置什么值
        //5.2通过反射的方式创建对象
        Object obj = clazz.newInstance();
        //5.3暴力反射:设置私有可见
        f.setAccessible(true);
        //给指定的对象设置值
        f.set(obj,"day19");
        System.out.println(f.get(obj));
        //Field[] f = clazz.getFields();
//        for (Field s:f) {
//            System.out.println(s.getName());
//            String name = s.getType().getName();
//            System.out.println(name);
//        }
    }
    @Test
    public void getF ()throws Exception{
        Class<?> clazz = Person.class;
        Field age = clazz.getDeclaredField("age");
        System.out.println(age.getType().getName());
        Object o = clazz.newInstance();
        age.setAccessible(true);
        age.set(o,15);
        System.out.println(age.get(o));
    }
    //2.通过暴力反射获取和设置私有方法
    @Test
    public void getFunction()throws Exception{
        //获取字Person类节码对象
        Class<? extends Person> clazz = new Person().getClass();
        //getDeclaredMethod(n,x,y,z);
        //m--是要获取那个方法的方法名
        //x,y,z这些是指方法的参数类型,注意是字节码对象
        Method m = clazz.getDeclaredMethod("save", String.class, int.class);
        //没有对象就通过反射创建对象
        Object p = clazz.newInstance();
        //想要执行私有方法,需要先设置私有可见
        m.setAccessible(true);
        //4.执行获取到的私有方法save(String,int)
        //invoke(n,x,y,z)--n是要执行那个对象的方法,x,y是方法的参数
        m.invoke(p,"蟹老板",100);
    }

}
