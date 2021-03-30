package cn.tedu.api.day15;

import java.util.LinkedList;

//本类用于测试LinkedList链表
public class Test6_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //添加数据
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙悟净");
        list.add("唐三藏");
        list.add("八部天龙");
        System.out.println(list);
        //3.1自行测试从Collection继承过来的方法
        //测试LinkedList特有方法
        list.addFirst("黑熊精");//添加到首元素
        list.addLast("蜘蛛精");//添加到末尾元素
        System.out.println(list);
        System.out.println(list.getFirst());//获取首元素
        System.out.println(list.getLast());//获取末尾元素
        System.out.println(list.removeFirst());//成功返回首元素,但已移除
        System.out.println(list.removeLast());//成功返回尾元素,但已移除
        System.out.println(list);

        //其他测试
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("三国演义");
        list2.add("红楼梦");
        list2.add("西游记");
        list2.add("水浒传");
        System.out.println(list2);
        //查询系列
        System.out.println(list2.element());//三国演义    获取但不移出首个元素
        System.out.println(list2.peek());
        System.out.println(list2.peekFirst());
        System.out.println(list2.peekLast());//获取但不移除尾元素

        //新增系列
        System.out.println(list2.offer("玄界之门"));//新增元素,追加在尾部
        System.out.println(list2.offerFirst("凡人修仙传"));//新增元素,插入头部
        System.out.println(list2.offerLast("魔天记"));//新增元素,插入到尾部
        System.out.println(list2);
        //移出系列
        System.out.println(list2.poll());//删除元素,删除头部元素
        System.out.println(list2.pollFirst());//获取并移除此集合头节点,成功移出返回被移除元素,若为空,返回null
        System.out.println(list2.pollLast());//获取并移除此集合尾节点,成功移出返回被移出元素,若为空,返回null
        System.out.println(list2);

    }
}
