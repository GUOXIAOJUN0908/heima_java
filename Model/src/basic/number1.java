package basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        while(true){
            System.out.println("Enter a number: ");
            n=sc.nextInt();
            if (n>=100){
                break;
            }else {
                System.out.println("pls enter a number greater than 100");
            }

        }
        // 获取digit num并存入数组
        List<Integer> list = new ArrayList<Integer>();
        int digit;
        // 这里用if 为什么会报错哦
        while(n>0){
            digit=n%10;
            list.add(digit);
            n = n/10;
        }
        System.out.println(list);
        int l = list.size()/2;
        int lengh = list.size();
        int count=0;
        // 初始化,条件,递增
        // 还有一种判断方法,就是只要有一个不等于 就返回false
        for (int i=0;i<l;i++){
                if(Objects.equals(list.get(i), list.get(lengh -1- i))){
                    count++;
                }

            }
        if(count==l){
            System.out.println("True");
        }else{ System.out.println("False");}
        }

    }

// 还有一个办法,将digit number reverse
// 然后再比较是否相等