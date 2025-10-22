package Array;

import java.util.Random;

// 动态生成数组,50以内,用随机数生成; 统计所有比平均数小的数据;
public class SumArray {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random rand = new Random();
        int sum = 0;
        int avg;
        for (int i = 0; i < array1.length-1; i++) {
            array1[i] = rand.nextInt(10);
            sum += array1[i];
            System.out.println(array1[i]);
        }
        System.out.println("The sum is "+sum);
        avg = sum/array1.length;
        int count = 0;
        for (int i = 0; i < array1.length-1; i++) {
            if (array1[i] < avg) {
                count++;
            }
        }
        System.out.println("The average is "+avg);
        System.out.println("The number of digits below than avg is "+count);
    }
}
