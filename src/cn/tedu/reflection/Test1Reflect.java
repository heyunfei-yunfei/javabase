package cn.tedu.reflection;

import org.junit.Test;

import javax.crypto.spec.PSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

//本类用于测试反射
public class Test1Reflect {
   /**单元测试方法:是java测试最小单位,使用灵活,推荐程度:5颗星
    * 语法要求:被@Test注解修饰+没有参数+public+void没有返回值类型
    *单元测试方法运行的方式 */
   @Test
   public void getClazz() throws Exception {
      /*右键选择要复制的类名,选择Copy Qualified Name,复制类的全路径名*/
      //本方法的参数是类的全路径名(包名+类名),并且需要抛出异常
      Class<?> student1 = Class.forName("cn.tedu.reflection.Student");
      Class<?> student2 = Student.class;
      //先创建匿名对象,匿名对象没有名字,只是用一次,再获取字节码对象
      Class<? extends Student> student3 = new Student().getClass();
      System.out.println(student1);//反射得到类的字节码Class对象
      System.out.println(student2.getName());//获取类的全路径名(包名+类名)
      System.out.println(student3.getSimpleName());//打印的是类名
      System.out.println(student3.getPackage());//获取包名
   }
   //3.通过单元测试来获取构造方法
   @Test
   public void getConstructor(){
      //1.获取字节码Class对象
      Class<?> clazz = Student.class;
      //获取构造方法们,并放入cs数组中
      Constructor<?>[] cs = clazz.getConstructors();//表示获取多个构造方法
      //获取每个构造方法
      //使用新循环来完成
      for (Constructor c: cs) {
         //4.操作每轮循环到的当前构造函数
         System.out.println(c.getName());//获取当前构造的名字
         Class[] cps = c.getParameterTypes();//获取构造函数中的参数类型们
         System.out.println(Arrays.toString(cps));
      }
   }
   //通过单元测试来获取成员方法
   @Test
   public void getFunction() throws ClassNotFoundException {
      //获取类的字节码对象
      Class<?> s1 = Class.forName("cn.tedu.reflection.Student");
      Method[] ms = s1.getMethods();
      for (Method m:ms){
         System.out.println(m.getName());//获取方法名
         System.out.println("**************");
         Parameter[] mps = m.getParameters();
         System.out.println(Arrays.toString(mps));
      }
      System.out.println();
   }

   //5.通过单元测试获取成员变量
   @Test
   public void getFields(){
      //获取字节码对象
      Class<? extends Student> clazz = new Student().getClass();
      //获取成员变量
      /**注意!!!成员变量的修饰符必须是public才能获取到
       * 所以之前采用的是默认修饰符,获取不到*/
      Field[] fls = clazz.getFields();
      for (Field f:fls) {
         System.out.println(f.getName());//获取属性名
         System.out.println("**************************");
         System.out.println(f.getType().getName());//获取变量的类型
          //字节码对象,构造方法,成员变量(只能获取public修饰的变量),普通成员方法
      }
   }
   //6.通过单元测试反射创建对象
   /**总结:利用反射技术创建对象的两种方式:
    * 1.通过字节码对象直接调用newInstance(),触发的是无参构造来创建对象
    * 2.根据方法数先获取指定的构造方法对象,再通过此对象调用newInstance()
    * 触发的是对应参数的构造函数来创建对象,注意参数类型是字节码对象**/
   @Test
   public void createObject() throws Exception {
   //获取类对象
      Class<?> clazz = Student.class;
      //创建对象
      Object obj = clazz.newInstance();/**触发的是无参构造**/
      System.out.println(obj);//Student{name='null', age=0}
       //3.可以获取指定的构造方法,根据方法的参数来指定
      //而且千万注意,传入的参数不是参数的直接类型,而是对应的字节码对象
      Constructor<?> c = clazz.getConstructor(String.class, int.class);
      //4.利用刚刚拿到的构造方法对象,创建Student对象,触发的是全参构造
      Object obj2 = c.newInstance("梁山伯", 3);
      System.out.println(obj2);
      //测试子类Student中的方法,先得转回子类型
      /*为什么要把Object强转成子类类型Student?
      * 因为我们想要使用子类的特有属性和方法,而父类没有
      * 所以父类想使用子类的特有属性和方法,需要强制类型转成子类类型
      * 这个操作属于多态,称作向下造型(转型)--想使用子类特有功能时做此操作
      * 把子类类型看做父类类型(花木兰替父从军),称为多态的向上造型(转型)
      * 这个是为了统一调用方式,把所有子类类型都当做父类来看,比如异常*/
      Student s = (Student) obj2;
      System.out.println(s.name);
      System.out.println(s.age);
      s.tell();
   }
}
