package exercise1;

import java.util.Scanner;

// 同济大写字母;小写字母;以及数字 出现的次数
public class demo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.next();
        // 统计--计数器思想
        int ocount1=0;
        int ocount2=0;
        int ocount3=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                ocount1++;
            }else if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                ocount2++;
            }else if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                ocount3++;
            }

        }
        System.out.println("小写字母"+ocount1);
        System.out.println("大写字母"+ocount2);
        System.out.println("数字"+ocount3);
    }
}
