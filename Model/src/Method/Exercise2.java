package Method;
// 用方法求一个数组的最大值
public class Exercise2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        Max(array1);
    }
    // 方法不在main方法中
    public static void Max(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp<array[i]) {
                temp = array[i];
            }

        }
        System.out.println(temp);
    }
}
