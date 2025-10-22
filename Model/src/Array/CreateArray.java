package Array;

public class CreateArray {
    public static void main(String[] args) {
        // 静态初始化,完整格式, 但是这种太麻烦,要用简化形式
        // 数组创建以后,长度就不能改变了
        int[] array = new int[]{1,2,3,4};
        int[] array2 = {5,6,7};
        String[] array3 = {"A","B","C"};
        double[] array4 = {1.1,2.2,3.3};
        System.out.println("Array is created");
        for (int i : array) {
            System.out.println(i);
        }

    }
}
