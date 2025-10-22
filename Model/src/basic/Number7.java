package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 在指定范围内 逢7 或者 7的倍数 跳过
public class Number7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int end = sc.nextInt();
        sc.close();
        int digit=0;
        for (int i = 1; i <= end; i++) {
            // 这个代码的问题是在while循环中把i给修改了
//            while(i>0){
//                digit = i%10;
//                if(digit==7){
//                    continue;
//                }
//                i=i/10;
//            }
            //添加临时变量存储 i的各个位数的数字
            int temp = i;
            List<Integer> d = new ArrayList<>();
            while (temp > 0) {
                digit = temp % 10;
                d.add(digit);
                temp /= 10;

            }

            if(i%7==0 || d.contains(7)){
                continue;
            }
            System.out.println(i);
        }
    }
}
