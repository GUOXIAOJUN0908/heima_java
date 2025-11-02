package Method;

import java.util.Random;
import java.util.Scanner;
// 这个练习的难度,估计可以卡掉60%的人,老师在这里会创建多个方法,然后调用
// 双色球抽奖, 思路生成中奖号码,用户抽取号码,两者匹配;
// 红球范围1-33; 篮球1-16
// 然后判断中奖号码对应的规则:
// 6+1 1000万;6+0 500万;5+1 3000元; 5+0 or 4+1  200元;4+0 or 3+1 10元; 2+1 or 1+1 or 0+1 5元
public class Exercise12 {
    public static void main(String[] args) {
        int[] number1 = createNumber();
        for(int j=0;j<number1.length;j++){
            System.out.print(number1[j]+" ");
        }
        System.out.println();
        // 让用户输入彩票号码
        int[] number2 = PurchaseNumber();
        for(int j=0;j<number2.length;j++){
            System.out.print(number2[j]+" ");
        }
        // 接下来就是对两组数据进行判断,从而判断中奖规则
        int redCount = 0;
        int blueCount = 0;
        for(int j=0;j<number2.length-1;j++){
            for(int k=0;k<number1.length-1;k++){
                if(number1[j]==number2[k]){
                    redCount++;
                }
            }
        }
        if(number2[6]==number1[6]){
            blueCount++;
        }
        System.out.println("The red count is "+redCount);
        System.out.println("The blue count is "+blueCount);
        if(redCount==6 && blueCount==1){
            System.out.println("恭喜你中奖1000万");
        }else if(redCount==6 && blueCount==0){
            System.out.println("恭喜你中奖500万");
        }else if(redCount==5 && blueCount==1){
            System.out.println("恭喜你中奖3000元");
        }else if((redCount==5 && blueCount==0)||(redCount==4 && blueCount==1)){
            System.out.println("恭喜你中奖200元");
        }else if((redCount==4 && blueCount==0)||(redCount==3 && blueCount==1)){
            System.out.println("恭喜你中奖10元");
        }else if((redCount==2 && blueCount==1)||(redCount==1 && blueCount==1)||(redCount==0 && blueCount==1)){
            System.out.println("恭喜你中奖5元");
        }
    }
    // 这里的难点是如何 实现红球数字不重复
    public static int[] createNumber(){
        int[] arr = new int[7]; //这是静态初始化
        // 2.随机生成数组并添加到数组中,注意红球不能重复,篮球可以和红球重复
        Random rand = new Random();
        for(int i=0;i<arr.length-1;){

            int num = rand.nextInt(33)+1;
            boolean flag = contains(arr,num);
            if(!flag){
                arr[i]=num;
                i++; //这里是代码的精髓
            }

        }
        int blueNumber = rand.nextInt(16)+1;
        arr[6] = blueNumber;
        return arr;
    }
    public static boolean contains(int[] arr,int a){
        for (int j : arr) {
            if (j == a) {
                return true;
            }
        }
        return false;

    }
    public static int[] PurchaseNumber(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        // 这里有两个难点,1是判断红球范围 2是不能输入重复
        // 分篮球和红球来操作吧
        for(int i=0;i<arr.length-1;){
            System.out.println("Please enter the first 6 number you want to purchase: ");
            int number = sc.nextInt();
            if (number >=1 && number <=33 && !contains(arr,number)) {
                arr[i] = number;
                i++;

            }else {
                System.out.println("Please inter an int between 1 to 33");
            }

        }
        while (true){
            System.out.println("Please enter the 7th number you want to purchase: ");
            int lastNumber = sc.nextInt();
            if (lastNumber>=1 && lastNumber<=16){
                arr[6]  = lastNumber;
                break;
            }else {System.out.println("Please inter an int between 1 to 16");}

        }
        return arr;

    }
}
