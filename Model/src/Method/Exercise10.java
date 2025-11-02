package Method;

import java.util.ArrayList;
import java.util.Scanner;

// 数字加密
// 加密规则: 每位数+5; 取余; 反转
public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        // 获取每个位树上的digit number
        while (n > 0) {
            int y = n % 10;
            arr.add(y);
            n = n / 10;
        }
        for (int i : arr) {
            System.out.println(i);

        }
        for (int i = 0; i < arr.size(); i++) {
            int v = arr.get(i);
            arr.set(i, (v + 5) % 10);
        }
        for (int i : arr) {
            System.out.println(i);

        }
        int newnum = 0;
        for (int i = 0, j = arr.size()-1; i < arr.size(); i++, j--) {
            newnum += arr.get(i) * (int) Math.pow(10, j);


        }
        System.out.println(newnum);
        // 解密
        int[] x = new int[arr.size()];
        int z = 0;
        while(newnum != 0) {

            x[z]= newnum % 10;
            z +=1;
            newnum = newnum / 10;
        }
        for (int i=0;i<x.length;i++) {
            if(x[i]>=5 && x[i]<=9) {
                x[i] =x[i]-5;
            }else{x[i]=x[i]+10-5;}
        }
        for (int i:x){
            System.out.println(i);

        }
        int final_out =0;
        for(int i=0;i<x.length;i++){
            final_out = final_out*10+x[i];
        }
        System.out.println(final_out);
    }

}
