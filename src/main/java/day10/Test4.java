package day10;

public class Test4 {
    public static void main(String[] args) {
        Inter4 t = new Inter4Impl();
        t.save();
        t.update();
        t.delete();
        t.find();
        Inter4Impl i = new Inter4Impl();
        i.update();

    }
}
//创建接口1
interface Inter1{
    int age=10;
    void save();//保存功能
    void delete();//删除功能
}
interface Inter3{
    void update();//更新功能
    void find();//查询功能
}
//创建接口3用来测试接口与接口的继承关系
//接口之间可以建立继承关系,而且还可以多继承,
//接口与接口之间用逗号隔开
interface Inter4 extends Inter1,Inter3{
}
//创建Inter4接口的实现类并添加未实现的抽象方法
//abstract class Inter4Impl implements Inter4{
//接口和实现类之间可以建立实现类关系,通过implements关键字来实现
//注意java类是单继承,而接口不限,我们一般先继承再实现
class Inter4Impl implements Inter4{
    @Override
    public void save() {
        System.out.println("稍等正在保存中");
    }
    @Override
    public void delete() {
        System.out.println("稍等....正在删除中");
    }
    @Override
    public void update() {
        System.out.println("客官马上就更新好了");
    }
    @Override
    public void find() {
        System.out.println("小二正在马不停蹄的查询");
    }
}