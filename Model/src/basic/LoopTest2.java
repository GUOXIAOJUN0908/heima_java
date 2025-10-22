package basic;

import java.util.Scanner;

// 需求: 大于2的整数,计算并返回平方根;保留整数部分,去掉小数部分;
//public class LoopTest2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a;
//        while(true){
//            System.out.println("Enter number: ");
//            a = scan.nextInt();
//            if(a>2){
//                break;
//            }else {
//                System.out.println("Pls enter a number greater than 2");
//            }
//
//        }
//        System.out.println(a+"的平方根是"+(a*a));
//
//    }
//}

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int j = 1;
        for(;j<a;j++){
            if(j*j==a){
                System.out.println(a+"平方根是"+j);
                break;
            }else if(j*j>a){
                System.out.println(a+"平方根的整数部分是"+(j-1));
                break;
            }
        }

    }
}