package basic;

import java.util.Scanner;

// 质树: 大于1 & 只能被1和它本身整除
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n;
        while(true){
            n =  sc.nextInt();
            if(n>=2){
                break;
            }else{System.out.println("Please enter a number greater than 2");}
        }
        //判断是否为质数,这里我的想法是只要能别2或者3整除
        if(n>3 && (n%2==0 ||n%3==0)){
            System.out.println("Not Prime Number");
        }else{System.out.println("Prime Number");}

    }
}
