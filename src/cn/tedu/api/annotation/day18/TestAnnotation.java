package cn.tedu.api.annotation.day18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*本类用于测试自定义注解*/
public class TestAnnotation {}
/**
 * 0.先自定义注解1.注解名定义的时候需要使用"@interface注解名"的方式来定义
 */
//搜西安注意:注解的语法与之前java的语法不同,不要混为一谈
//1.定义自定义注解,注解名为Test
/**1.注解名定义的时候需要使用"@interface注解名"的方式来定义*/
//1.2通过@Target注解表示此自定义注解可以使用的位置

/**
 * 2.注意@Target使用时需要导包
 * 通过ElementType的静态常量值可以指定自定义注解使用的位置
 * 如果有多个值,可以使用"{,}"的格式来写:
 * @Target({ElementType.METHOD,ElementType.TYPE})
 */
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})//表示此注解可以用来标记方法
//1.3通过@Rentention注解表示此自定义注解的生命周期
/**3.注意@Rentention注解使用时需要导包
 * 通过RetentionPolicy.静态常量来确定此自定义注解的生命周期
 * 也就是指自定义注解可以存活到那个阶段,源文件/字节码文件/运行时
 * 只能三选一,不能写多个*/
@Retention(RetentionPolicy.SOURCE)
@interface Test {
    /**5.自定义注解还可以添加功能--给注解添加属性
     * 注意int age();不是方法的定义,而是自定义注解中定义属性age的语法
     * 如果为了使用时方便,还可以给属性设置默认值,这样就可以直接使用
     * 格式:"int age()default 0;"*/
    int age() default 0;
    /**6.注解中还可以添加功能--定义特殊属性value
     * 特殊属性的定义方式与普通属性的定义方式相同只是使用方式不同
     * 使用此属性赋值的时候可以不用写成"@Test(value="apple")"
     * 格式可以简化成"@Test("lemon")",直接写值
     * 但是在自定义注解类中默认值的赋值不能简写
     * 如果自定义了默认值,使用时,可以不用赋值,直接使用属性值的默认值*/
    String value()default "banana";
}

//2.1自定义一个类,用来测试自定义注解
/**4.使用注解时,使用自定义注解名前加上@符号即可使用*/
//@Test
class TestAnNo {
    /**测试1:给TestAnNo类/name属性/eat方法都添加了@Test注解,只有方法上不报错
     * 结论:自定义注解能够加在什么位置,取决于@Target的值
     * 测试2:修改@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
     * 结论:@Test注解可以有多个位置,也就是多个值,格式{,},@Target底层维护的是ElementType[]
     * 的数组*/
    /**测试6:给特殊属性value赋值的时候可以简写,相当于value="value="apple""*/
    //@Test(value = "apple")
    //@Test("apple")
    @Test/**测试7:因为已有默认值,所以不用给特殊属性value赋值,直接使用*/
    String name;
    /**
     * 测试3:添加了age属性以后,@Test注解报错
     * 结论:当自定义注解没有定义属性时,可以直接使用,如果没有属性了,就必须给属性赋值
     * 测试4:给@Test注解的age属性赋值以后,就不报错了
     * 结论:给属性赋值时的格式"@Test(age=10)",注意,不能直接写10这种错误格式
     * 测试5:给age属性赋予默认值后,还可以不加属性值直接使用,此时属性值就是默认值*/
    //@Test
    public void eat(){
        System.out.println("又该干饭了~~");
    }
}
