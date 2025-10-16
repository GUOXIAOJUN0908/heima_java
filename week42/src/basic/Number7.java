package basic;

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

            while(i>0){
                digit =  i%10;
                if(digit==7){
                    continue;
                }
                i=i/10;
            }
            if(i%7==0){
                continue;
            }
            System.out.print(i);
        }
    }
}
