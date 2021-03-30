package cn.tedu.api.day15;

import java.util.Objects;

//封装实体类Student用于Set去重
public class Student {
    //提供并封装对应的属性
    private String name;
    private int age;
    private String addr;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    //如果提供了含参构造,需要手动提供无参构造
    //提供全参构造
    public Student(String name, int age, String addr) {
        super();
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(addr, student.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, addr);
    }
}
