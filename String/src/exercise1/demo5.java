package exercise1;

import java.util.Scanner;

// 字符串反转
public class demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = input.next();
        String str1 = new String("");
        for (int i = str.length()-1; i >= 0; i--) {
            str1 += str.charAt(i);


        }
        System.out.println(str1);
    }
}
