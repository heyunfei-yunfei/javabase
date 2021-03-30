package day09;
//求用户输入的阶乘
public class Test6_Recursion {
    public static void main(String[] args) {
       int t =  f(5);
        System.out.println(t);
    }
    /*递归两要素:总结规律 最简问题*/
    public static int f(int n) {
        if(n==1){//最简单问题
            return 1;
        }else {
            return n * f(n - 1);
        }
    }
}
