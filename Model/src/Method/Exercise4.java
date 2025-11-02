package Method;

import java.util.ArrayList;

// 从规定的索引起始位置,copy数组的值,到一个新的数组
public class Exercise4 {
    public static void main(String[] args) {
        int[] array3 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> x = Match1(array3,2,4);
        for(int a:x){
            System.out.println(a);
        }
    }
    public static ArrayList<Integer> Match1(int[] array1,int i,int j){
        // 这里需要用动态方法 初始化数组,要不然无法用add 方法添加元素
        //int[] array2={};
        ArrayList<Integer> array2 = new ArrayList<>();
        for(int k=0;k<array1.length;k++){
            if(k<=j){    if(array1[k]<=i){
                continue;
            }else{array2.add(array1[k]);}
            }else{break;}
        }
        return array2;

    }
    // 还有一种写法
}
