package cn.tedu.thread.day17;

public class Teacher {
    public static void main(String[] args) {
        Animal a = new Animal();
       Student.get();
       a.get();
    }
}
class Student{
    public static void get(){
        System.out.println("我是父类的get方法");
    }
}
class Animal extends Student{

}