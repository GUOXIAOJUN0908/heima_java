package Method;
// 二维数组,难点在于打印,因为用到了双层循环
public class Exercise13 {
    public static void main(String[] args) {
        // 静态初始化
//
        int[][] arr2 = {{1,2,3,4},{5,6,7,8}};
        // 动态初始化
        int[][] arr = new int[6][6];
        // 打印数组元素
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
