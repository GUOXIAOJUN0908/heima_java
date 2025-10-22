package Method;
// 在同一行,实现打印一个数组的内容
public class Exercise1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        printArray(array1);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
