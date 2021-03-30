package cn.tedu.api.day14;

import java.io.Serializable;

//本类是用与封装学生类
/*如果本类想要完成序列化,必须实现可序列化接口,否则报错:
* 报错:java.io.NotSerializableException.cn.tedu.oopextends
* Serializable接口是一个空接口,里面一个方法都没有
* 作用:作为标志,标志这个类可以被序列化/反序列化*/
public class Student implements Serializable {
    /*需要给每个序列化的文件分配唯一的UID值*/
    private static final  long serialVersionUID = -6881870931324839026L;
    //pojo对象,就是实体对象
    //1定义属性
    private String name;
    private int age;
    private String gender;
    private String address;

    //2根据属性生成构造方法
    //根据属性生成全参构造方法,注意手动添加无参构造
    public Student(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        System.out.println("我是Student类的全参构造");
    }

    public Student() {
        System.out.println("我是Student类的无参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
