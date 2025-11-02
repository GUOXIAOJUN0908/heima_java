package Method;

import java.util.Random;
import java.util.Scanner;

// 6个评委打分(0-100), 去掉一个最高,一个最低,然后求平均分
public class Exercise9 {
    public static void main(String[] args) {
        // 键盘录入分数
        Scanner input = new Scanner(System.in);
        // 控制台输出请录入分数的语句
        int[] score = new int[6];
        for (int i = 1; i <= 6; i++) {
            score[i - 1] = nums(input, i);

        }
        input.close();
        int max1 = Max(score);
        System.out.println(max1);
        int min1 = Min(score);
        System.out.println(min1);
        System.out.println(average(score));


//        while(true){
//            System.out.print("请评委2录入分数: ");
//            int num2 = input.nextInt();
//            if(num2>=0 && num2<=100){
//                break;
//            }else {System.out.print("请评委2 输入0-100之间的数字");}
//
//        }

    }

    public static int nums(Scanner input, int a) {
        while (true) {
            System.out.print("请评委" + a + "录入分数: ");
            int num = input.nextInt();
            if (num >= 0 && num <= 100) {
                return num;
            } else {
                System.out.print("请评委" + a + " 输入0-100之间的数字");
            }

        }

    }

    public static int Max(int[] array1) {
        int temp = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (temp <= array1[i]) {
                temp = array1[i];
            }
        }
        return temp;
    }

    public static int Min(int[] array1) {
        int temp = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (temp >= array1[i]) {
                temp = array1[i];
            }
        }
        return temp;
    }

    public static double average(int[] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];

        }
        sum = sum - Min(array1) - Max(array1);
        return (double) sum / (array1.length - 2);
    }

}


