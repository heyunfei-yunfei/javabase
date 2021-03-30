package cn.tedu.api.day11;

import java.util.Objects;

//本类用于测试Object类的使用
public class Test1_Object {
    public static void main(String[] args) {
        /*测试toString():返回对象的字符串表示*/
        //创建Student对象
        Student s = new Student(18, "李逵");
        //打印学生对象,查看属性值是否赋值成功
        //第一次打印测试:打印结果:cn.tedu.api.day11.Student@1b6d3586,对象的地址值
        //原因:在打印s对象时,底层会自动调用Object类的toString方法
        //打印的是对象的地址值,所以就需要重写
        /*查看源码的方式:按住Ctrl键,鼠标移动到目标位置上即可*/
        //再次打印学生对象的s
        //第二次测试IDE结果:Student[age=18, name='李逵']
        //原因:重写的Object中的toString()后,就可以打印对象的属性值了
        System.out.println(s);
        //测试hashCode():这个方法时返回对象在内存中的哈希码值
        //调用hashCode()查看结果
        System.out.println(s.hashCode());
        //创建对象s2与s对象的属性值相同
         Student s2 = new Student(18,"李逵");
         //第一次测试:结果:false
        //底层用了==进行对象间的比较.==在此处比较的是s与s2
        //保存的地址,s和s2是两个对象,地址值不同,所以放回的是false
        //public boolean equals(Object obj){return(this==obj);}
        System.out.println(s.equals(s2));

    }
}
class Student{
    //定义属性
    int age;
    String name;
    //生成全构造方法,并手动提供无参构造
    public Student(){

    }
    public Student(int age, String name) {
        super();//
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ']';
    }
    //重写equals()
    //需求:比较s与s2对象,如果属性值完全一样,就认为是同一个对象
    //就让本方法返回比较的结果为true
    @Override
    public boolean equals(Object obj) {
        //匹配类型--判断是否为学生类型,如果连学生都不是,直接返回false
       if (obj instanceof Student){//判断是否是同一个类型,超类和派生类也可以,所以说不精确,接下来要强转
           //把obj强转成Student类型,因为想用子类的特有属性,如果不转,只能用父类的属性
           Student argsStudent = (Student)obj;
           if (this.name ==argsStudent.name&&this.age == argsStudent.age){
            return true;
           }
       }
       return false;
    }

}
