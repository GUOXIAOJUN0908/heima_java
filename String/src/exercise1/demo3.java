package exercise1;

import java.util.Scanner;

// 录入一个字符串,使用程序实现在控制台遍历该字符串
public class demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = input.next();
        // 进行遍历
        for(int i=0;i<str.length();i++){
            // chatAt方法
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
