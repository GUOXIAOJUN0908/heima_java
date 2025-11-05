package exercise1;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str1 = sc.next();
        String str2 = "abc";
        // 地址值不一样, 比较内容需要用 equal
        System.out.println(str1==str2);
    }
}
