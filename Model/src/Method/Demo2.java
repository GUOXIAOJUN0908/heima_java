package Method;

import java.util.Scanner;

// 带参数的方法; 用户输入两个数字,然后计算和
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字: ");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字: ");
        int b = sc.nextInt();
        sum(a,b);

    }
    public static void sum(int a,int b){


        System.out.println(a+b);
    }
}
