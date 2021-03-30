package day10;
//本类作为Inter接口的实现类
//实现类如果想使用接口的功能,建立与接口的关系
//需要时用implement关键字
//创建了接口的实现类InterImpl
//abstract public class InterImpl implements Inter{把自己变成抽象子类,或者重写父接口的所有抽象方法
public class InterImpl implements Inter{
    //在接口中创建测试是否可以有普通方法
    //添加并实现父接口中的所有抽象方法
    @Override// 注解,作为标记,这是一个重写的方法
    public void eat() {
        System.out.println("今天吃火锅");
    }
    @Override
    public void play() {
        System.out.println("玩啥玩,写代码吧");
    }
}
