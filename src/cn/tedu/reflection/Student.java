package cn.tedu.reflection;
//本类用于测试反射先准备的物料类
public class Student {
    //定义成员变量
   public String name;
   public int age;
    //2.定义构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //3.定义成员方法
    public void tell(){
        System.out.println("我有一个小秘密就不告诉你");
    }
    // 重写toString,目的是为了方便查看对象的属性值
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
