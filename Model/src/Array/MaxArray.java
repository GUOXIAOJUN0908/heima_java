package Array;
// 需求: 已知数组 10;20;30;40, 然后求最大值
public class MaxArray {
    public static int  getMax(int[] array){

        int max = array[0];
        for (int i=0;i<array.length-1;i++) {
            // 下面代码还可以简化
//            if(max>array1[i+1]){
//                max = max;
//            }else{max = array1[i+1];}
//        }
            if(max<array[i+1]){
                max = array[i+1];
            }
      }
       return max;
}
    public static int getMin(int[] array){
        int min = array[0];
        for (int i=0;i<array.length-1;i++) {
            // 下面代码还可以简化
//            if(max>array1[i+1]){
//                max = max;
//            }else{max = array1[i+1];}
//        }
            // 这里用到的快捷键是 alt+j 实现多选
            if(min>array[i+1]){
                min = array[i+1];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(getMax(array));
        System.out.println(getMin(array));
    }




}
