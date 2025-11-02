package Method;

import java.util.Random;

// 随机抽奖,难点在于 需要判断已经抽的奖项,不可以再抽
// 奖金风机2,588,888,1888,5888
// 目前为止 最喜欢的代码,没有之一!!!!!!!!!!!!!!
public class Exercise11 {
    public static void main(String[] args) {
        // 1.定义奖池
        int[] arr = {2,588,888,1888,5888};
        Random rand = new Random();

        // 2.定义用于存储抽奖的结果
        int[] newArr = new int[arr.length];
        // 3. 抽奖
        for (int i = 0; i <5;) {
            int r =  rand.nextInt(5);
            // 获取奖项
            int prize = arr[r];
            // 判断奖项是否存在,如果存在,继续抽取,否则,抽奖成功
            boolean flag = contains(newArr,prize);
            if(!flag){
                newArr[i]=prize;
                i++; // 擦!!这是什么神奇的操作, 只有有效抽取才i++, 那么无效抽取 不会收到5次的限制
            }


        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

    }
    // 判断price是否存在
    public static boolean contains(int[] arr,int price) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price) {
                return true;
            }
        }
        return false;
    }
}


