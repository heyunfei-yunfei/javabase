package cn.tedu.reflection;
//本类用于测试暴力反射的物料类
public class Person {

    //定义私有属性
    private String name;
    private int age;
    //定义私有方法

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void update(){
        System.out.println("update().....");
    }
    private void save(String s,int n){
        System.out.println(n+"save()...."+s);
    }
}
