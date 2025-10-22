package Array;
// 需求: 实现数组首尾值互换
// 思路: 中间变量tem 存储数组, 用首尾两个变量控制,进行交换,停止的条件是i==j
public class ChangeOrder {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};


        int i=0, j=array1.length-1;
        while(i<j){
            int temp = array1[i];
            array1[i]=array1[j];
            array1[j]=temp;
            i++;
            j--;
        }



        for(int v:array1){
            System.out.println(v);
        }
    }
}
