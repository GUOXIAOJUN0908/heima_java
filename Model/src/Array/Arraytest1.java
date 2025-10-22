package Array;
// 需求 生成一个1到10的数组;遍历数组;如果奇数乘以2;如果偶数除以2
public class Arraytest1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<array1.length;i++){
            if(array1[i]%2==0){
                array1[i]=array1[i]*2;
            }else {
                array1[i]=array1[i]/2;
            }

        }
        // java如何打印数组的元素
        for(int i:array1){
            System.out.println(i);

        }
        }
    }
